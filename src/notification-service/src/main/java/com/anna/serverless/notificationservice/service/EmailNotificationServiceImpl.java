package com.anna.serverless.notificationservice.service;

import com.anna.serverless.notificationservice.enumeration.NotificationType;
import com.anna.serverless.notificationservice.model.dto.NotificationData;
import com.anna.serverless.notificationservice.service.strategies.MessageProviderStrategy;
import lombok.AllArgsConstructor;
import org.simplejavamail.MailException;
import org.simplejavamail.api.email.Email;
import org.simplejavamail.api.mailer.config.TransportStrategy;
import org.simplejavamail.mailer.MailerBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.simplejavamail.api.mailer.Mailer;

import java.util.Map;

@Service
@AllArgsConstructor
public class EmailNotificationServiceImpl implements EmailNotificationService {

    @Value("${email.host}")
    private String host;

    @Value("${email.port}")
    private int port;

    @Value("${email.sending.disable}")
    private boolean sendingDisable;

    @Value("${email.user}")
    private String user;

    @Qualifier("messageProviderStrategyMap")
    private Map<NotificationType, MessageProviderStrategy> messageProviderStrategyMap;


    private Mailer createMailBuilder() {
        return MailerBuilder
                .withSMTPServerHost(host)
                .withSMTPServerPort(port)
                .withTransportStrategy(TransportStrategy.SMTP)
                .withTransportModeLoggingOnly(sendingDisable)
                .withDebugLogging(true)
                .buildMailer();
    }

    @Override
    public void sendEmailNotification(NotificationData data) {
        Mailer mail = createMailBuilder();
        MessageProviderStrategy messageProvider = messageProviderStrategyMap.get(data.getCsNotificationType());
        if (messageProvider != null) {
            Email email = messageProvider.getEmail(user, data);
            try {
                mail.sendMail(email, false);
            } catch (MailException e) {
                e.printStackTrace();
            }
        }
    }
}
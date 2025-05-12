package vti.accountmanagement.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class MessageUtil { //NOSONAR

    public static MessageSource messageSource;

    public static String getMessage(String key) {
        return messageSource.getMessage(key, null, Locale.getDefault());
    }

    @Autowired
    public MessageUtil(MessageSource injectedMessageSource) {
        MessageUtil.messageSource = injectedMessageSource;
    }

    public static String getMessage(String key, Object[] args) {
        return messageSource.getMessage(key, args, Locale.getDefault());
    }
}

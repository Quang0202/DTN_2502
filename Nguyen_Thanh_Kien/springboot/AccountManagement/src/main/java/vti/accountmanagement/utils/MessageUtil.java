package vti.accountmanagement.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

@Component
public class MessageUtil {

    private static MessageSource messageSource;

    @Autowired
    private MessageUtil(MessageSource messageSource) {
        MessageUtil.messageSource = messageSource;
    }

    public static String get(String key) {
        return messageSource.getMessage(key, null, LocaleContextHolder.getLocale());
    }
}

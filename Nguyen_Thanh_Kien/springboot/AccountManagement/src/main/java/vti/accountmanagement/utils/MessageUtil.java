package vti.accountmanagement.utils;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class MessageUtil {

    private final MessageSource injectedMessageSource;
    private static MessageSource messageSource;

    @Autowired
    public MessageUtil(MessageSource injectedMessageSource) {
        this.injectedMessageSource = injectedMessageSource;
    }
//    sau khi ịnect xong thi gan vao
    @PostConstruct
    private void init() {
        MessageUtil.messageSource = this.injectedMessageSource;
    }

    public static String getMessage(String key) {
        return messageSource.getMessage(key, null, Locale.getDefault());
    }

    public static String getMessage(String key, Object[] args) {
        return messageSource.getMessage(key, args, Locale.getDefault());
    }
}

package vti.accountmanagement.utils;

import org.springframework.security.core.context.SecurityContextHolder;
import vti.accountmanagement.model.CustomUserDetails;

public class SecurityUtil {

    // Ngăn việc khởi tạo class
    private SecurityUtil() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static CustomUserDetails getCurrentUser() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof CustomUserDetails userDetails) {
            return userDetails;
        }
        throw new IllegalStateException("Current user is not authenticated");
    }

    public static String getCurrentUsername() {
        return getCurrentUser().getUsername();
    }

    public static int getCurrentAccountId() {
        return getCurrentUser().getAccountId();
    }

    public static String getCurrentFullName() {
        return getCurrentUser().getFullName();
    }
}

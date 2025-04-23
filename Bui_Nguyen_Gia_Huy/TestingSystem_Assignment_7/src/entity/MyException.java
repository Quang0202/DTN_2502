package entity;

import java.io.Serializable;
import java.time.LocalDateTime;

public class MyException extends Exception implements Serializable {
    private String message;
    private String reason;
    private StackTraceElement[] stackTrace;
    private LocalDateTime time;

    public MyException(String message, String reason, StackTraceElement[] stackTrace) {
        super(message);
        this.message = message;
        this.reason = reason;
        this.stackTrace = stackTrace;
        this.time = LocalDateTime.now();
    }

    public String getReason() {
        return reason;
    }

    public LocalDateTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "message='" + message + '\'' +
                ", reason='" + reason + '\'' +
                ", time=" + time +
                '}';
    }
}

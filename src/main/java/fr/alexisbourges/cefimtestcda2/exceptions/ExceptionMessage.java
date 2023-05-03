package fr.alexisbourges.cefimtestcda2.exceptions;

import java.time.LocalDateTime;

public class ExceptionMessage {
    private LocalDateTime date;
    private String request;
    private String message;
    private String exceptionName;

    public ExceptionMessage(String request, String message, String exceptionName) {
        this(LocalDateTime.now(), request, message, exceptionName);
    }
    public ExceptionMessage(LocalDateTime date, String request, String message, String exceptionName) {
        this.date = date;
        this.request = request;
        this.message = message;
        this.exceptionName = exceptionName;
    }


    public LocalDateTime getDate() {
        return date;
    }

    public String getRequest() {
        return request;
    }

    public String getMessage() {
        return message;
    }

    public String getExceptionName() {
        return exceptionName;
    }
}

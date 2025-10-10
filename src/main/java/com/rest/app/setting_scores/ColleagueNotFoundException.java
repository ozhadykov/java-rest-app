package com.rest.app.setting_scores;

public class ColleagueNotFoundException extends RuntimeException {
    public ColleagueNotFoundException(String message) {
        super(message);
    }

    public ColleagueNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ColleagueNotFoundException(Throwable cause) {
        super(cause);
    }
}

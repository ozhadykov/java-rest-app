package com.rest.app.setting_scores.rest;

public class ColleagueErrorResponse {
    private String message;
    private int code;
    private long timestamp;

    public ColleagueErrorResponse() {
    }

    public ColleagueErrorResponse(String message, int code, long timestamp) {
        this.message = message;
        this.code = code;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}

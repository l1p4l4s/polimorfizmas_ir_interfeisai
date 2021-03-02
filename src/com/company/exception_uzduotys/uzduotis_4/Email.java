package com.company.exception_uzduotys.uzduotis_4;

public class Email {
    private String receiver;
    private String subject;
    private String body;
    private EmailState state;

    public String getReceiver() {
        return this.receiver;
    }

    public EmailState getState() {
        return this.state;
    }

    public void setState(EmailState state) {
        this.state = state;
    }

    public Email(String receiver, String subject, String body) {
        this.state = EmailState.NEW;
        this.receiver = receiver;
        this.subject = subject;
        this.body = body;
    }
}

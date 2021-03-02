package com.company.exception_uzduotys.uzduotis_4;

import java.util.List;

public class EmailSender {

    protected void sendEmail(List<Email> emailList) throws InterruptedException {
        NetworkConnector networkConnector = new NetworkConnector();
        for (Email email : emailList) {
            while (true) {
                if (email.getState() == EmailState.NEW) {
                    System.out.println("Sending email to " + email.getReceiver());
                }
                if (email.getState() == EmailState.REPEATING_SEND) {
                    System.out.println("Redelivering email to " + email.getReceiver());
                    Thread.sleep(3000);
                }
                if (email.getState() == EmailState.SENT) {
                    System.out.println("Email to " + email.getReceiver() + " delivered" + "\n");
                    break;
                }
                try {
                    networkConnector.send(email);
                    email.setState(EmailState.SENT);
                } catch (NoNetworkException e) {
                    System.out.println("Failed to send an email to " + email.getReceiver() + "\n");
                    email.setState(EmailState.REPEATING_SEND);
                }
            }
        }
    }
}

package org.hupo.psi.mi.psicquic.stats.config;

/**
 * Created by Maximilian Koch (mkoch@ebi.ac.uk).
 */
public class EmailConfig {
    private String senderEmail;
    private String mailSubjectPrefix;
    private String recipients;

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public String getMailSubjectPrefix() {
        return mailSubjectPrefix;
    }

    public void setMailSubjectPrefix(String mailSubjectPrefix) {
        this.mailSubjectPrefix = mailSubjectPrefix;
    }

    public String getRecipients() {
        return recipients;
    }

    public void setRecipients(String recipients) {
        this.recipients = recipients;
    }

    @Override
    public String toString() {
        return "EmailConfig{" +
                "senderEmail='" + senderEmail + '\'' +
                ", mailSubjectPrefix='" + mailSubjectPrefix + '\'' +
                ", recipients=" + recipients +
                '}';
    }
}

package org.hupo.psi.mi.psicquic.stats.config;

/**
 * Created by Maximilian Koch (mkoch@ebi.ac.uk).
 */
public class GoogleConfig {
    private String spreadsheetKey;
    private String p12FilePath;
    private String p12FileName;
    private String accountID;

    public String getSpreadsheetKey() {
        return spreadsheetKey;
    }

    public void setSpreadsheetKey(String spreadsheetKey) {
        this.spreadsheetKey = spreadsheetKey;
    }

    public String getP12FilePath() {
        return p12FilePath;
    }

    public void setP12FilePath(String p12FilePath) {
        this.p12FilePath = p12FilePath;
    }

    public String getP12FileName() {
        return p12FileName;
    }

    public void setP12FileName(String p12FileName) {
        this.p12FileName = p12FileName;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    @Override
    public String toString() {
        return "GoogleConfig{" +
                "spreadsheetKey='" + spreadsheetKey + '\'' +
                ", p12FilePath='" + p12FilePath + '\'' +
                ", p12FileName='" + p12FileName + '\'' +
                ", accountID='" + accountID + '\'' +
                '}';
    }
}

package org.hupo.psi.mi.psicquic.stats;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.testing.http.FixedClock;
import com.google.api.client.util.Clock;
import com.google.gdata.client.spreadsheet.SpreadsheetService;
import com.google.gdata.data.spreadsheet.SpreadsheetEntry;
import com.google.gdata.data.spreadsheet.SpreadsheetFeed;
import com.google.gdata.data.spreadsheet.WorksheetEntry;
import com.google.gdata.data.spreadsheet.WorksheetFeed;
import uk.ac.ebi.intact.google.spreadsheet.SpreadsheetFacade;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

/**
 * Created by anjali on 11/01/16.
 */
public class GoogleSpreadSheetConnectionTest {

    public static void main(String[] args) {
        HttpTransport httpTransport = new NetHttpTransport();
        SpreadsheetService service = new SpreadsheetService("PsicquicStatsCollector");
        /*JacksonFactory jsonFactory = new JacksonFactory();
        String[] SCOPESArray = {"https://spreadsheets.google.com/feeds", "https://spreadsheets.google.com/feeds/spreadsheets/private/full", "https://docs.google.com/feeds"};
        final List SCOPES = Arrays.asList(SCOPESArray);
        try {
            GoogleCredential credential = new GoogleCredential.Builder()
                    .setTransport(httpTransport)
                    .setJsonFactory(jsonFactory)
                    .setServiceAccountId("990046751060-pj8g78qclbd70q9nskorudpkbgmnp8an@developer.gserviceaccount.com")
                    .setServiceAccountScopes(SCOPES)
                    .setServiceAccountPrivateKeyFromP12File(new File("/home/anjali/Documents/delete/258140740a4b.p12"))

                   // .setClock(new FixedClock(40000))
                    .build();

           credential.refreshToken();
                          //  credential.setExpiresInSeconds(1l);
                           // credential.setExpiresInSeconds(10l);
            service.setOAuth2Credentials(credential);
            System.out.println("clock is"+credential.getAccessToken());
            System.out.println("Credential Expires ::"+credential.getExpiresInSeconds());*/
                       // URL SPREADSHEET_FEED_URL;
                      //  SPREADSHEET_FEED_URL = new URL("https://spreadsheets.google.com/feeds/spreadsheets/private/full");
                        /* SpreadsheetFeed feed = service.getFeed(SPREADSHEET_FEED_URL, SpreadsheetFeed.class);
                       List<SpreadsheetEntry> spreadsheets = feed.getEntries();
                        System.out.println("spreadsheet size"+ spreadsheets.size());
                        SpreadsheetEntry spreadsheet = spreadsheets.get(0);
                        System.out.println("Name of editing spreadsheet: " + spreadsheets.get(0).getTitle().getPlainText());
                        System.out.println("ID of SpreadSheet: " + 0);*/


             //   final SpreadsheetEntry  spreadsheetEntry = SpreadsheetFacade.getSpreadsheetWithKey(service, "1ClqWSKrlATQQvJH2tXsa64rAKQXYOaTMj7XTOc1Dx0U");
            /*final URL worksheetFeedUrl = spreadsheetEntry.getWorksheetFeedUrl();

            final WorksheetFeed wsf = service.getFeed( worksheetFeedUrl, WorksheetFeed.class );*/
        try {
            GoogleSpreadSheetConnectionTest googleSpreadSheetConnectionTest=new GoogleSpreadSheetConnectionTest();
            SpreadsheetEntry spreadsheetEntry1=googleSpreadSheetConnectionTest.createSpreadSheetEntry(service);
            GoogleSpreadSheetConnectionTest.test(spreadsheetEntry1,service);
            Thread.sleep(65000*60);

            SpreadsheetEntry spreadsheetEntry2=googleSpreadSheetConnectionTest.createSpreadSheetEntry(service);
            GoogleSpreadSheetConnectionTest.test(spreadsheetEntry2,service);
            System.out.println("I am here!!!!");

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public static void test(SpreadsheetEntry spreadsheetEntry,SpreadsheetService service){
        try {
            final URL worksheetFeedUrl = spreadsheetEntry.getWorksheetFeedUrl();
            System.out.println("spreadsheetEntry.getWorksheetFeedUrl()"+spreadsheetEntry.getWorksheetFeedUrl());
            final WorksheetFeed wsf = service.getFeed(worksheetFeedUrl, WorksheetFeed.class);
            for ( WorksheetEntry worksheetEntry : wsf.getEntries() ) {
                final String name = worksheetEntry.getTitle().getPlainText();
                System.out.println("Name is "+name);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    private SpreadsheetEntry createSpreadSheetEntry(SpreadsheetService service) throws Exception{
        String[] SCOPESArray = {"https://spreadsheets.google.com/feeds", "https://spreadsheets.google.com/feeds/spreadsheets/private/full", "https://docs.google.com/feeds"};
        final List SCOPES = Arrays.asList(SCOPESArray);
        HttpTransport httpTransport = new NetHttpTransport();
        JacksonFactory jsonFactory = new JacksonFactory();


            GoogleCredential credential = new GoogleCredential.Builder()
                    .setTransport(httpTransport)
                    .setJsonFactory(jsonFactory)
                    .setServiceAccountId("990046751060-pj8g78qclbd70q9nskorudpkbgmnp8an@developer.gserviceaccount.com")
                    .setServiceAccountScopes(SCOPES)
                    .setServiceAccountPrivateKeyFromP12File(new File("/home/anjali/Documents/delete/258140740a4b.p12"))

                    // .setClock(new FixedClock(40000))
                    .build();
            credential.refreshToken();
            service.setOAuth2Credentials(credential);
            System.out.println("Credential Expires ::"+credential.getExpiresInSeconds());
            SpreadsheetEntry  spreadsheetEntry = SpreadsheetFacade.getSpreadsheetWithKey(service, "1ClqWSKrlATQQvJH2tXsa64rAKQXYOaTMj7XTOc1Dx0U");
            return spreadsheetEntry;
    }
}

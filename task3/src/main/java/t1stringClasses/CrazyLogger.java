package t1stringClasses;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CrazyLogger {
    private StringBuilder stringBuilder;
    private SimpleDateFormat dateFormat;

    public CrazyLogger() {
        stringBuilder = new StringBuilder();
        dateFormat = new SimpleDateFormat("dd-mm-YYYY : hh-mm");
    }

    public String getDateFormat() {
        return dateFormat.format(new Date());
    }


    public void addLog(String string) {
        stringBuilder.append(getDateFormat()).append(" - ").append(string).append("\n");

    }


    public String getLog() {
        return stringBuilder.toString();
    }

    public String getLog(String string) {
        return searchLog(string);
    }

    private String searchLog(String str) {
        String[] notes = stringBuilder.toString().split("\n");
        for (String string : notes) {
            if (string.contains(str)) {
                return string;
            }
        }
        return null;
    }
}

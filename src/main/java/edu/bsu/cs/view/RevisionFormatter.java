package edu.bsu.cs.view;

import edu.bsu.cs.model.Revision;

import java.time.format.DateTimeFormatter;


public final class RevisionFormatter {

    public String format(Revision revision) {
        return String.format("At %s, a change by %s",
                DateTimeFormatter.ISO_INSTANT.format(revision.timestamp),
                revision.name);
    }

    public String alternativeFormat(Revision revision) {
        String[] timestamp = DateTimeFormatter.ISO_INSTANT.format(revision.timestamp)
                .split("[-T:Z]", 6);
        String year = timestamp[0];
        String month = timestamp[1];
        String day = timestamp[2];
        String hour;
        String AMorPM;
        int i = Integer.parseInt(timestamp[3]);
        if (i > 12){
            hour = String.valueOf(i-12);
            AMorPM = "pm";
        } else {
            hour = timestamp[3];
            AMorPM = "am";
        }
        String minute = timestamp[4];
        //String second = timestamp[5];
        String name = revision.name;
        return String.format("On %s/%s/%s at %s:%s %s, a revision was made by %s",
                month, day, year, hour, minute, AMorPM, name);
    }

}

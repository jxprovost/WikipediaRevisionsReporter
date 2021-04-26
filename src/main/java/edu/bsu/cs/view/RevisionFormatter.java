package edu.bsu.cs.view;

import edu.bsu.cs.model.Formatter;
import edu.bsu.cs.model.Revision;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class RevisionFormatter implements Formatter {

    public String format(Revision revision) {
        return String.format("At %s, a change by %s",
                DateTimeFormatter.ISO_INSTANT.format(revision.timestamp),
                revision.name);
    }

    @Override
    public String alternativeFormat(Revision revision) {
        String dateTime = DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' HH:mm:ss")
                .withZone(ZoneId.systemDefault()).format(revision.timestamp);
        return String.format("On %s, a revision was made by %s.", dateTime, revision.name);
    }

}

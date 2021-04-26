package edu.bsu.cs.model;

import java.io.IOException;

public interface Formatter {
    String format(Revision revision) throws Exception;
    String alternativeFormat(Revision revision) throws IOException;


}

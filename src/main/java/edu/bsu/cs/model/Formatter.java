package edu.bsu.cs.model;

import java.io.IOException;

public interface Formatter {
    String alternativeFormat(Revision revision) throws IOException;
}

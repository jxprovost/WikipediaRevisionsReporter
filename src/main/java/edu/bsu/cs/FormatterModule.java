package edu.bsu.cs;

import com.google.inject.AbstractModule;
import edu.bsu.cs.model.Formatter;
import edu.bsu.cs.view.RevisionFormatter;

import java.time.Duration;


public class FormatterModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Formatter.class).to(RevisionFormatter.class);
        bind(Duration.class).toInstance(Duration.ofSeconds(2));
    }
}

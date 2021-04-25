package edu.bsu.cs;

import com.google.inject.AbstractModule;
import edu.bsu.cs.model.Runtime;
import edu.bsu.cs.view.RevisionFormatter;

import java.time.Duration;

public class RuntimeModule extends AbstractModule {

    @Override
    protected void configure() {
        //bind(Runtime.class).to(RevisionFormatter.class); // How am I suppose to do this???
        bind(Duration.class).toInstance(Duration.ofSeconds(2));
    }
}

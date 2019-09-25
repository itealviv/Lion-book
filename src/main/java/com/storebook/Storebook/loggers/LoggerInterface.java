package com.storebook.Storebook.loggers;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface LoggerInterface<T> {
    Level DIAG = Level.forName("DIAG", 50);

    static Logger getLogger(String name) {
        return LogManager.getLogger(name);
    }
}

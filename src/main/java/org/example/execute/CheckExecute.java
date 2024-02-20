package org.example.execute;

import org.example.dto.Check;
import org.example.handlers.ServerHandler;

public class CheckExecute extends ServerHandler {
    @Override
    public Check execute() {
        return new Check("server check");
    }
}

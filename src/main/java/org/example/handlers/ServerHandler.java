package org.example.handlers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public abstract class ServerHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String json = "";

        try {
            json = new ObjectMapper().writeValueAsString(this.execute());
            exchange.getResponseHeaders().add("Content-Type", "application/json");
            exchange.sendResponseHeaders(200, json.length());
        } catch (Exception e){
            exchange.sendResponseHeaders(500, json.length());
        } finally {
            OutputStream os = exchange.getResponseBody();
            os.write(json.getBytes());
            os.close();
        }
    }

    public abstract Object execute() throws Exception;
}

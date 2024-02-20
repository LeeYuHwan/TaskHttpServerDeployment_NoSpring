package org.example;

import com.sun.net.httpserver.HttpServer;
import org.example.execute.CheckExecute;
import org.example.execute.SumExecute;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        run();
    }

    static void run() throws IOException {
        HttpServer httpServer = HttpServer.create(new InetSocketAddress(5678), 0);

        httpServer.createContext("/", new CheckExecute());
        httpServer.createContext("/sum", new SumExecute());

        httpServer.setExecutor(null);
        httpServer.start();
    }
}
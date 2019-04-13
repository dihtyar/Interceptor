package com.company;

public class ConsoleLoggingHandler implements Handler {

    final Handler handler;

    public ConsoleLoggingHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void handle(String request) {
        System.out.println(request);
        if(handler != null){
            handler.handle(request);
        }
    }
}

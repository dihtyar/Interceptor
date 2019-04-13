package com.company;

public class CharacterVarifyHandler implements Handler {

    final Handler handler;

    public CharacterVarifyHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void handle(String request) {
        if (request.contains("-")) {
            throw new RuntimeException("Invalid request !!!");
        }
        if (handler != null) {
            handler.handle(request);
        }
    }
}

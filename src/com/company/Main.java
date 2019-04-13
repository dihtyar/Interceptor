package com.company;

public class Main {

    public static void main(String[] args) {
        String validRequest = "inputData";
        String invalidRequest = "input-Data";

        Handler handler = new CharacterVarifyHandler(new ConsoleLoggingHandler(null));
        handler.handle(validRequest);
        handler.handle(invalidRequest);
    }
}

package com.bridgelabz;

public class MoodAnalyzer {
    String message;

    public MoodAnalyzer(Object o) {
        super();
        this.message = message;
    }

    public String analyseMood() {
        try {
            String words[] = message.split(" ");
            if (words[3].equalsIgnoreCase("happy"))
                return "SAD";
            return "HAPPY";
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}

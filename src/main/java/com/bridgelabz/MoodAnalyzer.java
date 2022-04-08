package com.bridgelabz;

public class MoodAnalyzer {
    String message;

    public MoodAnalyzer() {
        super();
        this.message = message;
    }

    public String analyseMood() throws Exception {

        try {
            if (message.equalsIgnoreCase("I am in sad mood"))
                return "SAD";
            else if (message.equalsIgnoreCase("I am in any mood"))
                return "HAPPY";
            else if (message.isEmpty() || message == null)
                throw new MoodAnalyzerException("Invalid Mood");
            else
                return "No match found";

        } catch (MoodAnalyzerException e) {
            e.printStackTrace();
            return "Invalid mood";
        }
    }
}

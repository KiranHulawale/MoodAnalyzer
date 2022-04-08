package com.bridgelabz;

public class MoodAnalyzer {
    String message;

    public MoodAnalyzer() {
        this.message = message;
    }

    public String analyseMood(String message) {
        String words[] = message.split(" ");
        if (words[3].equalsIgnoreCase("sad"))
            return "SAD";
        return "HAPPY";
    }
    
     public static void main(String[] args) {
        MoodAnalyzer mood = new MoodAnalyzer();
        System.out.println(mood.analyseMood("I am in sad mood ") );
    }
}

    


package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;

class MoodAnalyzerTest {

    void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("SAD",mood);
    }

    void givenMessage_WhenHappy_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Any Mood");
        String mood  = moodAnalyzer.analyseMood();
        Assert.assertEquals("Happy",mood);
    }
}
package com.bridgelabz;
import org.junit.Assert;

class MoodAnalyzerTest {

    void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("I am in sad mood ");
        Assert.assertEquals("SAD",mood);
    }

    void givenMessage_WhenHappy_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood  = moodAnalyzer.analyseMood("I am in sad mood ");
        Assert.assertEquals("Happy",mood);
    }
}
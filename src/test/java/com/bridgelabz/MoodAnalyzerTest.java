package com.bridgelabz;
import org.junit.Assert;

class MoodAnalyzerTest {

    void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("SAD",mood);
    }

    void givenMessage_WhenHappy_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood  = moodAnalyzer.analyseMood();
        Assert.assertEquals("Happy",mood);
    }
}
package com.example.chaitanyadeshpande.vachan;

public class ReadingLevelSelectionUtility {


    private static ReadingLevelSelectionUtility instance;

    String readingLevel;

    private ReadingLevelSelectionUtility() {
    }

    public static ReadingLevelSelectionUtility getInstance() {
        if (instance == null) {
            instance = new ReadingLevelSelectionUtility();
        }
        return instance;
    }

    public String getReadingLevel() {
        return readingLevel;
    }

    public void setReadingLevel(String readingLevel) {
        this.readingLevel = readingLevel;
    }


}

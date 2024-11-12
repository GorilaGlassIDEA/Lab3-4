package org.example.description;

public abstract class Lie {
     String getSpeech(String speech){
        return speech;
    };
    public abstract String sayLie(String lie);
    public abstract String sayTruth(String lie);
    void isQuestion(String speech, boolean lie){
        if (lie) sayLie(speech);
        else sayTruth(speech);
    };

}

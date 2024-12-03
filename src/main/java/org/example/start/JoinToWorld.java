package org.example.start;

import org.example.data.models.FullPerson;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class JoinToWorld {
    //TODO класс объединяющий модели и окружение так
    // же реализующий все родственные связи и логику
    // взаимодействия персонажей
    private ArrayList<FullPerson> fullPeople;

    public JoinToWorld(ArrayList<FullPerson> fullPeople) {
        this.fullPeople = fullPeople;
    }

    public void goSayAboutNear() {
        try {
            if (fullPeople.size() >= 2) {
                fullPeople.getFirst().goActions(fullPeople);
            }
        } catch (Exception e) {
            System.err.println("Сначала добавьте Action персонажу! Исключение в классе " + getClass() + " exception " + e);
        }
    }

    public void setFullPeople(ArrayList<FullPerson> fullPeople) {
        this.fullPeople = fullPeople;
    }
}

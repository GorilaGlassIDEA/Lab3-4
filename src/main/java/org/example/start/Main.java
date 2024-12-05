package org.example.start;

import org.example.data.models.FullPerson;

import org.example.data.person.Husband;
import org.example.data.person.MainPerson;
import org.example.data.person.Mother;


import java.util.ArrayList;
import java.util.List;

public class Main {

    static JoinToWorld newWorld;
    static ArrayList<FullPerson> fullPeople;

    public static void main(String[] args) {
        MainPerson Dora = new MainPerson("Дорагли");
        Mother DoraMother = new Mother("Мама Дорагли");
        Husband DoraHusband = new Husband("Муж дорагли");

        fullPeople = new ArrayList<>(List.of(
                Dora,
                DoraMother,
                DoraHusband
        ));


        newWorld = new JoinToWorld(fullPeople);
        try {
            newWorld.go();
        }catch (NullPointerException e){
            System.err.println("Не все персонажи созданы! Исключение NullPointerException");
        }

    }

}

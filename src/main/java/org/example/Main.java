package org.example;

import org.example.data.models.FullPerson;

import org.example.data.person.Husband;
import org.example.data.person.MainPerson;
import org.example.data.person.Mother;

import org.example.start.JoinToWorld;


import java.util.ArrayList;
import java.util.List;

public class Main {

    static JoinToWorld newWorld;
    static ArrayList<FullPerson> fullPeople;

    public static void main(String[] args) {
        MainPerson Dora = new MainPerson("Doragly");
        Mother DoraMother = new Mother("Mother");
        Husband DoraHusband = new Husband("Husband");

        fullPeople = new ArrayList<>(List.of(
                Dora,
                DoraMother,
                DoraHusband
        ));

        newWorld = new JoinToWorld(fullPeople);
        newWorld.goSayAboutNear();

    }

}

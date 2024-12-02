package org.example;

import org.example.data.models.FullPerson;
import org.example.data.models.Mood;
import org.example.data.person.MainPerson;
import org.example.description.ActionEnum;
import org.example.start.JoinToWorld;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    static JoinToWorld newWorld;
    static ArrayList<FullPerson> fullPeople = new ArrayList<FullPerson>();
    public static void main(String[] args) {
        MainPerson Dora = new MainPerson(
                "женщина",
                "Doragly",
                18,
                Mood.NOT);
        Dora.move(ActionEnum.SHOW_TO);

        fullPeople.add(Dora);
        fullPeople.add(Dora);
        newWorld = new JoinToWorld(fullPeople);

    }

}

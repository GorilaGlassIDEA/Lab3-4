package org.example;

import org.example.data.models.Mood;
import org.example.data.person.MainPerson;

public class Main {

    public static void main(String[] args) {
        MainPerson Dora = new MainPerson(
                "женщина",
                "Doragly",
                18,
                Mood.NOT
        );
        Dora.move("показывала дворец");
        Dora.move("лгала про мужа");
        Dora.move("говорила что ее муж на войне");
        Dora.action();
    }

}

package org.example.data.person;

import org.example.action.SimpleAction;
import org.example.data.models.FullPerson;
import org.example.data.models.Mood;

import java.util.ArrayList;

public class MainPerson extends FullPerson {


    public MainPerson(String gender, String name, int age, Mood mood) {
        super(gender, name, age, mood);
    }

    @Override
    public void see() {
        System.out.println("и вдруг она увидела ");
    }

    @Override
    public void breath() {
        System.out.println("она тяжело вздохнула");
    }

    @Override
    public void action() {
        System.out.println("Она сразу решила сделать: ");
        for (String action : getActions()) {
            System.out.print(action + ", ");
        }
        clearActions();
    }

    @Override
    public void move(String obj) {
        setActions(obj);
    }

    @Override
    public void anotherAction(String obj) {

    }
}

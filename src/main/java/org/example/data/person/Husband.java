package org.example.data.person;

import org.example.data.models.Contact;
import org.example.data.models.FullPerson;
import org.example.data.models.Mood;
import org.example.description.ActionEnum;

import java.util.ArrayList;

public abstract class Husband extends FullPerson {
    public Husband(String gender, String name, int age, Mood mood, ArrayList<ActionEnum> actionEnums) {
        super(gender, name, age, mood, actionEnums, Contact.PARTNER);
    }


    @Override
    public void contactWith(FullPerson person1, FullPerson person2) {
        super.contactWith(person1, person2);
    }

    @Override
    public void move(ActionEnum obj) {

    }


    @Override
    public void anotherAction(ActionEnum obj) {

    }

    @Override
    public void printAction(ActionEnum action) {
        super.printAction(action);
    }
}

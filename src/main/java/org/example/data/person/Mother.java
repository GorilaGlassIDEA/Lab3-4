package org.example.data.person;

import org.example.data.models.Contact;
import org.example.data.models.FullPerson;
import org.example.data.models.Mood;
import org.example.data.models.Relatives;
import org.example.description.ActionEnum;

import java.util.ArrayList;

public abstract class Mother extends FullPerson {

    public Mother(String gender, String name, int age, Mood mood, ArrayList<ActionEnum> actionEnums) {
        super(gender, name, age, mood, actionEnums, Contact.NOT_EXIST);
    }
}

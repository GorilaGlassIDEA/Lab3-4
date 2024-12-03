package org.example.data.person;

import org.example.data.DataArrays;
import org.example.data.models.Contact;
import org.example.data.models.FullPerson;
import org.example.data.models.Mood;
import org.example.description.ActionEnum;

import java.util.ArrayList;
import java.util.Arrays;

public class Husband extends FullPerson {
    public Husband(String name) {
        super(name, Contact.NOT_EXIST);
        setActionEnums(DataArrays.husbandAction);
    }

    @Override
    public void move(ActionEnum obj) {
        setActions(obj);
    }

    @Override
    public void goActions(ArrayList<FullPerson> whoseActionNext) {
        try {
            FullPerson unknownPerson = getPersonCompareThis(whoseActionNext, this);
            printAction(getActionEnums().getFirst());
            System.out.println(unknownPerson.getName());
            removeFirstAction();
            unknownPerson.goActions(whoseActionNext);
        } catch (NullPointerException e) {
            System.err.println(this.getName() + " больше нет действий");
        }
    }

}

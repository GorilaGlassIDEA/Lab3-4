package org.example.data.person;

import org.example.data.DataArrays;
import org.example.data.models.Contact;
import org.example.data.models.FullPerson;
import org.example.description.ActionEnum;

import java.util.ArrayList;

public class Mother extends FullPerson {

    public Mother(String name) {
        super(name, Contact.NOT_EXIST);
        setActionEnums(DataArrays.motherAction);
    }

    @Override
    public void goActions(ArrayList<FullPerson> whoseActionNext) {
        try {
            FullPerson unknownPerson = getPersonCompareThis(whoseActionNext, this);
            printAction(getActionEnums().getFirst());
            System.out.println(unknownPerson.getName());
            removeFirstAction();
            unknownPerson.goActions(whoseActionNext);
        } catch (Exception e) {
            System.err.println(this.getName() + " больше нет действий");
        }
    }

    @Override
    public void move(ActionEnum actionEnum) {

    }
}

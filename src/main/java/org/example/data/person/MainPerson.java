package org.example.data.person;

import org.example.data.DataArrays;
import org.example.data.models.Contact;
import org.example.data.models.FullPerson;

import org.example.description.ActionEnum;


import java.util.ArrayList;


public class MainPerson extends FullPerson {

    public MainPerson(String name) {
        super(name, Contact.NOT_EXIST);

        setActionEnums(DataArrays.mainAction);
    }

    @Override
    public Contact getContact(FullPerson anotherPerson) {
        if (anotherPerson instanceof Mother || anotherPerson instanceof Sister)
            return Contact.RELATIVES;
        if (anotherPerson instanceof Husband)
            return Contact.PARTNER;
        else return Contact.NOT_RELATIVES;
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
//            unknownPerson.goActions(whoseActionNext);
        } catch (NullPointerException e) {
            System.err.println(this.getName() + " больше нет действий");
        }
    }



}


package org.example.data.person;

import org.example.data.DataArrays;
import org.example.data.properties.Contact;
import org.example.data.models.FullPerson;
import org.example.data.action.ActionEnum;

import java.util.ArrayList;


public class Husband extends FullPerson {
    public Husband(String name) {
        super(name);
        setActionEnums(DataArrays.husbandAction);
    }

    @Override
    public String getContact(FullPerson anotherPerson) {
//        if (anotherPerson instanceof MainPerson)
//            return Contact.PARTNER;
//        if (anotherPerson instanceof Mother || anotherPerson instanceof Sister)
//            return Contact.RELATIVES;
//        else return Contact.NOT_EXIST;
        return "TODO";
    }

    @Override
    public void move(ActionEnum obj) {
        setActions(obj);
    }

    @Override
    public FullPerson goActions() {
        printAction(getAllActions().removeFirst());
        return this;
    }

}

package org.example.data.person;

import org.example.data.DataArrays;
import org.example.data.models.Contact;
import org.example.data.models.FullPerson;
import org.example.description.ActionEnum;

import java.util.ArrayList;


public class Husband extends FullPerson {
    public Husband(String name) {
        super(name, Contact.NOT_EXIST);
        setActionEnums(DataArrays.husbandAction);
    }

    @Override
    public Contact getContact(FullPerson anotherPerson) {
        if (anotherPerson instanceof MainPerson)
            return Contact.PARTNER;
        if (anotherPerson instanceof Mother || anotherPerson instanceof Sister)
            return Contact.RELATIVES;
        else return Contact.NOT_EXIST;
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

    public void edit(ArrayList<FullPerson> whoseActionNext) {
        // это переписывание методе goActions для работы в любом классе

    }

}

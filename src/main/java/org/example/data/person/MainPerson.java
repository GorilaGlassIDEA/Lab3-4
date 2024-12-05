package org.example.data.person;

import org.example.data.DataArrays;
import org.example.data.properties.Contact;
import org.example.data.models.FullPerson;
import org.example.data.action.ActionEnum;

public class MainPerson extends FullPerson {
    public MainPerson(String name) {
        super(name);
        setActionEnums(DataArrays.mainAction);
    }

    @Override
    public String getContact(FullPerson anotherPerson) {
//        if (anotherPerson instanceof Mother || anotherPerson instanceof Sister)
//            return Contact.RELATIVES;
//        if (anotherPerson instanceof Husband)
//            return Contact.PARTNER;
//        else return Contact.NOT_RELATIVES;
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


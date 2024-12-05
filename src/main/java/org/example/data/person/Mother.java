package org.example.data.person;

import org.example.data.DataArrays;
import org.example.data.properties.Contact;
import org.example.data.models.FullPerson;
import org.example.data.action.ActionEnum;

public class Mother extends FullPerson {

    public Mother(String name) {
        super(name);
        setActionEnums(DataArrays.motherAction);
    }

    @Override
    public String getContact(FullPerson anotherPerson) {
        if (anotherPerson instanceof MainPerson || anotherPerson instanceof Sister)
            return "родственника";
        if (anotherPerson instanceof Husband)
            return "мужа своей дочери";
        else return "не родственника";
    }

    @Override
    public FullPerson goActions() {
        printAction(getAllActions().removeFirst());
        return this;
    }
    @Override
    public void move(ActionEnum actionEnum) {

    }
}

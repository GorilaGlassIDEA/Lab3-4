package org.example.data.person;

import org.example.Main;
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
    public Contact getContact(FullPerson anotherPerson) {
        if (anotherPerson instanceof MainPerson || anotherPerson instanceof Sister)
            return Contact.RELATIVES;
        else return Contact.NOT_RELATIVES;
    }

    @Override
    public void goActions(ArrayList<FullPerson> whoseActionNext) {
        try {
            FullPerson unknownPerson = getPersonCompareThis(whoseActionNext, this);
            printAction(ActionEnum.SEE_WHOSE);
            removeFirstAction();
            if (unknownPerson instanceof MainPerson)
                unknownPerson.goActions(whoseActionNext);
            if (unknownPerson instanceof Husband) {
                //TODO продумать логику взаимодействия дальше
            }
//            unknownPerson.goActions(whoseActionNext);
        } catch (Exception e) {
            System.err.println(" больше нет действий");
        }
    }

    @Override
    public void printAction(ActionEnum action) {

        if (action == ActionEnum.SEE_WHOSE) {
            System.out.print(this.getName() + " Дорагли ");
            super.printAction(ActionEnum.INTERESTED_IN);
            System.out.println("мужа дочери");
        } else {
            super.printAction(action);
        }
    }

    //"Mother Doragly было очень интересно увидеть Husband."
    @Override
    public void move(ActionEnum actionEnum) {

    }
}

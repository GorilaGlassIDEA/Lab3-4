package org.example.data.person;

import org.example.action.SimpleAction;
import org.example.data.models.Contact;
import org.example.data.models.FullPerson;
import org.example.data.models.Mood;
import org.example.description.ActionEnum;

import java.util.ArrayList;
import java.util.Arrays;

public class MainPerson extends FullPerson {

    public MainPerson(String gender, String name, int age, Mood mood) {
        super(gender, name, age, mood, Contact.NOT_EXIST);
        ArrayList<ActionEnum> actions = new ArrayList<>(Arrays.asList(
                ActionEnum.SHOW_TO,
                ActionEnum.LIE_WHO,
                ActionEnum.SAY_THAT,
                ActionEnum.CANT_LIE,
                ActionEnum.SAY_TRUE
        ));
        setActionEnums(actions);
    }


    @Override
    public void move(ActionEnum obj) {
        setActions(obj);
    }

    @Override
    public void goActions(FullPerson whoseActionNext) {
        try {
            printAction(getActionEnums().getFirst());
            /** TODO: реализовать запуск другого действия
             whoseActionNext персонажа путем получения с помощью метода getActionEnums
             его действий
             **/
        } catch (NullPointerException e) {
            System.err.println(this.getName() + " больше нет действий");
        }
    }


    @Override
    public void anotherAction(ActionEnum obj) {

    }

    @Override
    public void printAction(ActionEnum action) {
        super.printAction(action);
    }


    @Override
    public void setConnect(FullPerson person) {
        if (person instanceof Mother || person instanceof Sister)
            person.setContact(Contact.RELATIVES);
        else if (person instanceof Husband)
            person.setContact(Contact.PARTNER);
        else
            person.setContact(Contact.NOT_RELATIVES);
    }

    @Override
    public ArrayList<FullPerson> getConnect() {
        return null;
    }
}


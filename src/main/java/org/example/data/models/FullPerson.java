package org.example.data.models;

import org.example.action.SimpleAction;
import org.example.description.ActionEnum;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

/**
 * Помимо обязательных методов из {@link DefaultAction} (Interface)
 * данный класс добавляет обязательные поля для кадого персонажа
 */
public abstract class FullPerson implements DefaultAction, SimpleAction {
    private final String name;
    private ArrayList<ActionEnum> actionEnums = new ArrayList<>();
    private Contact contact = Contact.NOT_EXIST;
    //TODO помимо обязательных методов из EmptyPerson (Interface)
    // данный класс добавляет обязательные поля для кадого персонажа

    public FullPerson(String name, ArrayList<ActionEnum> actionEnums, Contact contact) {
        this.name = name;
        this.actionEnums = actionEnums;
        this.contact = contact;
    }

    public FullPerson(String name, Contact contact) {
        this.name = name;
        this.contact = contact;
    }

    public ArrayList<ActionEnum> getActionEnums() {
        return actionEnums;
    }

    public void removeFirstAction() {
        actionEnums.removeFirst();
    }

    public FullPerson getPersonCompareThis(ArrayList<FullPerson> otherPerson, FullPerson thisPerson) {
        //проверяет массив с персонажами и возращает рандомного персонажа, который не равен
        // персонажу описанному в текущем классе
        int randomIndexPerson = new Random().nextInt(0, otherPerson.size());
        if (otherPerson.size() > 1) {
            while (otherPerson.indexOf(thisPerson) == randomIndexPerson)
                randomIndexPerson = new Random().nextInt(0, otherPerson.size());
            return otherPerson.get(randomIndexPerson);
        }
        return null;
    }

    public void setActionEnums(ArrayList<ActionEnum> actionEnums) {
        this.actionEnums = actionEnums;
    }
    public void setActions(ActionEnum action) {
        actionEnums.add(action);
    }

    public String getName() {
        return name;
    }

}

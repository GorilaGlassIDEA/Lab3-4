package org.example.data.models;

import org.example.action.SimpleAction;
import org.example.data.DataArrays;
import org.example.data.person.MainPerson;
import org.example.data.person.Mother;
import org.example.description.ActionEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Помимо обязательных методов из {@link DefaultAction} (Interface)
 * данный класс добавляет обязательные поля для кадого персонажа
 * Массив {@code relatives} это структура данных с иерархией родственных
 * связе, где на нулевом индексе находится список родссвтенников,
 * на втором список партнеров, на третем список остальных людей
 */
public abstract class FullPerson implements DefaultAction, SimpleAction {
    private final String name;
    private ArrayList<ActionEnum> actionEnums = new ArrayList<>();

    private Contact contact;
    // Удалить contact
    //TODO помимо обязательных методов из EmptyPerson (Interface)
    // данный класс добавляет обязательные поля для кадого персонажа


    public FullPerson(String name, Contact contact) {
        this.name = name;
        this.contact = contact;
    }

    public FullPerson(String name) {
        this.name = name;
//        setContact(DataArrays.relativesDoragly);
    }

    public abstract Contact getContact(FullPerson anotherPerson);
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

package org.example.data.models;

import org.example.data.location.Location;
import org.example.data.action.StringActionCreate;
import org.example.data.action.SimpleAction;
import org.example.data.action.ActionEnum;

import java.util.ArrayList;

/**
 * Помимо обязательных методов из {@link StringActionCreate} (Interface)
 * данный класс добавляет обязательные поля для кадого персонажа
 * Массив {@code relatives} это структура данных с иерархией родственных
 * связе, где на нулевом индексе находится список родссвтенников,
 * на втором список партнеров, на третем список остальных людей
 */
public abstract class FullPerson implements StringActionCreate, SimpleAction{
    private String name;
    private Location location;
    private ArrayList<ActionEnum> actionEnums = new ArrayList<>();



    public FullPerson(String name) {
        this.name = name;
    }

    public abstract String getContact(FullPerson anotherPerson);

    public ArrayList<ActionEnum> getAllActions() {
        return actionEnums;
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

    public void setName(String name){
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }
    protected abstract void printLocation();

    public void setLocation(Location location) {
        this.location = location;
    }
}

package org.example.data.models;

import org.example.action.SimpleAction;
import org.example.description.ActionEnum;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Помимо обязательных методов из {@link EmptyPerson} (Interface)
 * данный класс добавляет обязательные поля для кадого персонажа
 */
public abstract class FullPerson implements EmptyPerson, SimpleAction, Relatives {
    private String gender;
    private String name;
    private int age;
    private Mood mood;
    private ArrayList<ActionEnum> actionEnums = new ArrayList<>();
    private ArrayList<FullPerson> relativesConnect = new ArrayList<>();
    private Contact contact;
    //TODO помимо обязательных методов из EmptyPerson (Interface)
    // данный класс добавляет обязательные поля для кадого персонажа

    public FullPerson(String gender, String name, int age, Mood mood, ArrayList<ActionEnum> actionEnums, Contact contact) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.mood = mood;
        this.actionEnums = actionEnums;
        this.contact = contact;
    }

    public FullPerson(String gender, String name, int age, Mood mood, Contact contact) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.mood = mood;
        this.contact = contact;
    }

    public ArrayList<ActionEnum> getActionEnums() {
        return actionEnums;
    }

    public ArrayList<FullPerson> getRelativesConnect() {
        return relativesConnect;
    }

    public boolean removeFirstRelativesConnect() {
        try {
            relativesConnect.removeFirst();
        } catch (NullPointerException e){
            System.err.println("Список родственников пуст! Исключение в классе " + e);
        }
        return true;
    }

    public void addRelativesConnect(FullPerson addPerson) {
        relativesConnect.add(addPerson);
    }

    public void clearRelativesConnect() {
        relativesConnect.clear();
    }

    public void setActionEnums(ArrayList<ActionEnum> actionEnums) {
        this.actionEnums = actionEnums;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public void setActions(ActionEnum action) {
        actionEnums.add(action);
    }

    public String getGender() {
        return gender;
    }

    public void clearActions() {
        actionEnums.clear();
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Mood getMood() {
        return mood;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

}

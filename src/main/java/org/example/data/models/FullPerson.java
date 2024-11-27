package org.example.data.models;

import org.example.action.SimpleAction;

import java.util.ArrayList;

/**
 *     Помимо обязательных методов из {@link EmptyPerson} (Interface)
 *     данный класс добавляет обязательные поля для кадого персонажа
 */
public abstract class FullPerson implements EmptyPerson, SimpleAction{
    private String gender;
    private String name;
    private int age;
    private Mood mood;
    private ArrayList<String> actions = new ArrayList<>();
    //TODO помимо обязательных методов из EmptyPerson (Interface)
    // данный класс добавляет обязательные поля для кадого персонажа

    public FullPerson(String gender, String name, int age, Mood mood) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.mood = mood;
    }

    public ArrayList<String> getActions() {
        return actions;
    }

    public void setActions(String action) {
        actions.add(action);
    }

    public String getGender() {
        return gender;
    }
    public void clearActions(){
        actions.clear();
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

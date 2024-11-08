package org.example.model;

public class PersonModel {
    private String gender;
    private int age;
    private String name;
    private int height;

    public PersonModel(String gender, int age, String name, int height) {
        this.gender = gender;
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}


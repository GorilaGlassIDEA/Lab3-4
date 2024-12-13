package org.example.start;

import org.example.data.models.FullPerson;
import org.example.data.person.Husband;
import org.example.data.person.MainPerson;
import org.example.data.person.Mother;
import org.example.data.person.Sister;

import java.util.ArrayList;
import java.util.NoSuchElementException;


/**
 * Класс объединяющий всех персонажей а так
 * же реализующий все родственные связи и логику
 * взаимодействия персонажей
 **/
public class JoinToWorld {

    private final ArrayList<FullPerson> allPeople;
    private Mother mother;
    private Husband husband;
    private MainPerson mainPerson;
    private Sister sister;

    public JoinToWorld(ArrayList<FullPerson> allPerson) {
        this.allPeople = allPerson;
    }

    public void go() throws NullPointerException {
        whoIsThisPerson();
        try {
            System.out.printf(mother.getName() + " ");
            mother.goActions().goActions();
            System.out.print(mother.getContact(husband) + "\n" + mother.getName() + " ");
            mother.goActions();
            System.out.print(", ");
            mother.goActions();
            System.out.println(" " + mother.getContact(sister) + " " + sister.getName());
            System.out.print(mainPerson.getName() + " ");
            mainPerson.goActions();
            System.out.print("своим " + mainPerson.getContact(mother) + " и \n" + mainPerson.getContact(sister) + " свой ");
            mainPerson.printLocation();
            System.out.print(". ");
            System.out.print(mainPerson.getContact(mother) + " и " + mainPerson.getContact(sister) + " ");
            mother.goActions().goActions();
            System.out.print(mainPerson.getContact(husband) + " " + mainPerson.getName() + ", но она ");
            mainPerson.goActions().goActions();
            System.out.print(husband.getName() + " ");
            husband.printLocation();
            System.out.print(".\nНо поскольку " + mainPerson.getName() + " ");
            mainPerson.goActions();
            System.out.println(mother.getName() + " и " + sister.getName());
            mother.goActions();
            System.out.print("у " + mainPerson.getName() + " ");
            mainPerson.goActions();
            System.out.print(" они ");
            sister.goActions().goActions();
            System.out.print(mainPerson.getName());
            System.out.print(".\nОна ");
            mainPerson.goActions();



        } catch (NoSuchElementException e) {
            System.err.println("Вызов несуществующего действия");
        }
    }

    public void whoIsThisPerson() {
        for (FullPerson person : allPeople) {
            if (person instanceof Mother)
                mother = (Mother) person;
            if (person instanceof Husband)
                husband = (Husband) person;
            if (person instanceof Sister)
                sister = (Sister) person;
            else if (person instanceof MainPerson) {
                mainPerson = (MainPerson) person;
            }
        }
    }
}


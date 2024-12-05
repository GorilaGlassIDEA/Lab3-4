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

    private ArrayList<FullPerson> allPeople;
    private Mother mother;
    private Husband husband;
    private MainPerson mainPerson;
    private Sister sister;

    public JoinToWorld(ArrayList<FullPerson> allPerson) {
        this.allPeople = allPerson;
    }

    public void go() throws NullPointerException{
        whoIsThisPerson();
        try {
            System.out.printf(mother.getName() + " ");
            mother.goActions().goActions();
            System.out.print(mother.getContact(husband));
        } catch (NoSuchElementException e) {
            System.err.println("Вызов несуществующего действия");
        }
        String result = "Mother Doragly было очень интересно увидеть Husband." +
                " Она сразу же отправилась в путь, захватив с " +
                "собой Sister. Doragly с большим удовольствием показывала им свой дворец." +
                " Когда же Relatives интересовались ее Husband, Doragly лгала им, как могла, говоря, " +
                "то Husband на War, то на Hunter, то просто Ill. Но поскольку она была очень" +
                " правдивой девушкой, то как следует врать не умела, и мать с сестрой решили, " +
                "что у нее вообще нет мужа. Они принялись выпытывать у нее правду. " +
                "Не выдержав их расспросов, Дорагли рассказала им всю правду.\n";

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


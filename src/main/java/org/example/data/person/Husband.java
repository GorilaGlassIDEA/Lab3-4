package org.example.data.person;

import org.example.data.DataArrays;
import org.example.data.location.Location;
import org.example.data.models.FullPerson;
import org.example.data.action.ActionEnum;
import java.util.Random;


public class Husband extends FullPerson {
    public Husband(String name) {
        super(name);
        setActionEnums(DataArrays.husbandAction);
        int randInt = new Random().nextInt(1, 4);
        switch (randInt) {
            case 1 -> setLocation(Location.HUNTER);
            case 2 -> setLocation(Location.WAR);
            case 3 -> setLocation(Location.BE_ILL);
        }
    }

    @Override
    public String getContact(FullPerson anotherPerson) {
//        if (anotherPerson instanceof MainPerson)
//            return Contact.PARTNER;
//        if (anotherPerson instanceof Mother || anotherPerson instanceof Sister)
//            return Contact.RELATIVES;
//        else return Contact.NOT_EXIST;
        return "TODO";
    }

    @Override
    public void printLocation() {
        switch (getLocation()){
            case HUNTER -> System.out.print("на охоте");
            case BE_ILL -> System.out.print("на больничном");
            case WAR -> System.out.print("на войне");
            default -> System.err.print("У объекта " + getName() + " не определено местоположение");
        }
    }


    @Override
    public FullPerson goActions() {
        printAction(getAllActions().removeFirst());
        return this;
    }

    @Override
    public void printAction(ActionEnum action) {
        switch (action) {
            case LOOK_AT -> System.out.print("посмотреть на ");
            case SEE_WHOSE -> System.out.print("увидеть ");
            case TRAVEL_TO_FROM -> System.out.print("приехать из ");
            case TRAVEL_FROM_TO -> System.out.print("отправилась в путь");
            case LIE_WHO -> System.out.print("соврать кому-то с именем ");
            case INTERESTED_IN -> System.out.print("было очень интересно ");
            case HEAR_FROM -> System.out.print("услышать от ");
            case SAY_WHO -> System.out.print("сказать тому самому ");
            case DECIDE -> System.out.print("решить именно это ");
            case SHOW_TO -> System.out.print("с большим удовольствием показывала ");
            case KNOW_TRUTH -> System.out.print("узнавать правду у ");
            case SAY_THAT -> System.out.print("сказать что ");
            case CANT_LIE -> System.out.print("не уметь врать ");
            case SAY_TRUE -> System.out.print("сказать правду про ");
            case EXIST -> System.out.print("существовать ");
            case BE_WAR -> System.out.print("быть на войне ");
            case BE_HUNTER -> System.out.print("быть на охоте ");
            case BE_ILL -> System.out.print("быть больным ");
            case TAKE_WITH_U -> System.out.print("захватив с собой");
            default -> {
            }
        }
    }
}

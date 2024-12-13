package org.example.data.person;

import org.example.data.DataArrays;
import org.example.data.location.Location;
import org.example.data.models.FullPerson;
import org.example.data.action.ActionEnum;

public class MainPerson extends FullPerson {
    public MainPerson(String name) {
        super(name);
        setActionEnums(DataArrays.mainAction);
        setLocation(Location.BIG_HOUSE);
    }


    @Override
    public String getContact(FullPerson anotherPerson) {
        if (anotherPerson instanceof Mother)
            return "мама";
        if (anotherPerson instanceof Sister)
            return "сестра";
        if (anotherPerson instanceof Husband)
            return "муж";
        else
            return "прохожий";
    }

    @Override
    public void printLocation() {
        switch (getLocation()){
            case BIG_HOUSE -> System.out.print("дворец");
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
            case TRAVEL_FROM_TO -> System.out.print("отправилась в путь ");
            case LIE_WHO -> System.out.print("лгала, как могла");
            case INTERESTED_IN -> System.out.print("было очень интересно ");
            case HEAR_FROM -> System.out.print("услышать от ");
            case SAY_WHO -> System.out.print("сказать тому самому ");
            case DECIDE -> System.out.print("решить именно это ");
            case SHOW_TO -> System.out.print("с большим удовольствием показывала ");
            case KNOW_TRUTH -> System.out.print("узнавать правду у ");
            case SAY_THAT -> System.out.print(", говоря что ");
            case CANT_LIE -> System.out.print("не умела врать ");
            case SAY_TRUE -> System.out.print("решила рассказать всю правду");
            case EXIST -> System.out.print("существовать ");
            case BE_WAR -> System.out.print("быть на войне ");
            case BE_HUNTER -> System.out.print("быть на охоте ");
            case BE_ILL -> System.out.print("быть больным ");
            case TAKE_WITH_U -> System.out.print("захватив с собой");
            case NOT_BE_HUSBAND -> System.out.print("вообще нет мужа");
            default -> {
            }
        }


    }
}


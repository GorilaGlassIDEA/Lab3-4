package org.example.data.person;

import org.example.data.DataArrays;
import org.example.data.models.FullPerson;
import org.example.data.action.ActionEnum;

public class Mother extends FullPerson {

    public Mother(String name) {
        super(name);
        setActionEnums(DataArrays.motherAction);
    }

    @Override
    public String getContact(FullPerson anotherPerson) {
        if (anotherPerson instanceof MainPerson || anotherPerson instanceof Sister) {
            if (anotherPerson instanceof Sister)
                return "сестру";
            return "родственника";
        }
        if (anotherPerson instanceof Husband)
            return "мужа своей дочери";
        else return "не родственника";
    }

    @Override
    public void printLocation() {
        switch (getLocation()){
            case HUNTER -> System.out.println("на охоте");
            case BE_ILL -> System.out.println("на больничном");
            case WAR -> System.out.println("на войне");
            default -> System.err.println("У объекта " + getName() + " не определено местоположение");
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
            case DECIDE -> System.out.print("решили ");
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
            case KNOW -> System.out.println("узнать про ");
            default -> {
            }
        }
    }
}

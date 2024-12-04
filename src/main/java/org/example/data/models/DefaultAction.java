package org.example.data.models;

import org.example.action.SimpleAction;
import org.example.description.ActionEnum;

//1. Показать дворец
//2. Лгать родственникам
//3. Говорить
//4. Рассказать правду
//5. Выдержка от допроса
//1. Увидеть

//2. Интересоваться
//3. Отправиться в путь (из В->A)
//4. Интересоваться
//5. Решать
//6. Выпытывать правду

/**
 * Обязательный интерфейс любого персонажа, должен наследоваться от всех интерфейсов
 * действий/настроений/локации и тд
 **/
public interface DefaultAction extends SimpleAction {
    default void printAction(ActionEnum action) {

        switch (action) {
            case LOOK_AT -> System.out.print("посмотреть на ");
            case SEE_WHOSE -> System.out.print("увидеть ");
            case TRAVEL_TO_FROM -> System.out.print("приехать из ");
            case TRAVEL_FROM_TO -> System.out.print("поехать к ");
            case LIE_WHO -> System.out.print("соврать кому-то с именем ");
            case INTERESTED_IN -> System.out.print("было очень интересно узнать ");
            case HEAR_FROM -> System.out.print("услышать от ");
            case SAY_WHO -> System.out.print("сказать тому самому ");
            case DECIDE -> System.out.print("решить именно это ");
            case SHOW_TO -> System.out.print("с большим удовольствием показывать ");
            case KNOW_TRUTH -> System.out.print("узнавать правду у ");
            case SAY_THAT -> System.out.print("сказать что ");
            case CANT_LIE -> System.out.print("не уметь врать ");
            case SAY_TRUE -> System.out.print("сказать правду про ");
            case EXIST -> System.out.print("существовать ");
            case BE_WAR -> System.out.print("быть на войне ");
            case BE_HUNTER -> System.out.print("быть на охоте ");
            case BE_ILL -> System.out.print("быть больным ");
            default ->  {}
        }

    }

}

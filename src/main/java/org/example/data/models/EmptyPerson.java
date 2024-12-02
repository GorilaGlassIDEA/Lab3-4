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

public interface EmptyPerson extends SimpleAction {
    //TODO Обязательный интерфейс любого персонажа, долежен наследоваться от всех интерфейсов
    // действий/настроений/локации и тд
    default void printAction(ActionEnum action) {

        switch (action) {
            case LOOK_AT -> System.out.println("посмотреть на ");
            case SEE_WHOSE -> System.out.println("увидеть ");
            case TRAVEL_TO_FROM -> System.out.println("приехать из ");
            case TRAVEL_FROM_TO -> System.out.println("поехать в ");
            case LIE_WHO -> System.out.println("соврать кому-то с именем ");
            case INTERESTED_IN -> System.out.println("интересоваться тем самым ");
            case HEAR_FROM -> System.out.println("услышать от ");
            case SAY_WHO -> System.out.println("сказать тому самому ");
            case DECIDE -> System.out.println("решить именно это ");
            case SHOW_TO -> System.out.println("с большим удовольствием показывать ");

        }

    }

    ; // выполнить действие из SimpleAction (interface)

}

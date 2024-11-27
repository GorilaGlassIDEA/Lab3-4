package org.example.data.models;

import org.example.action.SimpleAction;

import java.util.ArrayList;

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

    void see();
    void breath(); // для сообщения - тяжело вздохнула, например
    void action(); // выполнить действие из SimpleAction (interface)

}

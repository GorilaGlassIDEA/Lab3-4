package org.example.data;

import org.example.data.models.FullPerson;
import org.example.description.ActionEnum;

import java.util.ArrayList;
import java.util.Arrays;

public record DataArrays(FullPerson fullPerson) {
    public static ArrayList<ActionEnum> motherAction = new ArrayList<>(Arrays.asList(
            ActionEnum.SEE_WHOSE,
            ActionEnum.INTERESTED_IN,
            ActionEnum.TRAVEL_FROM_TO,
            ActionEnum.INTERESTED_IN,
            ActionEnum.DECIDE,
            ActionEnum.KNOW_TRUTH));

    public static ArrayList<ActionEnum> husbandAction = new ArrayList<>(Arrays.asList(
            ActionEnum.EXIST,
            ActionEnum.BE_HUNTER,
            ActionEnum.BE_ILL,
            ActionEnum.BE_WAR));

    public static ArrayList<ActionEnum> mainAction = new ArrayList<>(Arrays.asList(
            ActionEnum.SHOW_TO,
            ActionEnum.LIE_WHO,
            ActionEnum.SAY_THAT,
            ActionEnum.CANT_LIE,
            ActionEnum.SAY_TRUE));
    public static ArrayList<ActionEnum> sisterAction = new ArrayList<>(Arrays.asList(
            /* TODO: не заданы действия для sister */
    ));

}

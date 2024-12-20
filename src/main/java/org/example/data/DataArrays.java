package org.example.data;

import org.example.data.models.FullPerson;
import org.example.data.action.ActionEnum;

import java.util.ArrayList;
import java.util.Arrays;

public record DataArrays(FullPerson fullPerson) {
    public static ArrayList<ActionEnum> motherAction = new ArrayList<>(Arrays.asList(
            ActionEnum.INTERESTED_IN,
            ActionEnum.SEE_WHOSE,
            ActionEnum.TRAVEL_FROM_TO,
            ActionEnum.TAKE_WITH_U,
            ActionEnum.INTERESTED_IN,
            ActionEnum.KNOW,
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
            ActionEnum.NOT_BE_HUSBAND,
            ActionEnum.SAY_TRUE));
    public static ArrayList<ActionEnum> sisterAction = new ArrayList<>(Arrays.asList(
            ActionEnum.DECIDE,
            ActionEnum.KNOW_TRUTH
    ));

}

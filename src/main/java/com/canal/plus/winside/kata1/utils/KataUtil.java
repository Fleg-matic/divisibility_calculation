package com.canal.plus.winside.kata1.utils;

import com.canal.plus.winside.kata1.beans.KataBean;
import com.canal.plus.winside.kata1.beans.ReturnBean;

import java.util.Scanner;

public class KataUtil {

    private final KataBean kataBean = new KataBean();
    private final ReturnBean returnBean = new ReturnBean();

    private String isDivisibleBySeven() {
        String result = "";
        int number = kataBean.getNumberBase();
        System.out.println("Dans isDivisibleBySeven, number = " + number);

        while (number > 13) {
            int unitNumber = number - (number / 10) * 10;
            System.out.println("Dans isDivisibleBySeven, unitNumber = " + unitNumber);
            int numberOfDozens = number / 10;
            System.out.println("Dans isDivisibleBySeven, numberOfDozens = " + numberOfDozens);
            number = numberOfDozens - 2 * unitNumber;
            System.out.println("Dans isDivisibleBySeven, number fin = " + number);

            if (number < 0) {
                number = -number;
                System.out.println("Dans isDivisibleBySeven, number if = " + number);
            }
            this.kataBean.setNumber(number);
            number = kataBean.getNumber();
        }

        if ((number == 7) || (number == 0)) {
            result = returnBean.getSpring();
        } else {
            result = returnBean.getEmpty();
        }

        return result;
    }

    private String isDivisibleByEleven() {
        String result = "";
        int number = kataBean.getNumberBase();
        System.out.println("Dans isDivisibleByEleven, number = " + number);

        while (number > 100) {
            int unitNumber = number - (number / 10) * 10;
            System.out.println("Dans isDivisibleByEleven, unitNumber = " + unitNumber);
            int numberOfDozens = number / 10;
            System.out.println("Dans isDivisibleByEleven, numberOfDozens = " + numberOfDozens);
            number = numberOfDozens - unitNumber;
            System.out.println("Dans isDivisibleByEleven, number fin = " + number);

            if (number < 0) {
                number = -number;
                System.out.println("Dans isDivisibleByEleven, number if = " + number);
            }
            this.kataBean.setNumber(number);
            number = kataBean.getNumber();
        }

        switch (number) {
            case 11:
                result = returnBean.getBoot();
                break;
            case 22:
                result = returnBean.getBoot();
                break;
            case 33:
                result = returnBean.getBoot();
                break;
            case 44:
                result = returnBean.getBoot();
                break;
            case 55:
                result = returnBean.getBoot();
                break;
            case 66:
                result = returnBean.getBoot();
                break;
            case 77:
                result = returnBean.getBoot();
                break;
            case 88:
                result = returnBean.getBoot();
                break;
            case 99:
                result = returnBean.getBoot();
                break;
            default:
                result = returnBean.getEmpty();
                break;
        }

        return result;
    }

    public void makeResult() {
        System.out.println("Veuillez entrer le nombre dont vous désirez calculer la divisibilité par 7 et par 11 :\r");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        System.out.println("Vous avez entré : " + i);
        kataBean.setNumberBase(i);
        String seven = isDivisibleBySeven();
        //System.out.println(seven);
        String eleven = isDivisibleByEleven();
        //System.out.println(eleven);
        if (seven.contains("Spring") && !eleven.contains("Boot")) {
            System.out.println(seven);
        } else if (eleven.contains("Boot") && !seven.contains("Spring")) {
            System.out.println(eleven);
        } else if (seven.contains("Spring") && eleven.contains("Boot")) {
            System.out.println(seven + " " + eleven);
        } else {
            System.out.println(returnBean.getEmpty());
        }
    }


}

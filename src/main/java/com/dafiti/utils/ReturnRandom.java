package com.dafiti.utils;


public class ReturnRandom {

    public static String number(){

        int numero = (int)(Math.random()*(99999999-11111111+1)+11111111);
        return String.valueOf(numero);
    }
}

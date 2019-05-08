package com;

import java.util.Date;
import java.lang.Exception;
public class Main {

    public static void main(String[] args) {
        Except.Arif_Except();
        Except.Array_Except();
        try {
            Except.Catches(10);
        } catch (Exception e) {
            System.out.println("Описание исключения: " + e);
        }
        try {
            Except.my_except(5);
        }catch (Except.MyException m) {
            System.out.println("Описание исключения: " + m);
        }
    }
}

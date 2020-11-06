package com.company;

public class Main {

    public static boolean isLeapYear(int year)
    {
        if (year%4 == 0)
        {
            return (year%100 != 0 || year%400 == 0);
        }
        else return false;
    }
    public static boolean isLater(int r, int g, int b)
    {
        
    }

}

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

    public static boolean isLater(int month1, int day1, int year1, int month2, int day2, int year2)
    {
        if (year1 > year2)
        {
            return true;
        }
        else if (year1 == year2 && month1 > month2)
        {
            return true;
        }
        else if (year1 == year2 && month1 == month2 && day1 > day2)
        {
            return true;
        }
        else return false;
    }

    public static String bestMatch(int r, int g, int b)
    {
        if (r == g && r == b)
        {
            return "GRAY";
        }
        else if (r == g && r > b)
        {
            return "YELLOW";
        }
        else if (r == b && r > g)
        {
            return "MAGENTA";
        }
        else if (g == b && g > r)
        {
            return "CYAN";
        }
        else if (r > g && r > b)
        {
            return "RED";
        }
        else if (g > r && g > b)
        {
            return "GREEN";
        }
        else if (b > r && b > g)
        {
            return "BLUE";
        }
        else return "None";
    }

    public static int findBestFit(int size1, int size2, int space)
    {
        int x = 0;
        if (size1 + size2 <= space)
        {
            x = 3;
        }
        else if (size1 + size2 > space && size1 > size2 )
        {
            x = 1;
        }
        else if (size1 + size2 > space && size2 > size1)
        {
            x = 2;
        }
        return x;
    }
}

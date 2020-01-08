package com.example.ch3finalproject;

public class Number{
    int theNumber;
    boolean isTriangular;
    boolean isSquare;

    public Number() {
        isSquare = false;
        isTriangular = false;
    }

    public void check()
    {
        int x=0;
        int triangularNumber = 0;
        int squareNumber ;
        while(x>=0)
        {
            x++;
            triangularNumber=triangularNumber+x;
            squareNumber= x*x;
            if (triangularNumber<=theNumber||squareNumber<=theNumber){
                if (triangularNumber==theNumber)
                {
                    isTriangular = true ;
                }
                if (squareNumber==theNumber)
                {
                    isSquare = true ;
                }

            }
            else
            {
                break;
            }


        }


    }
}

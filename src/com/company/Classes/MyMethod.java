package com.company.Classes;

/**
 * Created by JPMC-PC08 on 20/02/2017.
 */
public class MyMethod {

    public static void whileConditions( int n )
        {
            int i = 1;
            while( i <= n){
               System.out.print( "[" + i + "] \t");
               i++;
            }
            System.out.print("\n*********************************\n");
        }



    public static void dowhileConditions( int n )
    {
        int i = 1;
        do{
            System.out.print( "[" + i + "] \t");
            i++;
        }while( i <= n);
        System.out.print("\n*********************************\n");
    }


    public static void forConditions( int n )
    {
        for( int  i= 1; i <= n; i++){
            System.out.print( "[" + i + "] \t");
        }
        System.out.print("\n*********************************\n");
    }


    public static void whileSumPos( int n )
    {
        int i =0;
        int sum = 0;

      while(i <= n){
          sum += i;
          i++;
      }
        n = sum;
        System.out.println(n);
    }


    public static void forSumPos( int n )
    {
        int sum = 0;
        for( int i = 0; i <= n; i++){
            sum += i;

        }
        n = sum;
        System.out.println(n);
    }


    public static void fucktorial( int n ) {
        int fuck = n;
            n--;
        for( ; n > 0 ; n-- ) {

            fuck *= n;
            System.out.println(fuck);
        }
    }



    }

package com.temuulen;
import java.util.*;
import java.lang.*;
public class Main {
        public static void main(String[] args) {
                int a, b, c, d, e, t, v, l;
                Scanner in = new Scanner(System.in);
                System.out.print("Enter price of item:");
                a=in.nextInt();
                b=100-a;
                c=b%25;
                d=c%10;
                e=d%5;
                t=(b-c)/25;
                v=(c-d)/10;
                l=(d-e)/5;
                System.out.println("You bought item for"+a+" cents and game me a dollar, so your change is:");
                System.out.println("Quarter(s):"+t);
                System.out.println("Dime(s):"+v);
                System.out.println("Nickel(s):"+l);
        }
        //Enter price of item:25
        //You bought item for25 cents and game me a dollar, so your change is:
        //Quarter(s):3
        //Dime(s):0
        //Nickel(s):0
        //
        //Process finished with exit code 0
}

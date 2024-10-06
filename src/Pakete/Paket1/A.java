package Pakete.Paket1;


import Pakete.Paket2.*;

public class A {

    public static void main(String[] args) {
        B.printB();
        C.printC();
        D.printD();
    }


    public static void printA(){
        System.out.println("A");
    }
}

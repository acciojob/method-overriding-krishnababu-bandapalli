package com.driver;

public class B extends A{
    String meth () {
        return "Method is overridden in Extendend class B";
    }


    public static void main(String[] args) {
        B a = new B();
        a.meth();
        B b = new B();
        b.meth();
    }
}



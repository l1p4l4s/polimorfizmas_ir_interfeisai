package com.company.exception_uzduotys.uzduotis_1;

public class A {

    protected static void metodas1(){
        try {
            B.metodas2();
        }catch (Exception e){
            System.out.println("Gavome Errora");
        }
    }

}

package com.company.exception_uzduotys.uzduotis_2;

import com.company.pdf_24_paveldejimo_savybes.uzduotis_3.S;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    protected int returnUserNumber() {

        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            try {
                int userInput = in.nextInt();
                return userInput;

            } catch (InputMismatchException e) {
                System.out.println("Ivesti netinkami duomenys, bandykite dar karta!");
            }
        }
    }
}


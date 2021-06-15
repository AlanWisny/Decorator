package com.company;

import java.util.Scanner;

public class Snelheid {
    private int waarde;
    private Meter M;

    public Snelheid(Meter m){
        M = m;
        waarde = 666;
    }

    public void meet(){
        System.out.println("Waarde = ");
        Scanner S = new Scanner(System.in);
        waarde = S.nextInt();
    }

    public void toon(){
        M.toon(waarde);
    }
}

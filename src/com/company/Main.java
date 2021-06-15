package com.company;

public class Main {

    public static void main(String[] args) {
        Meter M = new BorderDecorator(new VoorTextDecorator(new NaTextDecorator(new DigitaleMeter())));

        Snelheid S = new Snelheid(M);
        S.meet();
        S.toon();
    }
}

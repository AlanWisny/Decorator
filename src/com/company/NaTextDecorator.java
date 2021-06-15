package com.company;

public class NaTextDecorator implements Meter {
    private Meter M;

    public NaTextDecorator(Meter m) {
        M = m;
    }

    @Override
    public void toon(int waarde) {
        M.toon(waarde);
        addText();
    }

    public void addText(){
        System.out.println("Text added after.");
    }
}

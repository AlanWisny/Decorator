package com.company;

public class VoorTextDecorator implements Meter{
    private Meter M;

    public VoorTextDecorator(Meter m) {
        M = m;
    }

    @Override
    public void toon(int waarde) {
        addText();
        M.toon(waarde);
    }

    public void addText(){
        System.out.println("Text added before.");
    }
}

package com.company;

public class BorderDecorator implements Meter{
    private Meter M;

    public BorderDecorator(Meter m) {
        M = m;
    }

    @Override
    public void toon(int waarde) {
        addBorder();
        M.toon(waarde);
        addBorder();
    }

    public void addBorder(){
        System.out.println("----------------");
    }
}

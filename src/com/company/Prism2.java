package com.company;

public class Prism2 extends Prism implements Printable{
    double wysokosc;
    Figure figura;

    Prism2(double wysokosc, Figure figura){
        this.wysokosc=wysokosc;
        this.figura=figura;
    }
    @Override
    public void Print() {
        System.out.println("Graniastoslup o podstawie figury "+figura+" i wysokosci "+wysokosc);
    }


    @Override
    public double poleSquare() {
        double pom;
        double pom0;
        pom=figura.calculatePerimeter();
        pom0=pom/4;
        return 2*pom0*pom0+4*pom0*wysokosc;
    }

    @Override
    public double poleTriangle() {
        double pom1;
        double pomo;
        double pomoc;
        pom1=figura.calculatePerimeter();
        pomoc=figura.calculateArea();
        pomo=pom1/3;
        return 2*pomoc+3*wysokosc*pomo;
    }

    @Override
    public double objetosc() {
        double pom2;
        pom2=figura.calculateArea();
        return pom2*wysokosc;
    }
}

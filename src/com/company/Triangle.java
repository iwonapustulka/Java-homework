package com.company;

public class Triangle extends Figure implements Printable{
    double podstawa;
    double wysokosc;

    Triangle(double podstawa, double wysokosc){
        this.podstawa=podstawa;
        this.wysokosc=wysokosc;
    }
    double calculateArea(){
        return 0.5*podstawa*wysokosc;
    }
    double calculatePerimeter(){
        return 3*podstawa;
    }
    public void Print(){
        try {
            System.out.println("Trojkat o boku " + podstawa + " i wysokosci " + wysokosc);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Niepoprawny parametr");
        }
    }
}

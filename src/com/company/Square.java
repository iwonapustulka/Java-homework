package com.company;

public class Square extends Figure implements Printable {
    double bok;
    Square(double bok){
        this.bok=bok;
    }
    double calculateArea(){
        return bok*bok;
    }
    double calculatePerimeter(){
        return 4*bok;
    }
    public void Print(){
        try {
            System.out.println("Kwadrat o boku " + bok);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Niepoprawny parametr");
        }
    }
}

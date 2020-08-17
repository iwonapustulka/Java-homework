package com.company;

public class Circle extends Figure implements Printable{
    double promien;
    Circle(double promien){
        this.promien=promien;
    }
    double calculateArea(){
        return 3.14*promien*promien;
    }
    double calculatePerimeter(){
        return 2*3.14*promien;
    }
    public void Print(){
        try{
            System.out.println("Okrag o promieniu "+promien);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Niepoprawny parametr");
        }
    }
}

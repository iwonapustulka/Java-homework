package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class User implements Printable {
    Scanner odczyt=new Scanner(System.in);
    User(){
        //
    }
    @Override
    public void Print() {
        System.out.println("Dziekujemy za skorzystanie z kalkulatora pol, obwodow i objetosci :) ");
    }

    void choice() {
        System.out.println("Jaki rodzaj figury?");
        System.out.println("1-plaska? 2-przestrzenna? 3-exit?");
        try {
            int zm = odczyt.nextInt();
            switch (zm) {
                case 1:
                    plaska();
                    break;
                case 2:
                    przestrzenna();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Zly zakres");
            }
        } catch (InputMismatchException e) {
            System.out.println("Niepoprawny parametr");
        }
    }

    void plaska() {
        System.out.println("Jaka figura?");
        System.out.println("1-kwadrat? 2-okrag? 3-trojkat? 4-exit?");
        try {
            int zm = odczyt.nextInt();
            switch (zm) {
                case 1:
                    kwadrat();
                    break;
                case 2:
                    okrag();
                    break;
                case 3:
                    trojkat();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Zly zakres");
            }
        } catch (InputMismatchException e) {
            System.out.println("Niepoprawny parametr");
        }
    }

    void przestrzenna() {
        System.out.println("Jaka figura w podstawie graniastoslupa?");
        System.out.println("1-trojkat? 2-kwadrat? 3-exit?");
        try {
            int zm = odczyt.nextInt();
            switch (zm) {
                case 1:
                    grantrojkat();
                    break;
                case 2:
                    grankwadrat();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Zly zakres");
            }
        } catch (InputMismatchException e) {
            System.out.println("Niepoprawny parametr");
        }
    }
    void kwadrat() {
        System.out.println("Podaj podstawe kwadratu: ");
        double a = odczyt.nextDouble();
        Figure square = new Square(a);
        Printable print=new Square(a);
        print.Print();
        System.out.println("Pole to: "+ square.calculateArea());
        System.out.println("Obwod to: "+square.calculatePerimeter());
    }

    void okrag(){
        System.out.println("Podaj promien okregu: ");
        double r=odczyt.nextDouble();
        Figure circle=new Circle(r);
        circle.calculateArea();
        circle.calculatePerimeter();
        Printable print=new Circle(r);
        print.Print();
        System.out.println("Pole to: "+ circle.calculateArea());
        System.out.println("Obwod to: "+circle.calculatePerimeter());
    }

    void trojkat(){
        System.out.println("Podaj dlugosc boku trojkata: ");
        double a=odczyt.nextDouble();
        System.out.println("Podaj wysokosc trojkata: ");
        double h=odczyt.nextDouble();
        Figure triangle=new Triangle(a,h);
        triangle.calculatePerimeter();
        triangle.calculateArea();
        Printable print=new Triangle(a,h);
        print.Print();
        System.out.println("Pole to: "+ triangle.calculateArea());
        System.out.println("Obwod to: "+triangle.calculatePerimeter());
    }

    void grantrojkat(){
        System.out.println("Podaj dlugosc boku trojkata znajdujacego sie w podstawie: ");
        double a=odczyt.nextDouble();
        System.out.println("Podaj dlugosc wysokosci trojkata znajdujacego sie w podstawie: ");
        double h=odczyt.nextDouble();
        System.out.println("Podaj wysokosc graniastoslupa: ");
        double H=odczyt.nextDouble();
        Figure triangle=new Triangle(a,h);
        Prism prism=new Prism2(H,triangle);
        prism.objetosc();
        prism.poleTriangle();
        Printable print=new Prism2(H,triangle);
        System.out.println("Pole to: "+ prism.poleTriangle());
        System.out.println("Objetosc to: "+prism.objetosc());
    }

    void grankwadrat(){
        System.out.println("Podaj dlugosc boku kwadratu znajdujacego sie w podstawie: ");
        double a=odczyt.nextDouble();
        System.out.println("Podaj wysokosc graniastoslupa: ");
        double H=odczyt.nextDouble();
        Figure square=new Square(a);
        Prism prism=new Prism2(H,square);
        prism.objetosc();
        prism.poleSquare();
        Printable print=new Prism2(H,square);
        System.out.println("Pole to: "+ prism.poleSquare());
        System.out.println("Objetosc to: "+prism.objetosc());
    }
}

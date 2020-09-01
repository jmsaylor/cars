package com.johnmsaylor;

public class Main {

    public static void main(String[] args) {

	Car car = new Car(4,"Jeep");
	MiniVan van = new MiniVan();
	Coupe porsche = new Coupe("Porsche 911");

	porsche.beep();
	porsche.go(45);
	van.beep(4);
	System.out.println("Go!");
    car.go(5);
    System.out.println(car.getSpeed());
    car.go(10);
    System.out.println(car.getSpeed());
    car.go(25);
    car.beep(4);
    System.out.println(car.getSpeed());
    car.go(-30);
    car.beep(7);
    System.out.println(car.getSpeed());

    }
}


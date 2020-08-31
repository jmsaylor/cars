package com.johnmsaylor;

public class Car {
    int speed;
    int wheels;
    int doors;
    String type;

    public Car(int doors, String type) {
        this.wheels = 4;
        this.doors = doors;
        this.type = type;
        this.speed = 0;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void beep(int intensity) {
        StringBuilder string = new StringBuilder("beep beep");
        for (int i = 0; i < intensity; i++) {
            string.insert(7, 'e');
        }
        System.out.println(string);
    }

    public void go(int amount) {
        int speed = getSpeed();
        speed += amount;
        setSpeed(speed);
    }
}

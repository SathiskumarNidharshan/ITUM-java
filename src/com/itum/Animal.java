package com.itum;

abstract class Animal {
    public void sleep(){
        System.out.println("Animal is sleeping");
    }
    public abstract void animalSound();
}

class Lion extends Animal{
    public void animalSound(){
        System.out.println("Lion is sleeping");
    }
}

class TestAnimal{
    public static void main(String[] args) {
        Lion lion= new Lion();
        lion.animalSound();
        lion.sleep();
    }
}

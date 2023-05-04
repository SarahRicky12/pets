package edu.guilford;

public abstract class Pet {
    
//attributes that belong to dogs, cats, and horses
protected String name;
protected String breed;
protected int age;
protected double weight;
protected String color;

//constructor that sets values for the attributes
public Pet(String name, String breed, int age, double weight, String color) {
    this.name = name;
    this.breed = breed;
    this.age = age;
    this.weight = weight;
    this.color = color;
}

//abstract method that will be implemented in the subclasses
public abstract String speak();
//dog will say "woof", cat will say "meow", horse will say "neigh"

//method that will be inherited by each subclass and can be overridden in the subclasses
public String toString() {
    return "Name: " + name + "\nBreed: " + breed + "\nAge: " + age + "\nWeight: " + weight + "\nColor: " + color;
    //toString can be overridden in the subclasses
}








}

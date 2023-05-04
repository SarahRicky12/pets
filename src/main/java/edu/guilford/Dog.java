package edu.guilford;

public class Dog extends Pet {

// super constructor that uses the attributes from the Pet class
public Dog(String name, String breed, int age, double weight, String color) {
    super(name, breed, age, weight, color);
}

//use the speak method to print out the sound the dog makes
public String speak() {
    return "woof";
}

//getter for name 
public String getName() {
    return name;
}

//implement the "Comparable" interface in a way that 
//establishes a natural ordering for the objects
//based on the dog's name (alphabetical order)
public int compareTo(Dog other) {
    return this.name.compareTo(other.name);
}

//override the toString method
@Override
public String toString() {
    return "Name: " + name + "\nBreed: " + breed + "\nAge: " + age + "\nWeight: " + weight + "\nColor: " + color;
}
}

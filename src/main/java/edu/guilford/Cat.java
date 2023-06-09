package edu.guilford;

public class Cat extends Pet {

//constructor
public Cat(String name, String breed, int age, double weight, String color) {
    super(name, breed, age, weight, color);
}

//getter for name
public String getName() {
    return name;
}

//use the speak method to print out the sound the cat makes
public String speak() {
    return "meow";
}

//implement the "Comparable" interface in a way that 
//establishes a natural ordering for the objects
//based on the cat's name
public int compareTo(Cat other) {
    return this.name.compareTo(other.name);
}

//override the toString method
@Override
public String toString() {
    return "Name: " + name + "\nBreed: " + breed + "\nAge: " + age + "\nWeight: " + weight + "\nColor: " + color;
}

}

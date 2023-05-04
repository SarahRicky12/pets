package edu.guilford;

public class Horse extends Pet{

//constructor
public Horse(String name, String breed, int age, double weight, String color) {
    super(name, breed, age, weight, color);
}

//getter for name
public String getName() {
    return name;
}

//use the speak method to print out the sound the horse makes
public String speak() {
    return "neigh";
}

//implement the "Comparable" interface in a way that 
//establishes a natural ordering for the objects
//based on the horse's name
public int compareTo(Horse other) {
    return this.name.compareTo(other.name);
}

//override the toString method
@Override
public String toString() {
    return "Name: " + name + "\nBreed: " + breed + "\nAge: " + age + "\nWeight: " + weight + "\nColor: " + color;
}


}

package edu.guilford;


public class PetProgram 
{
    public static void main( String[] args )
    {
        
    //instantiate 3 dogs using the constructor in the Dog class
    Dog firstDog = new Dog("Fido", "Labrador", 5, 60.0, "black");
    Dog secondDog = new Dog("Spot", "Dalmation", 3, 40.0, "white");
    Dog thirdDog = new Dog("Rover", "Poodle", 7, 30.0, "brown");

    //instantiate 3 cats using the constructor in the Cat class
    Cat firstCat = new Cat("Fluffy", "Persian", 2, 10.0, "white");
    Cat secondCat = new Cat("Mittens", "Siamese", 4, 8.0, "brown");
    Cat thirdCat = new Cat("Whiskers", "Tabby", 1, 9.0, "orange");

    //instantiate 3 horses using the constructor in the Horse class
    Horse firstHorse = new Horse("Mr. Ed", "Thoroughbred", 10, 1000.0, "chestnut");
    Horse secondHorse = new Horse("Trigger", "Quarter Horse", 8, 800.0, "bay");
    Horse thirdHorse = new Horse("Black Beauty", "Mustang", 12, 1200.0, "black");

    //use the toString method to print out the attributes of each dog
    System.out.println("First Dog:");
    System.out.println(firstDog.toString());
    System.out.println("Second Dog:");
    System.out.println(secondDog.toString());
    System.out.println("Third Dog:");
    System.out.println(thirdDog.toString());
    System.out.println("Dog's say: " + firstDog.speak());

    //use the toString method to print out the attributes of each cat
    System.out.println("First Cat:");
    System.out.println(firstCat.toString());
    System.out.println("Second Cat:");
    System.out.println(secondCat.toString());
    System.out.println("Third Cat:");
    System.out.println(thirdCat.toString());
    System.out.println("Cat's say: " + firstCat.speak());

    //use the toString method to print out the attributes of each horse
    System.out.println("First Horse:");
    System.out.println(firstHorse.toString());
    System.out.println("Second Horse:");
    System.out.println(secondHorse.toString());
    System.out.println("Third Horse:");
    System.out.println(thirdHorse.toString());
    System.out.println("Horse's say: " + firstHorse.speak());

    //order the dogs by name using the compareTo method
    System.out.println("Ordering the dogs by name:");
    if (firstDog.compareTo(secondDog) < 0) {
        if (firstDog.compareTo(thirdDog) < 0) {
            if (secondDog.compareTo(thirdDog) < 0) {
                System.out.println(firstDog.getName());
                System.out.println(secondDog.getName());
                System.out.println(thirdDog.getName());
            } else {
                System.out.println(firstDog.getName());
                System.out.println(thirdDog.getName());
                System.out.println(secondDog.getName());
            }
        } else {
            System.out.println(thirdDog.getName());
            System.out.println(firstDog.getName());
            System.out.println(secondDog.getName());
        }
    } else {
        if (secondDog.compareTo(thirdDog) < 0) {
            if (firstDog.compareTo(thirdDog) < 0) {
                System.out.println(secondDog.getName());
                System.out.println(firstDog.getName());
                System.out.println(thirdDog.getName());
            } else {
                System.out.println(secondDog.getName());
                System.out.println(thirdDog.getName());
                System.out.println(firstDog.getName());
            }
        } else {
            System.out.println(thirdDog.getName());
            System.out.println(secondDog.getName());
            System.out.println(firstDog.getName());
        }
    }

    //order the cats by name using the compareTo method
    System.out.println("Ordering the cats by name:");
    if (firstCat.compareTo(secondCat) < 0) {
        if (firstCat.compareTo(thirdCat) < 0) {
            if (secondCat.compareTo(thirdCat) < 0) {
                System.out.println(firstCat.getName());
                System.out.println(secondCat.getName());
                System.out.println(thirdCat.getName());
            } else {
                System.out.println(firstCat.getName());
                System.out.println(thirdCat.getName());
                System.out.println(secondCat.getName());
            }
        } else {
            System.out.println(thirdCat.getName());
            System.out.println(firstCat.getName());
            System.out.println(secondCat.getName());
        }
    } else {
        if (secondCat.compareTo(thirdCat) < 0) {
            if (firstCat.compareTo(thirdCat) < 0) {
                System.out.println(secondCat.getName());
                System.out.println(firstCat.getName());
                System.out.println(thirdCat.getName());
            } else {
                System.out.println(secondCat.getName());
                System.out.println(thirdCat.getName());
                System.out.println(firstCat.getName());
            }
        } else {
            System.out.println(thirdCat.getName());
            System.out.println(secondCat.getName());
            System.out.println(firstCat.getName());
        }
    }

    //order the horses by name using the compareTo method
    System.out.println("Ordering the horses by name:");
    if (firstHorse.compareTo(secondHorse) < 0) {
        if (firstHorse.compareTo(thirdHorse) < 0) {
            if (secondHorse.compareTo(thirdHorse) < 0) {
                System.out.println(firstHorse.getName());
                System.out.println(secondHorse.getName());
                System.out.println(thirdHorse.getName());
            } else {
                System.out.println(firstHorse.getName());
                System.out.println(thirdHorse.getName());
                System.out.println(secondHorse.getName());
            }
        } else {
            System.out.println(thirdHorse.getName());
            System.out.println(firstHorse.getName());
            System.out.println(secondHorse.getName());
        }
    } else {
        if (secondHorse.compareTo(thirdHorse) < 0) {
            if (firstHorse.compareTo(thirdHorse) < 0) {
                System.out.println(secondHorse.getName());
                System.out.println(firstHorse.getName());
                System.out.println(thirdHorse.getName());
            } else {
                System.out.println(secondHorse.getName());
                System.out.println(thirdHorse.getName());
                System.out.println(firstHorse.getName());
            }
        } else {
            System.out.println(thirdHorse.getName());
            System.out.println(secondHorse.getName());
            System.out.println(firstHorse.getName());
        }
    }


}

}

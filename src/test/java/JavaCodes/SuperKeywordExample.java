package JavaCodes;
public class SuperKeywordExample {
    
	public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Golden Retriever");

        // Call methods of the Dog class
        myDog.bark();
        myDog.eat(); // This calls the overridden eat method

        // Access fields from both Animal and Dog
        System.out.println("Name: " + myDog.name);
        System.out.println("Breed: " + myDog.breed);
	}

}


/*
 * 
The Animal class has a constructor to set the name field and a method eat to print a generic message about eating.

The Dog class extends Animal and has an additional field breed. The Dog class's constructor uses super(name) to call the constructor of the superclass (Animal).

The Dog class also has a method bark, and it overrides the eat method from the superclass. In the overridden eat method, super.eat() is used to call the eat method of the superclass before adding additional behavior.

In the main method, an instance of Dog is created, and its methods and fields are accessed.

 */

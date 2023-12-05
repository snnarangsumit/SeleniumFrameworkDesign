package JavaCodes;
//
class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        // Call the constructor of the superclass using 'super'
        super(name);
        this.breed = breed;
    }

    void bark() {
        System.out.println(name + " is barking.");
    }

    // Override the eat method from the superclass
    @Override
    void eat() {
        // Call the eat method of the superclass using 'super'
        super.eat();
        System.out.println(name + " is eating like a dog.");
    }
}

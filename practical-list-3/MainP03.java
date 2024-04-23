interface Animal {
    void makeSound();
}


class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

public class MainP03 {
    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog myDog = new Dog();
	System.out.println("Prem gohel");
	System.out.println("220130318003");
        // Call the method defined in the Animal interface
        myDog.makeSound();
    }
}

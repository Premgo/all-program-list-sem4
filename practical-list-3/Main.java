class Animal{
	public void eat(){
		System.out.println("Cat eat food");
	}
}

class Dog extends Animal{
	public void eat(){
		System.out.println("Dog eat food");
	}
}

class Cat extends Animal{
	public void eat(){
		System.out.println("Cat eat food");
	}
}

public class Main{
		
	public static void main(String[] args) {
	
	Animal a = new Animal();
	a.eat();

	Dog d = new Dog();
	d.eat();

	Cat c= new Cat();
	c.eat();

	

	}
}
	  
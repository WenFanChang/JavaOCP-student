package day11;

//多型的應用
public class Zoo {
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
		Tiger tiger = new Tiger();
		tiger.sound();
		tiger.skill();
	}
	

}

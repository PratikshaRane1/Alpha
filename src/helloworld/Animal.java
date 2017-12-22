package helloworld;

interface Toys
{
	void getColor();
}
abstract class Animal
{
	abstract void makeSound();
}
class cat extends Animal implements Toys
{
	public void makeSound()
	{
		// TODO Auto-generated method stub
		System.out.println("Woof woof");
	}
	public void getColor() 
	{
		// TODO Auto-generated method stub
		System.out.println("My color is black");
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Animal obj= new cat();
		obj.makeSound();
		Toys obj1= new cat();
		obj1.getColor();
	}

	
}
package helloworld;

abstract class Animal 
{
	abstract void makesound();
}
class dog extends Animal
{
	void makesound()
	{
		System.out.println("woof woof");
	}


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		dog obj= new dog();
		obj.makesound();
	}

}

package helloworld;
interface Toys
{
	void getColor();
	void makesound();
} 

class cat implements Toys
{
	public void getColor()
	{
		System.out.println("My color is black");
	}

	@Override
	public void makesound() {
		// TODO Auto-generated method stub
		System.out.println("Woof woof");
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		cat obj= new cat();
		obj.getColor();
		obj.makesound();
	}



}
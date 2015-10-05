package input.model;

public class Thing
{
	private String monsterName;
	private int monsterEyes;
	private int monsterEars;
	private double monsterHair;
	private double monsterLegs;


	public Thing ()
	{
	monsterName = "";
	monsterEyes = -12345678;
	monsterEars = 12345678;
	monsterHair = -.99999999;
	monsterLegs= -.99999999;
			
	}
	public String getmonsterName()
	{ 
		return monsterName;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setWeight (double weight)
	{
		this.weight = weight;
	}
	
	public void setAge (int age)
	{
		this.age = age;
	}
	/**
	 * Changes variables to their new inputs
	 * @param name Changes String name variable
	 * @param weight Changes double weight variable
	 * @param age Changes int age variable
	 */
	public Thing(String name, int age, double weight)
	{
		this.name = name;
		this.weight = weight;
		this.age = age;
	}
	public String toString()
	{
		String inputInfo = name +" is and age is " + age + "and you weight " + weight;
		return inputInfo;
	}
}
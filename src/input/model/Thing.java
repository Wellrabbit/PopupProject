package input.model;

public class Thing
{
	private String name;
	private int age;
	private double weight;


	public Thing ()
	{
	age = -99;
	weight = .000000000001;
	name = "";
			
	}
	public String getName()
	{ 
		return name;
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
	public Thing(String name, double weight, int age)
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
package encapsulation;

public class CarDetails {
	
	private String color;
	private String brand;
	
	public void setCarData(String color, String brand)
	{
		this.color=color;
		this.brand=brand;
	}
	
	public void getCarData()
	{
		System.out.println("Car Brand is "+brand);
	}
}

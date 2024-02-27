package abstraction;

public class square extends shape {
	
	private float side;
	public square()
	{
		side=2.0f; // optional
	}
	public square(float side)
	{
		this.side=side;
	}
	
	@Override

	void calArea()
	{
		super.area=side*side;
	}
}

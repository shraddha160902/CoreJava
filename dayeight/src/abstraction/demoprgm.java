package abstraction;

public class demoprgm {

	public static void main(String[] args) {
		square sq=new square();
		rectangle r1=new rectangle();
		sq.calArea();
		sq.show();
		r1.calArea();
		r1.show();
		
		System.out.println("--------------------");
		
		shape shape;// 1st shape should be capital but here in created class has small so small
		shape =new square(12.5f);
		
		shape.calArea();
		shape.show();
		
		
		shape =new rectangle(10,20);
		
		shape.calArea();
		shape.show();
		
						

	}

}

package prg1;

public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		student[]arr;
		arr=new student[5];
		arr[0]=new student(1,"shaglin");
		arr[1]=new student(2,"vishal");
		arr[2]=new student(3,"Nidhi");
		arr[3]=new student(4,"Lisha");
		arr[4]=new student(5,"saurav");
		
		for (int i=0;i<arr.length;i++)
			System.out.print("\n Element at"+i+":\t"+arr[i].getRollno()+"\t"+arr[i].getName());
		
	}

}

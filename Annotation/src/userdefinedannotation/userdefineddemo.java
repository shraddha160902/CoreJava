package userdefinedannotation;

import java.lang.annotation.Annotation;

public class userdefineddemo {

	public static void main(String[] args) {
		
		Androidseries obj=new Androidseries("A23",14);
		System.out.println(obj.model);
		System.out.println(obj.screensize);
		System.out.println("Smartphone details");
		
		@SuppressWarnings("rawtypes")
		Class c=obj.getClass();
		
		@SuppressWarnings("unchecked")
		Annotation an=c.getAnnotation(smartphone.class);
		
		smartphone s=(smartphone) an;
		
		System.out.println(s.os());
		System.out.println(s.version());
		
		
		
		System.out.println("smartTv details");
		@SuppressWarnings("unchecked")
		Annotation an1=c.getAnnotation(smartTv.class);
		
		smartTv s1=(smartTv) an1;
		
		System.out.println(s1.os());
		System.out.println(s1.height());
		System.out.println(s1.width());
		
}
}
package userdefinedannotation;


@smartTv(os="android",height=40,width = 50)
@smartphone(os="android",version=12)
 
class Androidseries {
	String model;
	int screensize;

	
	public Androidseries(String model, int screensize) {
		this.model = model;
		this.screensize = screensize;
	}
	
}

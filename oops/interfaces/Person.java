package oops.interfaces;

public class Person implements Student, Youtuber {

	public static void main(String[] args) {
		Person obj = new Person();
			
//		obj.study();
//		obj.makeVideo();

		Youtuber obj2 = obj;   //upcast 
							
		obj2.editVideo(); //it will now only support function of yotuber will not support study
		obj2.makeVideo();
	}
	@Override
	public void study() {
		System.out.println("Person is studying");
	}
	@Override
	public void makeVideo() {
	System.out.println("Person is making video");
}
	@Override
	public void editVideo() {
		System.out.println("Person can edit video");
		// TODO Auto-generated method stub
		
	}

}
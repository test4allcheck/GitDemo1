
public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo d = new MethodDemo();
		String name = d.getData();
		System.out.println(name);
		
		MethodsDemo2 d1 = new MethodsDemo2();
		d1.getUserData();
		
		getData2();
		
	}
	
	public  String getData() //method now belong to class
	{
		System.out.println("hello world");
		return "rahul awachar";
	}
	
	public static String getData2() //method now belong to class
	{
		System.out.println("hello world");
		return "rahul awachar";
	}

}

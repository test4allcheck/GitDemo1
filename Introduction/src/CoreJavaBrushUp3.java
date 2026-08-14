
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String is an object
		
		//String Literal
		//String s = "Rahul Awachar";
		String s1 = "Rahul Awachar";
		String s5 = "hello";
		
		//new
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
		String s = "Rahul Awachar Selenium";
		String[] splitString = s.split("Awachar");
		
		System.out.println(splitString[0]);
		System.out.println(splitString[1]);
		//System.out.println(splitString[2]);
		
		for(int i=s.length()-1; i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
	}

}

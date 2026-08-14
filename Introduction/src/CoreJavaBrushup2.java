import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,122};
		
		for(int i=0; i<arr2.length;i++)
		{
			if (arr2[i] % 2 == 0)
			{
				System.out.println(arr2[i]);
				break;
			}
			else
			{
				System.out.println(arr2[i] + "is not multiple of 2");
			}
		}
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Rahul");
		a.add("awachar");
		a.add("selenium");
		a.add("java");
		System.out.println(a.get(3));
		
		for(int i=0; i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		for(String val : a)
		{
			System.out.println(val);
		}
		
		System.out.println(a.contains("selenium"));
		String [] myname = {"rahul", "awachar", "selenium"};
		List<String> nameArrayList = Arrays.asList(myname);
		System.out.println(nameArrayList.contains("selenium"));
	}

}

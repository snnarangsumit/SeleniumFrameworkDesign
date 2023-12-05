package JavaCodes;
import java.util.ArrayList;

public class CoreJavaBrushUp2_ArrayList {
	public static void main(String[] args) {

		// TODO Auto-generated method stub

        //datatype variable = assignment

		// array: fixed length
		// array list: one of the class in java--
		//variable length : dynamically grow size of array
		
		int[] arr2= {1,2,3,4,5,6,7,8,9,122};		

	
		//output 2,4,6,8

		for(int i = 0; i< arr2.length; i++) //4
		{

        if (arr2[i] % 2 ==0)
        {
		System.out.println(arr2[i]+": Number is multiple of 2");

		}
        else
        {
        	System.out.println(arr2[i]+": Number is not multiple of 2");
        	
        }
	}
		
		
		// array list: one of the class in java-- variable length : dynamically grow size of array
		
		ArrayList a = new ArrayList();
	//	ArrayList a = new ArrayList();
		a.add("rahul");
		a.add("Sumit");
		a.remove(0);
		System.out.println(a);
 
	//array: length method
	//arraylist: size method
		//arraylist: get
	
	
	for(int i=0;i<a.size();i++)
	{
		System.out.println(a.get(i));
		
	}
}
}

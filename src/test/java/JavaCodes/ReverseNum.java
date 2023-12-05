package JavaCodes;
public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =543;    //345==(3--3+0)==(4--4+30)===(5--34*10)
		int reverse =0;
		
		
		while(a!=0)
		{
		int digit=	a%10;
		
		reverse = digit + reverse*10; 
		a=a/10;
			
	
		}
		System.out.println(reverse);
	}

}

//Author: Sanjana Mane

package question2;

import java.util.Scanner;
 
class invalid_age_weight_exceptions extends Exception
{
	public invalid_age_weight_exceptions(String Str)
	{
		super(val);
	}
}

public class invalid_age_weight_exceptions {
	

	public static void main(String[] args) {
	
		int weight,age;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		age=sc.nextInt();
		System.out.println("enter weight");
		weight=sc.nextInt();
		try
		{
			if(age<18 || weight<50)
			{
				throw new invalid_age_weight_exceptions("invalid age weight exception");
			}
			else
				System.out.println("your valid to donate blood");
		}
		catch(invalid_age_weight_exceptions e)
		{
			System.out.println(e);
			System.out.println("Your not valid to donate blood");
		}
		
		}
}
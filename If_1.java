package Chapter_8_Conditional_Statement;

public class If_1 {

	public static void main(String[] args) {

		//  logical operator
		//   &&
		//   ||
		//   !
		
		
		int a=40;
		int b=50;
		
		if(a<50 && b<=50)  // using && the both condition are true to use this operatior
		{
			System.out.println("both condition are less than 50");
		}
	
	
	
	if(a<50 || b<50)
	{
		System.out.println("at least one condition is 50");
	}
	
	
	
	}

}

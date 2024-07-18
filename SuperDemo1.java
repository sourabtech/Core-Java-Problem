package Inheritance;
//Child class
  class Supperparent
  {
	 String name;
	 public void details()
	{
	  name="Parent";
	  System.out.println(name);
	}
}
 
	public class SuperDemo1   extends Supperparent 
	{
		String name;
		public void details()
		{
			super.details();// jeva same method and parameter asel teva use super keyword
			name="Child";
			System.out.println(name);
			
		}
		public static void main(String[] args) {
			SuperDemo1 sc=new SuperDemo1();
			sc.details();

		}

	}

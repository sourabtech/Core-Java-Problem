package Chapter_10_Methods;

public class methos_1 {
/*
 	methos:-
 			 koi bhi operation dakhavayache.
 			 method la input deto apan mg to output deto.
 			 
 
 */
	public static void printjava() {  //printjava  ha function ahe to () ya ne volakhayachaa ki to function ahe manun
		System.out.println("hello java");
	}
	
	public static void printname(String name) { //() made input thype deyacha
		System.out.println(name);
	}
	
	public static void printsun(int a,int b) {
		int sum =a+b;
		System.out.println(sum);
		
	}
	public static void main(String[] args) {

		
		//methods
		printjava();//calling function
		
		printname("sourabh");
		
		printsun(1,6);
		
	}

}

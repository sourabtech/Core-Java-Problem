package Chapter_9_Exception_Handling;

public class Exception_Handling_1 {

	/*
	    -exception ko handle kiya jata hai
	    -error ko handle nahi kiya jata
	    -jeva vatel ki konthya line la exception yeil tite try block tayar kela jato
	    -exception la catch kelya nanter kai karayache te catch made lihato 
	 */
	public static void main(String[] args) {

		int[] marks= {97,96,95};
		try {
			System.out.println(marks[5]);
		}catch(Exception exception) {
			//do somthing after catching
		}
		System.out.println("the name is sourabh");
	}

}

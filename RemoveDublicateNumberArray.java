package in.practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDublicateNumberArray {
	
	    public static void main(String[] args) {
	        int[] arr = {1,1,2,2,2,2,4,4,5,5,5,5,5,5,7,7,7};

	        // Use LinkedHashSet to preserve insertion order
	        Set<Integer> st = new LinkedHashSet<>();

	        for (int num : arr) {
	            st.add(num);
	        }

	        // Convert set back to array if needed
	        int[] uniqueArr = st.stream().mapToInt(Integer::intValue).toArray();

	        // Print unique array
	        System.out.println("Array after removing duplicates:");
	        for (int num : uniqueArr) {
	            System.out.print(num + " ");
	     	    }
	}

}

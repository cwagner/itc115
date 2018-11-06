
public class IsSorted {

	public static void main(String[] args) {
		double array1[] = new double[] {16.1, 12.3, 22.2, 14.4};
		double array2[] = new double[] {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
		double array3[] = new double[] {42.0};
		//should be false
		System.out.println(isSorted(array1));
		//should be true
		System.out.println(isSorted(array2));
		//should be true
		System.out.println(isSorted(array3));

	}
	
	public static boolean isSorted(double[] list) {
		//loop through the array, starting with the second element
		//if the array has only one element this loop will be skipped
	    for (int i = 1; i < list.length; i++) {
	    	//check if current element is smaller than previous element
	    	//if so, return false
	        if (list[i] < list[i - 1]) {
	            return false;
	        }
	    }
	    //if loop is exited without returning false, 
	    //each element must be greater than or equal to the one before it, aka sorted
	    //or the array has one element, and is automatically sorted
	    return true;
	}

}

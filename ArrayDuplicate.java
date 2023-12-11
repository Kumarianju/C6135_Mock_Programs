/*
 * Q.1)Given an array of integers, write a Java program to find and print all the duplicate elements.
 */
package MockTest;
/*
 * Anju Kumari
 */
public class ArrayDuplicate {
//Driver code
	public static void main(String[] args) {
		// Initialize the array
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 1, 2, 4 };
		System.out.println("Duplicate elements in given array: ");
		// Searches for duplicate element
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[j]);
			}
		}

	}

}
/*
 *Output:
 *Duplicate elements in given array: 
  1
  2
  4 
 */

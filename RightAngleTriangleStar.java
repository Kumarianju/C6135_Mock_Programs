/*
 * Q.3) Write a Java program to print a right-angled triangle of stars.
 *  The number of rows should be taken as input.
 */
package MockTest;
/*
 * Anju Kumari
 */
import java.util.Scanner;
public class RightAngleTriangleStar {
//Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int n = sc.nextInt();
		//outer loop for rows
		for(int rows=1;rows<=n;rows++) {
			//inner loop for columns	
			for(int cols=1;cols<=rows;cols++) {
				System.out.print("*"+" ");
			}
	  //throws the cursor in a new line after printing each line.
			System.out.println();
		}
		
		sc.close();

	}

}
/*Output:
 * Enter number of rows:
   4
   * 
   * * 
   * * * 
   * * * * 
 
  
 */

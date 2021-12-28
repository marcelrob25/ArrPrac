package arrayPractice;
import java.util.Random;
import java.util.Scanner;
	public class array{
		
		static int []numbers= new int[(getArraySize())];
	
	
	public static int getArraySize() {
		Scanner scan= new Scanner(System.in);
		System.out.println("How many indecis would you like?");
		int size=scan.nextInt();
		return size;
	}
	
public static int[] getRandNums(int[]numbers) {
	Random rand= new Random();
	for(int i=0;i<numbers.length;i++) {
		numbers[i]=rand.nextInt(100);
		
	}
	return numbers;
}
public static void displayArray(int []nums) {
	System.out.print("Array numbers: ");
	for(int i=0;i<nums.length;i++) {
		System.out.print(nums[i] +" ");
	}
	
}
public static int getLargest(int[]numbers) {int i=0;
	int larg=numbers[0];
	for( i=0;i<numbers.length;i++) {
		if(numbers[i]>larg) {
		 larg=numbers[i];
		}
	}
	return larg;
}
public static int getSmallest(int[]numbers) {int i=0;
int small=numbers[0];
for( i=0;i<numbers.length;i++) {
	
	if(numbers[i]<small) {
	 small=numbers[i];
	}
}
return small;
}
public static void getSumAndAvg(int[]numbers) {int sum=0;
	for(int i=0;i<numbers.length;i++) {
		sum+=numbers[i];
	}
	System.out.println("The sum is: "+ sum);
	double average=(sum/(numbers.length));
	System.out.println("The averge of the numbers in this array is: "+ average);
}
	public static void main(String[]args) {
		System.out.println("Length of array: "+ numbers.length);
	displayArray(getRandNums(numbers));
	System.out.println("\nThe largest integer in this array is: "+ getLargest(numbers));
	System.out.println("The Smallest integer in this array is: "+ getSmallest(numbers));
getSumAndAvg(numbers);
	}
	}
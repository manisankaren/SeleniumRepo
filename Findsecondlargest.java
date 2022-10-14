package week1.day4;
import java.util.Arrays;

public class Findsecondlargest {
	public static void main(String[] args) {
		int[] num= {3,2,9,5,7};
		Arrays.sort(num);
		System.out.println("Second Largest = " + num[num.length-2]);
	}
	}



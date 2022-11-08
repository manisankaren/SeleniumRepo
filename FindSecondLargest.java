package week4.day1;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class FindSecondLargest {
	public static void main(String[] args) {
		int[] data= {4,5,6,7,9,3,18,95};
		Set<Integer> empty=new TreeSet<Integer>();
		for(int i=0;i<data.length-1;i++) {
			empty.add(data[i]);
		}
		List<Integer> largestNumber=new ArrayList<Integer>(empty);
		int size=largestNumber.size();
		System.out.println(size);
		
		Integer value=largestNumber.get(size-2);
		System.out.println(value);
	}

}



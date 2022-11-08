package week4.day1;
import java.util.ArrayList;
import java.util.List;
public class PrintDuplicateNumber {
		public static void main(String[] args) {
			int[] data= {5,6,8,5,9,6,8,4};
			List<Integer> dp=new ArrayList<Integer>();
			for(int i=0;i<data.length;i++) {
				for(int j=i+1;j<data.length;j++) {
					if(data[i]==data[j]){
						dp.add(data[i]);
					}
				}

			}
			System.out.println(dp);

			}
		}


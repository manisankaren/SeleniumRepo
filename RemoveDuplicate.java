package week4.day1;
import java.util.Set;
import java.util.TreeSet;
public class RemoveDuplicate {
		public static void main(String[] args) {
			String name="BATMAN";
			char[] charArray=name.toCharArray();
			Set<Character> charSet=new TreeSet<Character>();
			for(int i=0;i<=charArray.length-1;i++) {
				charSet.add(charArray[i]);
				}
			System.out.println(charSet);
					
				}
				
		}

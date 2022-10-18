package week2.day1;

public class Reverseduplicate {
public static void main(String[] args) {
	String text="I prepared biryani for dinner biryani was so good to eat";
	String[] sp=text.split(" ");
	for(int i=0;i<sp.length;i++) {
		for(int j=i+1;j<sp.length;j++) {
		if(sp[i].equals(sp[j])) {
			//System.out.println("" +sp[j]);
			sp[j]="";
		}
			
		}
		System.out.println(""+sp[i]);
	}
}
}

package week2.day1;

public class odd {
public static void main(String[] args) {
	String word= "manisankaren";
	//String Strcopy="";
	char[] Letter=word.toCharArray();
	int Length=Letter.length;
	for(int i=0;i<Length;i++) {
		if(i%2!=0) {
			String strcpy="";
			strcpy=strcpy+Letter[i];
			System.out.println(strcpy);
		}
		else
		{
			System.out.println(Letter[i]);
		}
	}
}
}

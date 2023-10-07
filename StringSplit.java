package week2.day4;

public class StringSplit {

	public static void main(String[] args) {
		String str="Testleaf Selenium Automation testing";
		String[] strSplit=str.split(" ");
		int splitLen=strSplit.length;
		System.out.println("The number of words in sentence is " +splitLen);
		System.out.println("The length of the last word " +strSplit[splitLen-1] + " is "+strSplit[splitLen-1].length());		
	}
}

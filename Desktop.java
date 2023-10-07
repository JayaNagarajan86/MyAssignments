package week2.day4;

public class Desktop extends Computer {
	public void desktopSize(int desktopSize)
	{
		System.out.println(desktopSize);
	}
	 public static void main(String[] args) {
			
		 Desktop dSize=new Desktop();
		 dSize.desktopSize(123);
		 dSize.computerModel("HP",332);
		 
	 }	 

}

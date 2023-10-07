package week2.day4;

public class Computer {
	
	public void computerModel(String modelName , int modelno)
	{
		System.out.println(modelno+ " belongs to the " +modelName);
	}
	 public static void main(String[] args) {
			
		 Computer com=new Computer();
		 com.computerModel("Dell", 115);
		 
	 }	 

}

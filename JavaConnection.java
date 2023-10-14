package Week3.day4;

import Week3.day1.Amazon;

public class JavaConnection extends MySqlConnection implements DatabaseConnection {

	public static void main(String[] args) {
		JavaConnection jc=new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeQuery();
		jc.executeUpdate();

	}
	public void executeQuery()
	{
		
	     System.out.println("Execute query from java conn class");
	}
	public void disconnect()
	{
	
		System.out.println("Dissconnect from javaconn class instead of abs class");	
	}

}

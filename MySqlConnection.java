package Week3.day4;

public abstract class MySqlConnection implements DatabaseConnection{
	public abstract void executeQuery();
	
	public void connect()
	{
		System.out.println("Connect method from abstract class");
	}
	public void disconnect()
	{
		System.out.println("DisConnect method from abstract class");
	}	
	public void executeUpdate()
	{
		System.out.println("Execute update method from abstract class");	
	}
	
	
	

	
}

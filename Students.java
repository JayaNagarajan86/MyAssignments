package week2.day4;

public class Students {

	public void getStudentInfo( int idNo)
	{
		System.out.println("Identity number of the student is :" +idNo);
	}
	public void getStudentInfo(int idNo, String studName)
	{
		System.out.println(idNo+ " belongs to the " +studName);
	}
	public void getStudentInfo(String emailId , int phNo)
	{
		System.out.println(phNo + " belongs to the " +emailId);
	}
	public static void main(String[] args) {
		
		Students st= new Students();
		st.getStudentInfo(89);
        st.getStudentInfo(67, "Sam");
        st.getStudentInfo("abc@gmail.com", 9957655);
	}

}

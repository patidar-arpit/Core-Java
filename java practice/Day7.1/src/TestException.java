
public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int [] arr = new int [5];
			System.out.println(arr[7]);
			System.out.println("No error");
		}
		
		catch(ArithmeticException e) {
			System.out.println("In AEE");
		}
//		catch(IndexOutOfBoundsException e) {
//			System.err.println("In parent catch block");
//		}
		catch (ArrayIndexOutOfBoundsException e) {  //Unreachable code Parent reference catch the instance so unreachable
			System.err.println("In child catch block");
		}
		finally {
			System.out.println("main over"); // even if the exception is not catched this will execute.
		}
		System.out.println("main over"); //if exception is not catch by anyone block so it will not printed
		                                  // and if exception is catched and handled then it will execute this line
		main1();

	}
	
	public static void main1() {
		try {
			int a =100/0;
			System.err.println("No error");
		}
		finally {
			System.out.println("In finally");      // we can also write try without catch
		}
		System.out.println("END");
		
//		try {                          // we can't write single try 
//			int b =89/0;
//		}
	}

}

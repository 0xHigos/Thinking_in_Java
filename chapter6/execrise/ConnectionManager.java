package chapter6.execrise;

class ConnectionManager1{
	private static String[] Connection;
	
	public static String[] makeConn(String... s){
		if (s== null)
				return null;
		else
			 Connection=s;
		return Connection;
	}
	public static void  printC(){
		if(Connection.length ==0)
			System.out.println("null");
		else for(String s: Connection)
			System.out.print(s+"\t");
	}
}
public class ConnectionManager {
	public static void main(String[] args) {
		
		ConnectionManager1.makeConn("123w","32421r");
		ConnectionManager1.printC();
		ConnectionManager1.makeConn();
		ConnectionManager1.printC();
		
	}
}

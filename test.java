import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		
Scanner kb = new Scanner (System.in);

System.out.println("Enter Name, Date, Salary, VP, Executive, Supervisor"); //tells user order for the different entries
Administrator admin1 = new Administrator(kb.nextLine(), new Date(kb.nextLine(), kb.nextInt(), kb.nextInt()), kb.nextDouble(), kb.nextLine() + kb.nextLine(), kb.nextLine(), kb.nextLine());
System.out.println(admin1.toString());


System.out.println("Enter VP, Executive, Supervisor"); 
Administrator admin2 = new Administrator(kb.nextLine(), kb.nextLine(), kb.nextLine());
System.out.println(admin2.toString()); //outputs the super as default values

kb.close(); // closes scanner
	}

}

package factorydesignpattern;
import java.util.Scanner;

public class Phonebill {
	

	

	

		public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner a=new Scanner(System.in);
			System.out.println("Enter the Network");
			String name=a.next();
			SelectNtworkFactory s=new SelectNtworkFactory();
			s.getPlan(name);
			System.out.println(s);
		}

	}



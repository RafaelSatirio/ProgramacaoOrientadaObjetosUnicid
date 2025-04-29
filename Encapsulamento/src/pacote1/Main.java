package pacote1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculos c = new Calculos();
		
		c.setA(500);
		System.out.println("GET DO A: " + c.getA());
	}

}

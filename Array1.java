import java.util.Scanner;

public class Array1{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("ededi gir: ");
	int a = sc.nextInt();
	int cem=0;
	
	for (int i = a; i < a+4; i++){
	    cem += i;
	}
	System.out.println(" netice="+cem);
    }
}
import java.util.Scanner;
import java.lang.*;

public class Test2{

static final Double pi = 3.14; 
static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
	Double radius  = getRadius();
	boolean ifElig = ifEligible(radius);
	Double netice=0.0;
	if(ifElig) netice = getAreaOfCircle(radius);  

	System.out.print(netice);
    }	


    public static boolean ifEligible(double radius){
 	if(radius<=0)
	    return false;
  
	    return true;
    }


    public static Double getRadius(){
	return scan.nextDouble();
    }
 
    public static Double getAreaOfCircle(Double radius){ 
	return pi * Math.pow(radius, 2);
    }

}
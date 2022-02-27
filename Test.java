
import java.util.Scanner;
import java.lang.StringBuilder;

public class Test{

static char n = 65;
    public static void main(String[] args){
	char[][] arr = new char[4][7]; 
	

	for (int i=0; i<4; i++){
	    for (int j=0; j<7; j++){
		if (i==3 && j>=5) {}
		else{
		    arr[i][j] = carakter();
		    n++;
		}
	    }
	}

	for (int i=0; i<4; i++){
	    for (int j=0; j<7; j++){
		System.out.print(arr[i][j]+" ");
	    }
	    System.out.println();
	} 
    }

    public static char carakter(){
	char a = n;
	return a; 

    }


}


//2 lik array duzelt. her indekse elifbanin bir herfini qoy
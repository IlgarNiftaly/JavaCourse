
import java.util.Scanner;

public class Array2{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);	

	int a, b, i, j, k=1, yer[][];
	System.out.println("yerler necen-necesi? ");    
	a=sc.nextInt();     b=sc.nextInt();     System.out.println();
	yer = new int[a][b];
	
	for (i=0; i<a; i++){
	    for(j=0; j<b; j++){
	    	yer[i][j] = k;
		k++;
	    }
	}
	for (i=0; i<a; i++){
	    for(j=0; j<b; j++){
	    	System.out.print(yer[i][j]+" ");
	    }
	    System.out.println();
	}System.out.println();
        
	System.out.println("Nece oyun olub? ");
	int oyunSayi = sc.nextInt();
	int[] A = new int[oyunSayi];    int[] B = new int[oyunSayi];
	int sol=0, orta=0, sag=0;
        
	System.out.println("A-nin statistiklerini gir: ");
	for(i=0; i<oyunSayi; i++){
	    A[i] = sc.nextInt();
	    switch(A[i]){
		case 1: sol++;
		    break;
		case 2: orta++;
		    break;
		case 3: sag++; 
                    break;
	    }
	}
	System.out.println("B-nin statistiklerini gir: ");
	for(i=0; i<oyunSayi; i++){
	    B[i] = sc.nextInt();
	    switch(B[i]){
		case 1: sol++;
		    break;
		case 2: orta++;
		    break;
		case 3: sag++;    
                    break;
	    }
	}
        
	if (sol <= orta  &&  orta <= sag){
// burda <= olduqda qiymetler ferqli olmalidi amma 
// eyni seyin tekrari olacaq deye ehtiiyyac gormedim yazmaga
	    for (j=0; j<b; j++){
		System.out.print("yer ");
		for (i=0; i<a; i++) {
		    System.out.print(yer[i][j]);
                    if (i < a-1) {
                        System.out.print(", ");
                    }
		}
		switch (j){
                    case 0:   
                        System.out.println(" = 50 AZN");
                    break;
                    case 1:   
                        System.out.println(" = 100 AZN");
                    break;
                    case 2:   
                        System.out.println(" = 150 AZN");
                    break;
                    case 3:   
                        System.out.println(" = 150 AZN");
                    break;
                }  
	    } 
	}else if (sol <= sag  &&  sag <= orta){
	    for (j=0; j<b; j++){
		System.out.print("yer ");
		for (i=0; i<a; i++) {
		    System.out.print(yer[i][j]);
                    if (i < a-1) {
                        System.out.print(", ");
                    }
		}
                switch (j){
                    case 0:   
                        System.out.println(" = 50 AZN");
                    break;
                    case 1:   
                        System.out.println(" = 150 AZN");
                    break;
                    case 2:   
                        System.out.println(" = 150 AZN");
                    break;
                    case 3:   
                        System.out.println(" = 100 AZN");
                    break;
                }    
	    } 
	}else if (orta <= sag  &&  sag <= sol){
	    for (j=0; j<b; j++){
		System.out.print("yer ");
		for (i=0; i<a; i++) {
		    System.out.print(yer[i][j]);
                    if (i < a-1) {
                        System.out.print(", ");
                    }
		}
                switch (j){
                    case 0:   
                        System.out.println(" = 150 AZN");
                    break;
                    case 1:   
                        System.out.println(" = 100 AZN");
                    break;
                    case 2:   
                        System.out.println(" = 100 AZN");
                    break;
                    case 3:   
                        System.out.println(" = 50 AZN");
                    break;
                }    
	    } 
	}else if (orta <= sol  &&  sol <= sag){
	    for (j=0; j<b; j++){
		System.out.print("yer ");
		for (i=0; i<a; i++) {
		    System.out.print(yer[i][j]);
                    if (i < a-1) {
                        System.out.print(", ");
                    }
		}
                switch (j){
                    case 0:   
                        System.out.println(" = 100 AZN");
                    break;
                    case 1:   
                        System.out.println(" = 50 AZN");
                    break;
                    case 2:   
                        System.out.println(" = 50 AZN");
                    break;
                    case 3:   
                        System.out.println(" = 150 AZN");
                    break;
                }    
	    } 
	}else if (sag <= sol  &&  sol <= orta){
	    for (j=0; j<b; j++){
		System.out.print("yer ");
		for (i=0; i<a; i++) {
		    System.out.print(yer[i][j]);
                    if (i < a-1) {
                        System.out.print(", ");
                    }
		}
                switch (j){
                    case 0:   
                        System.out.println(" = 100 AZN");
                    break;
                    case 1:   
                        System.out.println(" = 150 AZN");
                    break;
                    case 2:   
                        System.out.println(" = 150 AZN");
                    break;
                    case 3:   
                        System.out.println(" = 50 AZN");
                    break;
                }    
	    } 
	}else if (sag <= orta  &&  orta <= sol){
	    for (j=0; j<b; j++){
		System.out.print("yer ");
		for (i=0; i<a; i++) {
		    System.out.print(yer[i][j]);
                    if (i < a-1) {
                        System.out.print(", ");
                    }
		}
                switch (j){
                    case 0:   
                        System.out.println(" = 150 AZN");
                    break;
                    case 1:   
                        System.out.println(" = 100 AZN");
                    break;
                    case 2:   
                        System.out.println(" = 100 AZN");
                    break;
                    case 3:   
                        System.out.println(" = 50 AZN");
                    break;
                }    
	    } 
	}

 
    }	
}

















/*
for (i=0; i<4; i++){
	    for(j=0; j<4; j++){
	    	yer[i][j] = sc.nextInt();
	    }
	}
for (i=0; i<4; i++){
	    for(j=0; j<4; j++){
	    	System.out.print(yer[i][j]+" ");
	    }
	    System.out.println();
	}



System.out.println("Oyun sayi? ");
	int oyunSayi = sc.nextInt();
	String[] A = new String[oyunSayi];
	String[] B = new String[oyunSayi];
	
	sc.nextLine();
	System.out.println("A statistikini gir: ");
	for(i=0; i<oyunSayi; i++){
	    A[i] = sc.nextLine();
	}
	System.out.println("B statistikini gir: ");
	for(i=0; i<oyunSayi; i++){
	    B[i] = sc.nextLine();
	}
*/
/*


import java.util.Scanner;

public class Array{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);	


	int a, b, i, j, k=1, yer[][];
	System.out.println("yerler necen-necesi? ");
	a=sc.nextInt(); 
	b=sc.nextInt();
	yer = new int[a][b];
	
	for (i=0; i<a; i++){
	    for(j=0; j<b; j++){
	    	yer[i][j] = k;
		k++;
	    }
	}
	for (i=0; i<a; i++){
	    for(j=0; j<b; j++){
	    	System.out.print(yer[i][j]+" ");
	    }
	    System.out.println();
	}
	System.out.println("Oyun sayi? ");
	int oyunSayi = sc.nextInt();
	int[] A = new int[oyunSayi];
	int[] B = new int[oyunSayi];
	int bir=0, iki=0, uc=0;

	System.out.println("A statistikini gir: ");
	for(i=0; i<oyunSayi; i++){
	    A[i] = sc.nextInt();
	    switch(A[i]){
		case 1: bir++;
		    break;
		case 2: iki++;
		    break;
		case 3: uc++;    
	    }
	}
	System.out.println("B statistikini gir: ");
	for(i=0; i<oyunSayi; i++){
	    B[i] = sc.nextInt();
	    switch(B[i]){
		case 1: bir++;
		    break;
		case 2: iki++;
		    break;
		case 3: uc++;    
	    }
	}
	
	int many = 50;
	if (bir < iki  &&  iki < uc){
	    for (j=0; j<b; j++){
		System.out.print("yer ");
		for (i=0; i<a; i++) {
		    if (){}
		    System.out.print(yer[i][j]+", ");
		}
		System.out.print("= "+many+" AZN"); System.out.println();
		many += 50;
	    } 
	}else if (iki > bir  &&  bir > uc){
	    for (j=0; j<b; j++){
		System.out.print("yer ");
		for (i=0; i<a; i++) {
		    System.out.print(yer[i][j]+", ");
		}
		System.out.print("= "+many+" AZN"); System.out.println();
		many -= 50;
	    } 
	}

    }
}



*/


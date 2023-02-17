package codigoajeno5;

import java.util.Scanner;

// no esta la importacion de Scanner con java
public class CodigoAgeno5 {
	//faltaba el public estatic void
			public static void main(String[] args) {
				//falta el system.in
	   Scanner s = new Scanner(System.in);
	   //las comillas van hasta el final es incorrecto tiene que antes, 
	   //tambien las intentaron cerrar con comillas simples 
	   //cuando esta usando comillas dobles al principio 
	    System.out.print("Introduzca un número:" );
	    //Aqui lo declara como un string para el sanner y mas abajo como un int 
	    int ni = s.nextInt();
	    //esta declarando una variable con  int y luego le da un string 
	    // esta mal aqui lo decalra como un styting pero luego lo quiere hacer ayor a 
	     //que es numero y eso no se puede 
	    //no entiendo bien que es lo que quizo hacer si comprar strngs o numeros 
	    
	    int c = ni;
	    ni = 1;
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (ni > 0) {
		  int digito = (ni / 2);
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
		  
		  ni /= 10;
	    }
	      
	    if (afo > noAfo) {
	    	//estaba mal el tipo de print
	      System.out.print("El " + c + " es un número afortunado.");
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }
	    
	  }
		
	}
}

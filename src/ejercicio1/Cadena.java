package ejercicio1;

/*
Realice un programa que almacene en una variable la cadena,
“Este es mi primer ejercicio”. Divida esa cadena de caracteres por letras
y las inserte en un vector(array) de tipo char.
   
Elimine del array la vocal “i”. Imprima el resultado como cadena concatenada. 
  
 Se realizará un test unitario para probar el correcto funcionamiento.
*/
public class Cadena {
	String cadena;// almacene en una variable la cadena,“Este es mi primer ejercicio”
	
	public String retornaCadenaSinLetraI(String cad) {
		
		// Divida esa cadena de caracteres por letras
		String[] cadeDividida = cad.split("");
		
		
		StringBuilder sb = new StringBuilder();
		
	    for (int i = 0; i<cadeDividida.length; i++) {
	    	// Elimine del array la vocal “i”
	    	if(!cadeDividida[i].toLowerCase().equals("i")) {
	    		sb.append(cadeDividida[i]);
	    	}
	    }
	    //inserte en un vector(array) de tipo char.
	    char [] charArr = sb.toString().toCharArray();
	    return new String(charArr);
	}
}

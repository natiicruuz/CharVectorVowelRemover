package ejercicio1;

/*
Realice un programa que almacene en una variable la cadena,
“Este es mi primer ejercicio”. Divida esa cadena de caracteres por letras
y las inserte en un vector(array) de tipo char.
   
Elimine del array la vocal “i”. Imprima el resultado como cadena concatenada. 
  
 Se realizará un test unitario para probar el correcto funcionamiento.
*/
public class Cadena {
    public String retornaCadenaSinLetraI(String cad) { //Metodo que recibe un Sting como parametro
        StringBuilder sb = new StringBuilder();

        for (char c : cad.toCharArray()) { //Iteramos sobre cada uno de los elementos del String convirtiendolo en un array de Char
            // Eliminar la vocal 'i'
            if (Character.toLowerCase(c) != 'i') { //Si el elemento por el cual iteramos NO es 'i', lo agregamos a nuestro String Builder
                sb.append(c);
            }
        }

        return sb.toString(); //Retorna el resultado como cadena concatenada. 
    }
}



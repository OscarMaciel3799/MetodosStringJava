public class Main {
    public static void main(String[] args) {
        String texto = "Metodos de texto";
        String texto2 = "Otra oracion";
        String texto3 = "              Hola Mundo             ";
        System.out.println("texto: " + texto);
        System.out.println("texto2: " + texto2);
        System.out.println("texto3:  " + texto3);

        //Convierte una cadena a letras minúsculas
        System.out.println("texto.toLowerCase()  = " + texto.toLowerCase());

        //Convierte una cadena a letras mayúsculas
        System.out.println("texto.toUpperCase()  = " + texto.toUpperCase());

        //Agrega una cadena al final de otra cadena
        System.out.println("texto.concat(texto2)  = " + texto.concat(texto2));

        //Comprueba si una cadena contiene una secuencia de caracteres
        System.out.println("texto.contains(\"hola mundo\")  = " + texto.contains("hola mundo"));

        //Devuelve la longitud de una cadena especificada
        System.out.println("texto.length()  = " + texto.length());

        //Comprueba si una cadena comienza con caracteres específicos
        System.out.println("texto.startsWith(\"hola\")  = " + texto.startsWith("hola"));

        //Comprueba si una cadena termina con los caracteres especificados.
        System.out.println("texto.endsWith(\"2\")  = " + texto.endsWith("hola"));

        //Devuelve el carácter en el índice  especificado
        System.out.println("texto.charAt(2)  = " + texto.charAt(2));

        //Compara dos cadenas lexicográficamente
        System.out.println("texto.compareTo(texto2)  = " + texto.compareTo(texto2));

        //Devuelve la posición de la primera aparición encontrada de caracteres especificados en una cadena
        System.out.println("texto.indexOf(\"de\")  = " + texto.indexOf("de"));

        //Busca una cadena para un valor específico y devuelve una nueva cadena donde se reemplazan los valores especificados
        System.out.println("texto.replace(\"texto\",\"String\")  = " + texto.replace("texto", "String"));

        //Devuelve una nueva cadena que es la subcadena de una cadena especificada
        System.out.println("texto.substring(6, 12)  = " + texto.substring(6, 12));

        //Devuelve la posición de la primera aparición encontrada de caracteres especificados en una cadena
        System.out.println("texto.trim()  = " + texto3.trim());
    }
}
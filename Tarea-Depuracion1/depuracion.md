# Depuración

1. En la función1… ¿Qué hacen estas líneas de código?

        String string2 = "string2";
    
        string2= string2.substring(0, string2.length()-1);
    
        string2=string2+"1";


La primera línea crea un String llamado string2 y le da como valor "string2", tras esto mediante substring se le quita el caracter "2" quedando así "string". Y ya, por último, añade al string el valor "1" quedando así "string1".

2. ¿Qué valen las variables string1 y string2 antes de ejecutar el código de comprobación
siguiente?

        if(string1 == string2 ) {
    
            System.out.println("SON IGUALES " + a);
        
        }
    
        else {
    
            System.out.println("SON DIFERENTES");

        }
        
Tanto string1 como string2 tienen como valor "string1".
        
3. ¿Por qué no funciona el operador == ? ¿Qué operador se debe usar en lugar de este?

El operador == no funciona porque no se pueden comparar strings con este metodo, se tiene que utilizar la operación .equals().

4. La función2() está declarada como sigue:

        public void funcion2() {
            System.out.println("--------------------");
            System.out.println("Esta es la función 2");
            System.out.println("Cómo hago la llamada para que funcione????");
        }
        
Para que funcione deberia ser "public static void funcion2()", y habría que llamarla desde el main, poniendo funcion2().
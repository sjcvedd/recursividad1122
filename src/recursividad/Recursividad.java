/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

class rec{
    boolean letraenpalabra(String[] palabra, int letra){
        if (palabra == null) {
            System.out.println("Debe ingresar una palabra");
            return false;
        }
        if (letra < 0) {
            System.out.println("Debe ingresar una posicion válida");
            return false;
        }
        if (palabra.length < letra) {
            System.out.println("La letra \"a\" \tno existe dentro de la palabra \"" + String.join("", palabra)+"\"");
            return false;
        }
        if (palabra[letra].equals("a") ) {
            System.out.println("La letra \"a\" \rSI existe dentro de la palabra \"" + String.join("", palabra)+"\"");
            return true;
        }
        return letraenpalabra(palabra, letra+1);
    }
}
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rec r = new rec();
        r.letraenpalabra("correa".split(""), 0);
    }
    
}

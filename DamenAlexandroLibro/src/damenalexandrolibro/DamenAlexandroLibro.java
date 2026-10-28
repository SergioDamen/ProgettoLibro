/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package damenalexandrolibro;

/**
 *
 * @author damen.alexandro
 */
public class DamenAlexandroLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro l1 = new Libro("Palazzo della memoria",385,30);
        Libro l2 = new Libro("Il barone rampante",313,15.50);
        
        int pagina = 385;

        if (l1.impostaPag(pagina)) {
        System.out.println(l1.toString());
        } else {
            System.out.println("ERRORE: pagina non valida");
        }
        /*System.out.println(l1.toString());
        l1.aumentaPag();
        System.out.println(l1.toString());
        l1.diminuisciPag();
        l1.diminuisciPag();
        */
        
        //System.out.println(l2.toString());
    }
}

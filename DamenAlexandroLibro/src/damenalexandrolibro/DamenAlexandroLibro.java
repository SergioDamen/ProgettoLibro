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
        Libro l1 = new Libro("Palazzo della memoria",384,30);
        Libro l2 = new Libro("Il barone rampante",312,15.50);
        
        int pagina = 385;
        if(l1.checkEvenPag(pagina)){
            
            if(l1.canImpostaPagEven(pagina)){
                l1.impostaPagEven(pagina);
             }else{
                System.out.println("ERRORE");

            }
        }else{
            if(l1.canImpostaPagOdd(pagina)){
                l1.impostaPagOdd(pagina);
            }else{
                System.out.println("ERRORE");
            }
        }
        /*System.out.println(l1.toString());
        l1.aumentaPag();
        System.out.println(l1.toString());
        l1.diminuisciPag();
        l1.diminuisciPag();
        */
        System.out.println(l1.toString());
    }
    
}

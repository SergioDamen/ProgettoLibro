/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package damenalexandrolibro;

/**
 *
 * @author damen.alexandro
 */
public class Libro {
    private String titolo;
    private int pagNumero;
    private int[] pagAttuale;
    private double prezzo;
    private boolean stato;
    public Libro(String titolo, int pagNumero, double prezzo){
        this.titolo = titolo;
        this.pagNumero = pagNumero;
        this.pagAttuale = new int[]{-1,0};
        this.prezzo = prezzo;
        this.stato = false;
    }
    public boolean getStato(){
        return this.stato;
    }
    public void aumentaPag(){
        this.pagAttuale[0] += 2;
        this.pagAttuale[1] += 2;
    }
    public void diminuisciPag(){
        this.pagAttuale[0]-= 2;
        this.pagAttuale[1] -= 2;
    }
    public boolean checkEvenPag(int pagina){
        
            return 0 == pagina % 2;
     }
    public void impostaPagEven(int pagina){
            this.pagAttuale[0] = pagina;
            this.pagAttuale[1] = pagina++;
  
    }
    public void impostaPagOdd(int pagina){
        this.pagAttuale[0] = pagina--;
        this.pagAttuale[1] = pagina;
    }
    public void cambiaStato(){
        this.stato = !this.stato;
    }
    public void applicaSconto(int sconto){
        this.prezzo -= sconto;
    }
    public String toString(){
        return "Pagina attuale" + this.pagAttuale;
    }
}

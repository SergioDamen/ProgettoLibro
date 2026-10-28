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
    private int pagFisiche;

    public Libro(String titolo, int pagNumero, double prezzo){
        this.titolo = titolo;
        this.pagNumero = pagNumero;
        this.pagAttuale = new int[]{-1, 0};
        this.prezzo = prezzo;
        this.stato = false;

        if (pagNumero % 2 == 0) {
            this.pagFisiche = pagNumero + 2;
        } else {
            this.pagFisiche = pagNumero + 1;
        }
    }
    public boolean getStato(){
        return this.stato;
    }
    public void aumentaPag(){
        if (this.pagAttuale[1] + 2 <= this.pagFisiche) {
        this.pagAttuale[0] += 2;
        this.pagAttuale[1] += 2;
        }
    }
    public void diminuisciPag() {
    if (this.pagAttuale[0] - 2 >= -1) {
        this.pagAttuale[0] -= 2;
        this.pagAttuale[1] -= 2;
        }
    }
    private boolean checkEvenPag(int pagina) {
        return pagina % 2 == 0;
    }

    private boolean canImpostaPagEven(int pagina) {
        return checkEvenPag(pagina)
                && pagina >= 2
                && pagina + 1 <= this.pagFisiche;
    }

    private boolean canImpostaPagOdd(int pagina) {
        return pagina % 2 != 0 && pagina >= 1 && pagina <= this.pagFisiche;
    }

    public boolean impostaPag(int pagina) {
        if (checkEvenPag(pagina)) {
            if (canImpostaPagEven(pagina)) {
                impostaPagEven(pagina);
                return true;
            }
        } else {
            if (canImpostaPagOdd(pagina)) {
                impostaPagOdd(pagina);
                return true;
            }
        }
        return false;
    }

    public void impostaPagEven(int pagina) {
        if (canImpostaPagEven(pagina)) {
            this.pagAttuale[0] = pagina;
            this.pagAttuale[1] = pagina + 1;
        }
    }

    public void impostaPagOdd(int pagina) {
        if (canImpostaPagOdd(pagina)) {
            this.pagAttuale[0] = pagina - 1;
            this.pagAttuale[1] = pagina;
        }
    }
    public boolean canSconto(int sconto){
        return sconto < this.prezzo;
    }
    public boolean applicaSconto(int sconto){
        if(canSconto(sconto)){
            this.prezzo -= sconto;
            return true;
        }else{
            return false;
    }
}
    public String toString(){
        return "Pagina attuale: " + this.pagAttuale[0] +","+ this.pagAttuale[1];
    }
}

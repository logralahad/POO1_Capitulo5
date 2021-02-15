/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone3;

import java.util.Random;

/**
 *
 * @author logra
 */
public class Card {
    
    private Suit suit;
    private Integer valor;

    public Card() {
        this.suit = Suit.CORAZONES;
        this.valor = 1;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit() {
        randomSuit();
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor() {
        randomValue();
    }
    
    public void showCard(){
        switch(valor) {
            case 11:
                System.out.println(String.format("J de %s", this.suit));
                break;
                
            case 12:
                System.out.println(String.format("Q de %s", this.suit));
                break;
                
            case 13:
                System.out.println(String.format("K de %s", this.suit));
                break;
                
            default:
                System.out.println(String.format("%d de %s", this.valor, this.suit));
                break;
        }
    }
    
    public void randomSuit(){
        Suit[] tipos = Suit.values();
        Random rnd = new Random();
        
        this.suit = tipos[rnd.nextInt(tipos.length)];
    }
    
    public void randomValue(){
        Random rand = new Random();
        int val = rand.nextInt(13) + 1;
        
        this.valor = val;
    }
    
    public static boolean changeCard(Card a, Card b){
        if(a.getSuit() == b.getSuit()){
            b.setSuit();
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void winWar(Card a, Card b){
        if(a.getValor() > b.getValor() && changeCard(a, b) == false){
            System.out.println("\nJugador gano!");
        }
        else if(a.getValor() < b.getValor() && changeCard(a, b) == false){
            System.out.println("\nComputadora gano!");
        }
        else{
            changeCard(a, b);
            System.out.println("\nEmpate!");
        }
    }
}

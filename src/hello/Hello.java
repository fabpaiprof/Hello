/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hello;

/**
 *
 * @author fabio
 */
public class Hello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Stampa Hello World
        System.out.println("SECONDOBRANCH");
        
        // Stampa Hello World
        System.out.println("Hello World!");
        
        /*
        N.B.
        Le primitive di Java per l'input sono state progettate
        considerando principalmente input tramite interazione grafica.
        Le primitive per input da tastiera sono abbastanza complesse.
        Java consente di definire nuove procedure per l'input, che nascondono
        quelle primitive. Noi useremo i metodi della classe ConsoleReader.
        */

        // creo un oggetto ConsoleReader
        ConsoleReader console = new ConsoleReader(System.in);
        
        System.out.println("Hey ciao, quanti anni hai ?");
        // leggo un intero
        int anni = console.readInt();
        // stampa valore inserito
        System.out.println("Anni: " + anni);

        // calcolo anno nascita
        int anno = 2025 - anni;
        // stampa anno nascita
        System.out.println("Quindi sei nato nell'anno: " + anno);
        
    }

    
}

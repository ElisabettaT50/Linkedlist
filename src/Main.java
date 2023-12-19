import java.util.LinkedList;

/*
Creare una classe Fruit che accenti nel costruttore il parametro name (String)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un LinkedList con elementi e stamparlo in console.
Aggiungere un elemento al primo posto della lista e uno all'ultimo
Stampare la collezione aggiornata
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<String> fruit = new LinkedList<>();
        fruit.add("Pineapple");
        fruit.add("Mango");
        fruit.add("Tangerine");

        fruit.addFirst("Apple");
        fruit.addLast("Grapes");

        System.out.println("My fruit list: " + fruit);
    }
}
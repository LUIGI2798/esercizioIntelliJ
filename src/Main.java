import java.util.Arrays;
import java.util.Scanner;

public class Main {






        // Metodo per moltiplicare due interi
        public static int moltiplica(int a, int b) {
            return a * b;
        }

        // Metodo per concatenare una stringa e un intero
        public static String concatena(String str, int num) {
            return str + num;
        }

        // Metodo per inserire una stringa in un array di stringhe
        public static String[] inseriscilnArray(String[] array, String str) {
            String[] nuovoArray = new String[6];
            nuovoArray[0] = array[0];
            nuovoArray[1] = array[1];
            nuovoArray[2] = str;
            nuovoArray[3] = array[2];
            nuovoArray[4] = array[3];
            nuovoArray[5] = array[4];
            return nuovoArray;
        }

        public static void main(String[] args) {


            // 1. Moltiplicazione
            int prodotto = moltiplica(5, 3);
            System.out.println("Prodotto: " + prodotto);

            // 2. Concatenazione
            String concatenato = concatena("Numero: ", 10);
            System.out.println("Concatenato: " + concatenato);

            // 3. Inserimento in array
            String[] arrayOriginale = {"A", "B", "C", "D", "E"};
            String[] nuovoArray = inseriscilnArray(arrayOriginale, "X");
            System.out.println("Nuovo array: " + Arrays.toString(nuovoArray));


            Scanner scanner = new Scanner(System.in);

            
            System.out.print("Inserisci la prima stringa: ");
            String stringa1 = scanner.nextLine();

            System.out.print("Inserisci la seconda stringa: ");
            String stringa2 = scanner.nextLine();

            System.out.print("Inserisci la terza stringa: ");
            String stringa3 = scanner.nextLine();

            // Concatenazione delle stringhe
            String concatenazioneDiretta = stringa1 + stringa2 + stringa3;
            System.out.println("Concatenazione in ordine: " + concatenazioneDiretta);

            // Concatenazione delle stringhe in ordine inverso
            String concatenazioneInversa = stringa3 + stringa2 + stringa1;
            System.out.println("Concatenazione in ordine inverso: " + concatenazioneInversa);


            scanner.close();
}

}




import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String [] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        System.out.println("Qual è il tuo nome e cognome?");
        String nomeInvitato = scan.nextLine();

        for (int i = 0; i < invitati.length; i++) {
           if (invitati[i].equals(nomeInvitato)) {
            System.out.println("Puoi entrare alla festa");
            return;      
           }
        }

        System.out.println("Non puoi entrare");

        scan.close();
    }
}

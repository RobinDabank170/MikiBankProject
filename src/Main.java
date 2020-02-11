import java.util.*;
public class Main {
    public static void main(String[] args) {
        String scelta;
        Scanner input = new Scanner(System.in);
        datiCorrentista correntista = new datiCorrentista();
        System.out.println("Benvenuto in MikiBank (Registered to Intesa San Pado)! La banca più trasparente dell'acqua!");


        do {
            System.out.println("    Centro di Amministrazione    ");
            System.out.println("Scelga una voce dal seguente menù");
            System.out.println("0 ~ Uscita e pulizia della memoria");
            System.out.println("1 ~ Visualizzazione Scheda Identificativa Cliente");
            System.out.println("2 ~ Registrazione Scheda Identificativa Cliente");
            System.out.println("3 ~ Apertura di un conto");
            System.out.println("4 ~ Gestione di un conto");
            System.out.println("5 ~ Chiusura di un conto");
            scelta = input.next();
            switch (scelta) {
                case "0":
                    System.exit(0);
                    System.gc();
                    break;

                case "1":
                    //Visualizzazione SIC
                    System.out.println("    Scheda Identificativa Cliente   ");
                    break;

                case "2":
                    //Registrazione SIC
                    System.out.println("    Inizializzazione Scheda Identificativa Cliente  ");
                    System.out.println("L'individuo è un maschio o una femmina?");
                    correntista.setSesso(input.nextBoolean());
                    System.out.println("Cognome dell'individuo: ");
                    correntista.setCognome(input.next());
                    System.out.println("Nome dell'individuo: ");
                    correntista.setNome(input.next());
                    break;

                case "3":
                    //Apertura conto
                    break;

                case "4":
                    //Gestione conto
                    break;

                case "5":
                    //Chiusura conto
                    break;


                default:
                    System.out.println("La selezione da lei effettuata non corrisponde a nessuna voce sopra indicata! Riprovare per cortesia.");
                    break;
            }

        } while(!scelta.equals("0"));
    }
}

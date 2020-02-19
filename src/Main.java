import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String scelta;
        Scanner input = new Scanner(System.in);
        datiCorrentista correntista = new datiCorrentista();
        //datiCorrentista correntista = importa();
        //datiCorrentista correntista = new datiCorrentista();
        //salvataggio(correntista);

        salvataggio(correntista);
        System.out.println("Benvenuto in MikiBank (Registered to Robin Dabank)! La banca più trasparente dell'acqua!");

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
                    correntista.setGenere(input.nextBoolean());
                    System.out.println("Cognome dell'individuo: ");
                    correntista.setCognome(input.next());
                    System.out.println("Nome dell'individuo: ");
                    correntista.setNome(input.next());
                    System.out.println("Data di nascita dell'individuo");
                    correntista.setDataNascita(input.next());
                    System.out.println("Luogo di nascita dell'individuo");
                    correntista.setLuogoNascita(input.next());
                    System.out.println("Via, città e stato di residenza dell'individuo");
                    correntista.setResidenza(input.next());
                    System.out.println("Cittadinanza dell'individuo");
                    correntista.setCittadinanza(input.next());
                    System.out.println("Stato civile dell'individuo");
                    correntista.setStatoCivile(input.next());
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

        } while (!scelta.equals("0"));
    }

    public static void salvataggio(datiCorrentista datiCorrentista) {
        File file = new File("data/datiCorrentista/data.txt");
        try {
            FileOutputStream f = new FileOutputStream(file);
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(datiCorrentista);
            o.close();
        } catch (Exception e) {
        }
    }

    public static datiCorrentista importa() {
        datiCorrentista dato = new datiCorrentista();
        try {
            FileInputStream fi = new FileInputStream(new File("data/datiCorrentista/data.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);
            dato = (datiCorrentista) oi.readObject();
            oi.close();
        } catch (Exception e) {
        }
        return dato;
    }

    //Si esegue un controllo della presenza del file
    public static void checkFile() throws IOException, ClassNotFoundException {
        //Maniglia del file
        File file = new File("data/datiCorrentista/data.txt");
        //Controllo se il file esiste
        if (file.exists()) {
            //Lettura dei dati dal file
            FileInputStream fi = new FileInputStream(new File("data/datiCorrentista/data.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);
            datiCorrentista dato = (datiCorrentista) oi.readObject();
        }

        //Creazione dell'arraylist in caso mancasse
        else {
            ArrayList<String> conti = new ArrayList<String>();
        }
    }
}

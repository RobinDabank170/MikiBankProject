import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int scelta, loginCheck;
        Scanner input = new Scanner(System.in);
        datiCorrentista Dati[] = new datiCorrentista[16];
        ArrayList<datiCorrentista> giuseppe = Controllo();
        //datiCorrentista correntista = new datiCorrentista();
        //datiCorrentista correntista = importa();
        //datiCorrentista correntista = new datiCorrentista();
        //salvataggio(correntista);


        System.out.println("Benvenuto in MikiBank (Registered to Robin Dabank)! La banca più trasparente dell'acqua!");

        //do-while con switch per gestire la Login Zone
        do {
            System.out.println("Digita 0 per uscire, digita 1 per eseguire il login");
            loginCheck = input.nextInt();
            switch (loginCheck) {
                case 0:
                    System.out.println("    Uscita dalla Login Zone    ");
                    break;

                case 1:
                    System.out.println("    Login Zone    ");
                    System.out.println("    Inserisca il nome utente    ");
                    System.out.println("    Inserisca la password    ");
                    File login = new File("users/dataAccount/userinfo.txt");
                    if (login.exists()) {
                        //Lettura dei dati dal file
                        try {
                            FileInputStream fi = new FileInputStream(new File("data/datiCorrentista/data.txt"));
                            ObjectInputStream oi = new ObjectInputStream(fi);
                            datiCorrentista dato = (datiCorrentista) oi.readObject();
                        } catch (Exception e) {
                        }
                    } else {
                        try {
                            login.createNewFile();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    //loginForm();
                    break;
            }

        } while (loginCheck != 1);

        do {
            System.out.println("    Centro di Amministrazione    ");
            System.out.println("Scelga una voce dal seguente menù");
            System.out.println("0 ~ Uscita e pulizia della memoria");
            System.out.println("1 ~ Visualizzazione Scheda Identificativa Cliente");
            System.out.println("2 ~ Registrazione Scheda Identificativa Cliente");
            System.out.println("3 ~ Apertura di un conto");
            System.out.println("4 ~ Gestione di un conto");
            System.out.println("5 ~ Chiusura di un conto");
            scelta = input.nextInt();
            switch (scelta) {
                case 0:
                    System.gc();
                    System.exit(0);
                    break;

                case 1:
                    //Visualizzazione SIC
                    System.out.println("    Scheda Identificativa Cliente   ");
                    for (int i = 0; i < giuseppe.size(); i++) {
                        try {
                            System.out.println(i + ": " + giuseppe.get(i).toString());
                        } catch (NullPointerException e) {
                            System.out.println(i + ": " + "vuoto");
                        }
                    }
                    break;

                case 2:
                    //Registrazione SIC
                    String setGenereT, setCognomeT, setNomeT, setDataNascitaT, setLuogoNascitaT, setResidenzaT, setCittadinanzaT, setStatoCivileT;
                    System.out.println("    Inizializzazione Scheda Identificativa Cliente  ");
                    System.out.println("L'individuo è un maschio o una femmina?");
                    setGenereT = input.next();
                    System.out.println("Cognome dell'individuo: ");
                    setCognomeT = input.next();
                    System.out.println("Nome dell'individuo: ");
                    setNomeT = input.next();
                    System.out.println("Data di nascita dell'individuo");
                    setDataNascitaT = input.next();
                    System.out.println("Luogo di nascita dell'individuo");
                    setLuogoNascitaT = input.next();
                    System.out.println("Via, città e stato di residenza dell'individuo");
                    setResidenzaT = input.next();
                    System.out.println("Cittadinanza dell'individuo");
                    setCittadinanzaT = input.next();
                    System.out.println("Stato civile dell'individuo");
                    setStatoCivileT = input.next();
                    giuseppe.add(new datiCorrentista(setCognomeT, setNomeT, setGenereT, setDataNascitaT, setLuogoNascitaT, setResidenzaT, setCittadinanzaT, setStatoCivileT, true, setGenereT, true));
                    break;

                case 3:
                    //Apertura conto
                    break;

                case 4:
                    //Gestione conto
                    break;

                case 5:
                    //Chiusura conto
                    break;

                default:
                    System.out.println("La selezione da lei effettuata non corrisponde a nessuna voce sopra indicata! Riprovare per cortesia.");
                    break;
            }

        } while (scelta != 0);
    }


    public static void Lettura() {
            try {
                File file = new File("Demo.txt");
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                StringBuffer sb = new StringBuffer();
                String line;
                while ((line = br.readLine()) != null) {
                    sb.append(line);
                    sb.append("\n");
                }
                fr.close();
                System.out.println("Contents of File: ");
                System.out.println(sb.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static ArrayList<datiCorrentista> Controllo() throws Exception {
            File diocane = new File("dati.txt");
            ArrayList<datiCorrentista> elencocorrentisti;
            if (diocane.exists()){
                FileInputStream inputStream = new FileInputStream(diocane);
                ObjectInputStream reader = new ObjectInputStream(inputStream);
                //noinspection unchecked
                elencocorrentisti = (ArrayList<datiCorrentista>) reader.readObject();
                reader.close();
                inputStream.close();
            }else {
                elencocorrentisti = new ArrayList<datiCorrentista>();
            }
            return elencocorrentisti;
        }



    /*public static void salvataggio(datiCorrentista datiCorrentista) {
        File file = new File("data/datiCorrentista/data.txt");
        try {
            FileOutputStream f = new FileOutputStream(file);
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(datiCorrentista);
            o.close();
        } catch (Exception e) {
        }
    }*/

    /*public static datiCorrentista importa() {
        datiCorrentista dato = new datiCorrentista();
        try {
            FileInputStream fi = new FileInputStream(new File("data/datiCorrentista/data.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);
            dato = (datiCorrentista) oi.readObject();
            oi.close();
        } catch (Exception e) {
        }
        return dato;
    }*/
/*
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

    //Metodo privato che gestisce esclusivamente il login form per gli amministratori e per gli utenti
    private static void loginForm() {
        Scanner scan = null;
        try {
            scan = new Scanner(new File("users/dataAccount/userinfo.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner keyboard = new Scanner(System.in);
        String user = scan.next();
        String pass = scan.next();

        String inpUser = keyboard.nextLine();
        String inpPass = keyboard.nextLine();

        if (inpUser.equals(user) && inpPass.equals(pass)) {
            System.out.println("Login effettuato con successo. Bentornato");
        } else {
            System.out.println("Login non effettuato. Le credenziali immesse non sono corrette. Riprovare");
        }


    }
    */
    }


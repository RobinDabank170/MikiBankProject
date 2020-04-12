import java.io.Serializable;

public class datiCorrentista implements Serializable {
    static String cognome;
    static String nome;
    static String codiceFiscale;
    static String dataNascita;
    static String luogoNascita;
    static String residenza;
    static String provincia;
    static String cittadinanza;
    static String statoCivile;
    static boolean accreditoStipendio;
    static String genere;
    static boolean clienteRegistrato;

    public datiCorrentista(String cognome, String nome, String codiceFiscale, String dataNascita, String luogoNascita, String residenza, String cittadinanza, String statoCivile, boolean accreditoStipendio, String genere, boolean clienteRegistrato) {
        this.cognome = cognome;
        this.nome = nome;
        //this.codiceFiscale = codiceFiscale;
        this.provincia = provincia;
        this.dataNascita = dataNascita;
        this.luogoNascita = luogoNascita;
        this.residenza = residenza;
        this.cittadinanza = cittadinanza;
        this.statoCivile = statoCivile;
        this.accreditoStipendio = accreditoStipendio;
        this.genere = genere;
        this.clienteRegistrato = clienteRegistrato;
    }



    public static String getCognome() {
        return cognome;
    }

    public static void setCognome(String cognome) {
        datiCorrentista.cognome = cognome;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        datiCorrentista.nome = nome;
    }

    public static String getCodiceFiscale() {
        return codiceFiscale;
    }

    public static void setCodiceFiscale(String codiceFiscale) {
        datiCorrentista.codiceFiscale = codiceFiscale;
    }

    public static String getDataNascita() {
        return dataNascita;
    }

    public static void setDataNascita(String dataNascita) {
        datiCorrentista.dataNascita = dataNascita;
    }

    public static String getLuogoNascita() {
        return luogoNascita;
    }

    public static void setLuogoNascita(String luogoNascita) {
        datiCorrentista.luogoNascita = luogoNascita;
    }

    public static String getResidenza() {
        return residenza;
    }

    public static void setResidenza(String residenza) {
        datiCorrentista.residenza = residenza;
    }

    public static String getProvincia() {
        return provincia;
    }

    public static void setProvincia(String provincia) {
        datiCorrentista.provincia = provincia;
    }

    public static String getCittadinanza() {
        return cittadinanza;
    }

    public static void setCittadinanza(String cittadinanza) {
        datiCorrentista.cittadinanza = cittadinanza;
    }

    public static String getStatoCivile() {
        return statoCivile;
    }

    public static void setStatoCivile(String statoCivile) {
        datiCorrentista.statoCivile = statoCivile;
    }

    public static boolean isAccreditoStipendio() {
        return accreditoStipendio;
    }

    public static void setAccreditoStipendio(boolean accreditoStipendio) {
        datiCorrentista.accreditoStipendio = accreditoStipendio;
    }

    public static String getGenere() {
        return genere;
    }

    public static void setGenere(String genere) {
        datiCorrentista.genere = genere;
    }

    public static boolean isClienteRegistrato() {
        return clienteRegistrato;
    }

    public static void setClienteRegistrato(boolean clienteRegistrato) {
        datiCorrentista.clienteRegistrato = clienteRegistrato;
    }

    public String toString() {
        return "datiCorrentista{" +
                "cognome='" + getCognome() + '\'' +
                ", nome='" + getNome() + '\'' +
                ", codiceFiscale='" + getCodiceFiscale() + '\'' +
                ", dataNascita='" + getDataNascita() + '\'' +
                ", luogoNascita='" + getLuogoNascita() + '\'' +
                ", residenza='" + getResidenza() + '\'' +
                ", provincia='" + getProvincia() + '\'' +
                ", cittadinanza='" + getCittadinanza() + '\'' +
                ", statoCivile='" + getStatoCivile() + '\'' +
                ", accreditoStipendio=" + isAccreditoStipendio() +
                ", genere='" + getGenere() + '\'' +
                ", clienteRegistrato=" + isClienteRegistrato() +
                '}';
    }
}


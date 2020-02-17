import java.io.Serializable;

public class datiCorrentista implements Serializable {
    String cognome;
    String nome;
    String codiceFiscale;
    String dataNascita;
    String luogoNascita;
    String residenza;
    String provincia;
    String cittadinanza;
    String statoCivile;
    boolean accreditoStipendio;
    boolean genere;
    boolean clienteRegistrato;


    public datiCorrentista(){

    }

    public datiCorrentista(String cognome, String nome, String codiceFiscale, String dataNascita, String luogoNascita, String residenza, String cittadinanza, String statoCivile, boolean accreditoStipendio, boolean genere, boolean clienteRegistrato) {
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

    public datiCorrentista(String cognome, String nome, String provincia, String dataNascita, String luogoNascita, boolean genere) {
        this.cognome = cognome;
        this.nome = nome;
        this.provincia = provincia;
        this.dataNascita = dataNascita;
        this.luogoNascita =  luogoNascita;
        this.genere = genere;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getProvincia(){
        return provincia;
    }

    public String getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(String dataNascita) {
        this.dataNascita = dataNascita;
    }

    public String getLuogoNascita() {
        return luogoNascita;
    }

    public void setLuogoNascita(String luogoNascita) {
        this.luogoNascita = luogoNascita;
    }

    public String getResidenza() {
        return residenza;
    }

    public void setResidenza(String residenza) {
        this.residenza = residenza;
    }

    public String getCittadinanza() {
        return cittadinanza;
    }

    public void setCittadinanza(String cittadinanza) {
        this.cittadinanza = cittadinanza;
    }

    public String getStatoCivile() {
        return statoCivile;
    }

    public void setStatoCivile(String statoCivile) {
        this.statoCivile = statoCivile;
    }

    public boolean isAccreditoStipendio() {
        return accreditoStipendio;
    }

    public void setAccreditoStipendio(boolean accreditoStipendio) {
        this.accreditoStipendio = accreditoStipendio;
    }

    public boolean isGenere() {
        return genere;
    }

    public void setGenere(boolean genere) {
        this.genere = genere;
    }

    public boolean isClienteRegistrato() {
        return clienteRegistrato;
    }

    public void setClienteRegistrato(boolean clienteRegistrato) {
        this.clienteRegistrato = clienteRegistrato;
    }

    @Override
    public String toString() {
        return "Le informazioni sull'individuo correntista sono:"
                + "";
    }
}


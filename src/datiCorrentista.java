public class datiCorrentista {
    String cognome;
    String nome;
    String codiceFiscale;
    String dataNascita;
    String luogoNascita;
    String residenza;
    String cittadinanza;
    String statoCivile;
    boolean accreditoStipendio;
    boolean sesso;
    boolean clienteRegistrato;


    public datiCorrentista(){}

    public datiCorrentista(String cognome, String nome, String codiceFiscale, String dataNascita, String luogoNascita, String residenza, String cittadinanza, String statoCivile, boolean accreditoStipendio, boolean sesso, boolean clienteRegistrato) {
        this.cognome = cognome;
        this.nome = nome;
        this.codiceFiscale = codiceFiscale;
        this.dataNascita = dataNascita;
        this.luogoNascita = luogoNascita;
        this.residenza = residenza;
        this.cittadinanza = cittadinanza;
        this.statoCivile = statoCivile;
        this.accreditoStipendio = accreditoStipendio;
        this.sesso = sesso;
        this.clienteRegistrato = clienteRegistrato;
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

    public boolean isSesso() {
        return sesso;
    }

    public void setSesso(boolean sesso) {
        this.sesso = sesso;
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


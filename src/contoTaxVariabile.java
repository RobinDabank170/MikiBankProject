public class contoTaxVariabile extends datiCorrentista {
    public contoTaxVariabile(){}
    public contoTaxVariabile(String cognome, String nome, String codiceFiscale, String dataNascita, String luogoNascita, String residenza, String cittadinanza, String statoCivile, boolean accreditoStipendio, boolean sesso, boolean clienteRegistrato) {
        super(cognome, nome, codiceFiscale, dataNascita, luogoNascita, residenza, cittadinanza, statoCivile, accreditoStipendio, sesso, clienteRegistrato);
    }

    @Override
    public String toString() {
        return "contoTaxVariabile{}";
    }
}


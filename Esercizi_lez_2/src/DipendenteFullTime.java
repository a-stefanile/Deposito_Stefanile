public class DipendenteFullTime extends Dipendente{
    public DipendenteFullTime(long id, String nome, String cognome,double paga, int orario) {
        super(id,nome,cognome,paga,orario);
    }


    @Override
    public double calcolaStipendio(){
        return this.paga;
    }
}

public class DipendentePart extends Dipendente{
    public DipendentePart(long id, String nome, String cognome, double paga, int orario ){
        super(id,nome,cognome,paga,orario);
    }

    @Override
    public double calcolaStipendio(){
        return this.paga*this.orario;
    }
}

public abstract class  Dipendente implements Stipendiabile{
    long id;
    String nome;
    String cognome;
    double paga;
    int orario;

    public Dipendente(){
        this.id = 0;
        this.nome = "";
        this.cognome = "";
        this.paga = 0;
        this.orario = 0;
    }

    public Dipendente(long id, String nome, String cognome, double paga, int orario){
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.paga = paga;
        this.orario = orario;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public double getPaga() {
        return paga;
    }
    public void setPaga(double paga) {
        this.paga = paga;
    }
    public int getOrario() {
        return orario;
    }
    public void setOrario(int orario) {
        this.orario = orario;
    }

    @Override
    public String toString(){
        return ("Dipendente: id = " + id+ " nome: " + nome + " cognome: "+ cognome + " stipendio: "+ this.calcolaStipendio());
    }
}

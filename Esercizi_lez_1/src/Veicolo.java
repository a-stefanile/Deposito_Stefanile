public abstract class Veicolo {
    protected String marca;
    protected String modello;

    public Veicolo() {
        this.marca = "";
        this.modello = "";
    }
    public Veicolo(String marca, String modello) {
        this.marca = marca;
        this.modello = modello;
    }

    public abstract void muovi();

    public void mostraDettagli(){
        System.out.println("Marca: "+marca);
        System.out.println("Modello: "+modello);
    }

    public void avviaMotore(){
        System.out.println("Motore della macchina "+ marca+" modello "+ modello +"è stato avviato");
    }

}

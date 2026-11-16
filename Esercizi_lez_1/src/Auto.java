public class Auto extends Veicolo {
    public Auto(String marca, String modello){
        super(marca,modello);
    }

    @Override
    public void muovi(){
        System.out.println("L'auto si sta muovendo");
    }
}

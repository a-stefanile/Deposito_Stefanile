public class Termostato {

    private static final Termostato INSTANCE = new Termostato();
    private double temp = 20.0;

    private Termostato(){}

    public static Termostato getInstance(){
        return INSTANCE;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }


}

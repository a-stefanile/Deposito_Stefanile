public enum Distributore {
    INSTANCE;

    private double credit = 0.0;

    public void insert(double value){
        if(value > 0){
            this.credit += value;
        }
    }

    public boolean erogation(double price){
        if(this.credit > price){
            this.credit -= price;
            return true;
        }
        return false;
    }

    public double getCredit(){
        return this.credit;
    }
}


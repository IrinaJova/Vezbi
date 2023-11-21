class Brod extends Transport {
    double potrosuvackaNaNafta;
    double cenaNaNafta;

    public Brod(double tezinaNaTovar, int dolzinaVoKm, double potrosuvackaNaNafta, double cenaNaNafta) {
        super(tezinaNaTovar, dolzinaVoKm);
        this.potrosuvackaNaNafta = potrosuvackaNaNafta;
        this.cenaNaNafta = cenaNaNafta;
    }


    public double presmetajCena() {
        return (potrosuvackaNaNafta * dolzinaVoKm / 100) * cenaNaNafta;
    }
}

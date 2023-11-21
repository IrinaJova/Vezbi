class Voz extends Transport{
    double potrosenaStruja;
    double cenaNaStruja;

    public Voz (double tezinaNaTovar, int dolzinaVoKm, double potrosenaStruja, double cenaNaStruja ) {
        super(tezinaNaTovar, dolzinaVoKm);
        this.potrosenaStruja=potrosenaStruja;
        this.cenaNaStruja=cenaNaStruja;
    }



    public double presmetajCena() {
        return dolzinaVoKm*potrosenaStruja*cenaNaStruja;
    }
}

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
Voz voz=new Voz(25.3,10,15.3,655.3);
Brod brod=new Brod(48.3,5,65.2, 69.5);
    System.out.println("Podatoci za voz:");
    System.out.println("Tezina na tovar: "+ voz.tezinaNaTovar + "kg.");
    System.out.println("Dolzina na kilometri: " + voz.dolzinaVoKm + "km.");
    System.out.println("Cena na transport: "+ voz.presmetajCena() + "den.");

    System.out.println("Podatoci za brod:");
    System.out.println("Tezina na tovar: " + brod.tezinaNaTovar + "kg.");
    System.out.println("Dolzina na kilometri: "+ brod.dolzinaVoKm + "km.");
    System.out.println("Cena na transport: " + brod.presmetajCena() + "den.");
        }

}
public class Main {
    public static void main(String[] args) {

        var usuario1 = new Usuario("Beatriz", "beatriz.bortolai@gmail.com", "517.464.818-38", "AF42578");
        var usuario2 = new Usuario("Bárbara", "barbarabonome@gmail.com", "819.312.454-61", "5621aAD");

        var linha04 = new linha_metro(4, "Amarela", "Luz");
        var linha05 = new linha_metro(5,"Lilás","Capão Redondo");
        var linha08 = new linha_metro(8,"Diamante","Júlio Prestes");
        var linha09 = new linha_metro(9,"Esmeralda","Santo Amaro");

        System.out.println(usuario1);
        System.out.println(usuario2);
        System.out.println(linha04);
        System.out.println(linha05);
        System.out.println(linha08);
        System.out.println(linha09);
    }
}

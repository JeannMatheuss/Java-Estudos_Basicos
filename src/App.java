public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: "+ anoDeLancamento);

        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        System.out.println("Está incluido no plano? " + incluidoNoPlano);
        System.out.println("Nota do filme: " + notaDoFilme);

        double media = (9.1 + 6.5 + 8) / 3;
        System.out.println("A média é: " + media);

        String sinopse;
        sinopse = "Filme de ação e aventura com aviões";
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media/2);
        System.out.println(classificacao);
    }
}

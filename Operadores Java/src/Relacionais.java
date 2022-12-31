public class Relacionais {
    public static void main(String[] args) throws Exception {

        String nomeUm = "Priscilla";
        String nomeDois = "Freimam";
        boolean resultado5 = nomeUm == nomeDois;
        System.out.println("Nomes Iguais = " + resultado5);

        int a, b;
        a = 5;
        b = 6;

        String resultado = (a==b) ? "verdadeiro" : "false";
        System.out.println(resultado);

        String resultado2 = (a!=b) ? "verdadeiro" : "false";
        System.out.println(resultado2);

        String resultado3 = (a>b) ? "verdadeiro" : "false";
        System.out.println(resultado3);

        String resultado4 = (a<b) ? "verdadeiro" : "false";
        System.out.println(resultado4);
}
}
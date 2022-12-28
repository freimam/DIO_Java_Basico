public class MinhaClasse {
    //se arquivo principal, executável, deverá ter uma metodo main
    public static void main (String [] args) {
        /*//void não retorna
        //[] array
        //args - argumentos
        System.out.print ("Olá Turma!");
        //System.out.print - imprime na tela
        int ANO = 2020;
        //variável ANO pode mudar
        final String BR = "Brasil";
        //final significa que variavel não muda, e a mesma e escrita em Maiuscula.
        double PI = 3.14;
        int ESTADOS_BRASILEIROS = 27;
        
        //declaraçaõ variavel
        int idade = 23;
        }*/
      
        String primeiroNome = "Priscilla";
        String segundoNome = "Freimam";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.println(nomeCompleto);}
      //declarando metodos
      public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do Método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}


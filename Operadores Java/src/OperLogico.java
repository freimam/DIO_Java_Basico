public class OperLogico {
    public static void main(String[] args) throws Exception {
        boolean condicao1=true;
        boolean condicao2=false;

        //&& - E - Os dois valores precisam ser verdadeiros.

        if(condicao1 && condicao2)
	    System.out.print("Os dois valores precisam ser verdadeiros");

        // || - OU - Um dos valores precisam ser verdadeiros.

        if(condicao1 || condicao2)
	    System.out.print("Um dos valores precisa ser verdadeiro");

        }
}
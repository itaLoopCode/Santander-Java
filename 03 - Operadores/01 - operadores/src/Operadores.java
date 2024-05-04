public class Operadores {
    public static void main(String[] args) throws Exception {

        // incrementando
        int numero = 5;
        // x repetição

        // numero++

        System.out.println(numero--);
        System.out.println(numero);

        // invertendo valor de boolean

        boolean variavel = true;

        variavel = !variavel;

        System.out.println(variavel);

        // exemplo de condicional utilizando uma estrutura if/else(Ternário)
        int a, b;
        a = 5;
        b = 6;
        // String resultado ="";
        // if(a==b)
        // resultado = "verdadeiro";
        // else
        // resultado = "falso";

        String resultado = a == b ? "verdadeiro" : "falso";

        System.out.println(resultado);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2) {
            System.out.println("A nossa condição é verdadeira");
        }

        System.out.println("numeroUm é igual a numeroDois" + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de numeroDois" + simNao);

        simNao = numero1 > numero2;

        // operadores lógicos

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeira");
        }
        ;

        if (condicao1 || condicao2) {
            System.out.println("Uma condição é verdadeira");

            System.out.println("Fim");
        }
    }
}
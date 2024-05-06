// Cenário 1

public class condicaoTernaria1 {

    public static void main(String[] args) {
        int nota = 7;
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
    }

    // Cenário 2
    public class condicaoTernaria2 {

        public static void main(String[] args) {
            int nota = 6;
            String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
            System.out.println(resultado);
        }
    }

}

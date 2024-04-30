public class MinhaClasse {
    public static void main(String[] args) {
        System.out.print("Olá tuma, sejam bem vindos!");

        String primeiroNome = "Italo";
        String segundoNome = "Silva";

        String Nomecompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(Nomecompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método" + primeiroNome.concat(" ").concat(segundoNome);
    }

}

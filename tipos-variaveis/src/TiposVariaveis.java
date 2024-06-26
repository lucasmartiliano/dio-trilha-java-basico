public class TiposVariaveis {
    public static void main(String[] args) {
        byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
		float pi = 3.14F;
		double salario = 1275.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        final double VALOR_DE_PI = 3.14;
		
        System.out.println(idade + ano + cep + cpf + pi + salario + numeroCurto2);
        System.out.println(VALOR_DE_PI);
		// VALOR_DE_PI=3.15; Esta linha vai apresentar erro de compilação!
    }
}

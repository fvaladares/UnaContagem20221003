import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int maiorValor = Integer.MIN_VALUE;
        int menorValor = Integer.MAX_VALUE;
        int valorInformado;
        Scanner entrada = new Scanner(System.in);

//        System.out.printf("Por favor, informe o " +
//                "%do. valor: ", (1));
//        valorInformado = entrada.nextInt();
//        maiorValor = menorValor = valorInformado;
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.printf("Por favor, informe o " +
                    "%do. valor: ", (i + 1));
            valorInformado = entrada.nextInt();
            System.out.println();
            if (valorInformado > maiorValor) {
                maiorValor = valorInformado;
            } else if (valorInformado < menorValor) {
                menorValor = valorInformado;
            }
        }
        System.out.println("-----------------");
        System.out.println("Maior valor informado: " + maiorValor);
        System.out.println("Menor valor informado: " + menorValor);
    }
}
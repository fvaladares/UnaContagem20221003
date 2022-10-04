import java.util.Scanner;

public class Somatorio {
    public static void main(String[] args) {
        int somatorio;
        int n;
        int i;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Por favor, informe o limite do somatório: ");
        n = entrada.nextInt();

        System.out.println();
        somatorio = 0;
        for (i = 0; i <= n; i++) {
            somatorio = somatorio + i;
        }
        System.out.println("Somatório com for: " + somatorio);
        somatorio = 0;
        i = 0;
        while (i <= n) {
            somatorio = somatorio + i;
            i = i + 1;
        }
        System.out.println("Somatório com while: " + somatorio);
        System.out.println("O valor de i: " + i);
        // somatorio = 0|0|1|3|6
        // i = 0        |1|2|3|4
        // n = 3
    }
}

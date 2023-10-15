import java.util.Scanner;
//projeto contador
public class contador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("------------------");
        System.out.println("CONTROLE DE FLUXO");
        System.out.println("------------------");
        System.out.println("Digite dois valores para saber o número de interações entre eles.");
        System.out.println("Digite o #1º primeiro valor: ");
        int paramentro1 = lerInteiro(input);

        System.out.println("Digite o #2º valor: ");
        int paramentro2 = lerInteiro(input);

        try{
            contar(paramentro1, paramentro2);
        }catch (parametrosInvalidosException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void contar(int parametroUm, int parametroDois) throws parametrosInvalidosException {

            if (parametroUm >= parametroDois) {
                throw new parametrosInvalidosException();
            }else {
                int diferenca = parametroDois - parametroUm;
                for (int i = 1; i <= diferenca; ++i) {
                    System.out.println(i + "ª passo: " + i);
                }
            }
    }

    public static int lerInteiro(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro:");
            }
        }
    }

}
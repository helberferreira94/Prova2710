import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //solicitar nome do funcionario
        String nomeFuncionario;
        double pesoFuncionario;
        double aguaIngerida;
        double aguaIdeal;
        double quantidadeAIngerir;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome" );
        nomeFuncionario = sc.nextLine();
        System.out.println("Digite seu peso em KG" );
        pesoFuncionario = sc.nextDouble();
        System.out.println("Digite a água ingerida até agora em Litros");
        aguaIngerida = sc.nextDouble();
        sc.close();
        //calcular a água ideal
        aguaIdeal = pesoFuncionario * 0.035;
        aguaIdeal = Math.ceil(aguaIdeal);              
        //Calcular a quantidade a ingerir no dia.
        //Fórmula: Quantidade ideal a Ingerir – Quantidade Ingerida
        quantidadeAIngerir = aguaIdeal - aguaIngerida;
        quantidadeAIngerir = Math.ceil(quantidadeAIngerir);              
        if (quantidadeAIngerir < 0) {
            System.out.println("Parabéns, você atingiu a meta de hidratação diária!");
            
        }
        
        else {

            System.out.printf("Continue focado em se hidratar por hoje, ainda faltam %.0f Litros. Você consegue!" , quantidadeAIngerir);

        
    }
    }
}


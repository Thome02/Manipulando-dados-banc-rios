import java.util.Scanner;
public class DadosBancarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 2500;
        System.out.println("""
       *******************************************
       |  nome:                 IGOR ROSA        |
       |  Tipo Conta:           Corrente         |
       |  Saldo Inicial:        R$ 2500,0        |
       *******************************************""");
       System.out.println("""
               

               """);
       System.out.println("Operações");
       System.out.println("");
       System.out.println("""
        1- Consultar saldos
        2- Receber Valor
        3- Tranferir Valor
        4- Sair
        Digite a opção desejada:
        """);
        int oqFazer = scanner.nextInt();    
        while (oqFazer != 4) {
            if (oqFazer == 1) {
                System.out.println("O saldo atual é de R$ " + saldo);
                System.out.println("""


                1- Consultar saldos
                2- Receber Valor
                3- Tranferir Valor
                4- Sair
                Digite a opção desejada:""");
                
                oqFazer = scanner.nextInt();    
            
            }
            else if (oqFazer == 2) {
                System.out.println("Informe o valor a Receber:");
                double valorReceber = scanner.nextDouble();
                saldo = saldo + valorReceber;
                System.out.println("");
                System.out.println("O seu Saldo é: " + saldo);
                System.out.println("""


                1- Consultar saldos
                2- Receber Valor
                3- Tranferir Valor
                4- Sair
                Digite a opção desejada:""");
                
                oqFazer = scanner.nextInt();  
            }
            else if (oqFazer == 3) {
                System.out.println("Informe o valor que deseja transferir:");
                System.out.println("""
                    """);
                double valorTransferir = scanner.nextDouble();
                if (saldo < valorTransferir) {
                    System.out.println("O valor que vc esta tentando transferir é maior que o seu saldo");
                }
                else if (valorTransferir == 0) {
                System.out.println("Não é possivel realizar uma transação de R$ 0");
                } 
                else {
                    saldo = saldo - valorTransferir;
                    System.out.println("Saldo atualizado, vc retirou R$" + valorTransferir + " e agora seu saldo é de: R$" + saldo);
                }
                System.out.println("""


                1- Consultar saldos
                2- Receber Valor
                3- Tranferir Valor
                4- Sair
                Digite a opção desejada:""");
                
                oqFazer = scanner.nextInt();  
            }
            else if (oqFazer == 4) {
                
            }
        }
        System.out.println("""
                        
                Você escolheu fechar o programa
                        """);

    }
    
}


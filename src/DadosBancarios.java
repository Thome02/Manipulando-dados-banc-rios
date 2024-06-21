import java.util.Scanner;
import projeto.DadosDoCliente;
public class DadosBancarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DadosDoCliente dadosD = new DadosDoCliente();
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
        dadosD.setOqFazer(scanner.nextInt());    
        while (dadosD.getOqFazer() != 4) {
            if (dadosD.getOqFazer() == 1) {
                System.out.println("O saldo atual é de R$ " + dadosD.getSaldo());
                System.out.println("""


                1- Consultar saldos
                2- Receber Valor
                3- Tranferir Valor
                4- Sair
                Digite a opção desejada:""");
                
                dadosD.setOqFazer(scanner.nextInt());
            
            }
            else if (dadosD.getOqFazer() == 2) {
                System.out.println("Informe o valor a Receber:");
                dadosD.setValorReceber(scanner.nextDouble());
                dadosD.Receber();
                System.out.println("");
                System.out.println("O seu Saldo é: " + dadosD.getSaldo());
                System.out.println("""


                1- Consultar saldos
                2- Receber Valor
                3- Tranferir Valor
                4- Sair
                Digite a opção desejada:""");
                
                dadosD.setOqFazer(scanner.nextInt());  
            }
            else if (dadosD.getOqFazer() == 3) {
                System.out.println("Informe o valor que deseja transferir:");
                System.out.println("""
                    """);
                dadosD.setValorTransferir(scanner.nextDouble());
                if (dadosD.getSaldo() < dadosD.getValorTransferir() ) {
                    System.out.println("O valor que vc esta tentando transferir é maior que o seu saldo");
                }
                else if (dadosD.getValorTransferir() == 0) {
                System.out.println("Não é possivel realizar uma transação de R$ 0");
                } 
                else {
                    dadosD.transacao();
                    System.out.println("Saldo atualizado, vc retirou R$" + dadosD.getValorTransferir() + " e agora seu saldo é de: R$" + dadosD.getSaldo());
                }
                System.out.println("""


                1- Consultar saldos
                2- Receber Valor
                3- Tranferir Valor
                4- Sair
                Digite a opção desejada:""");
                
                dadosD.setOqFazer(scanner.nextInt());  
            }
            else if (dadosD.getOqFazer() == 4) {
                
            }
        }
        System.out.println("""
                        
                Você escolheu fechar o programa
                        """);

    }
    
}


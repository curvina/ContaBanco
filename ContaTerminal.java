import java.util.Scanner; // Importar a classe Scanner para ler entradas do usuário

public class ContaTerminal {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para ler a entrada do terminal
        Scanner scanner = new Scanner(System.in);
        
        // Declaração de variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        
        // Solicitar informações do usuário
        System.out.print("Por favor, digite o número da conta: ");
        numero = scanner.nextInt(); // Ler um número inteiro
        
        scanner.nextLine(); // Consumir a quebra de linha restante

        System.out.print("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine(); // Ler uma linha de texto
        
        System.out.print("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.nextLine(); // Ler uma linha de texto
        
        System.out.print("Por favor, digite o saldo inicial: ");
        saldo = scanner.nextDouble(); // Ler um número decimal
        
        // Fechar o scanner para liberar recursos
        scanner.close();
        
        // Mensagem de saída usando concatenação e o método concat da classe String
        String mensagem = "Olá ".concat(nomeCliente)
                         .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                         .concat(agencia)
                         .concat(", conta ")
                         .concat(Integer.toString(numero))
                         .concat(" e seu saldo ")
                         .concat(Double.toString(saldo))
                         .concat(" já está disponível para saque.");
        
        // Exibir a mensagem
        System.out.println(mensagem);
    }
}

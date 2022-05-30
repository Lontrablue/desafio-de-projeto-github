public class Main {
    public static void main(String[] args) {
        Conta continha = new ContaCorrente();
        Conta continha2 = new ContaInvestimentos();
        Cliente gui = new Cliente("gui", "123456", "senhadogui", continha);
        Cliente bru = new Cliente("bru", "654321", "senhadabru", continha2);

        System.out.println("depositando 100 na conta de gui");
        continha.depositar(100);
        System.out.println("\n");
        System.out.println("depositando 150 na conta de gui");
        continha.depositar(150);
        System.out.println("\n");
        System.out.println("sacando 20 da conta de gui");
        continha.sacar(20);
        System.out.println("\n");
        System.out.println("depositando 100 na conta de bru");
        continha2.depositar(100);
        System.out.println("\n");
        System.out.println("transferindo 50 e gui para bru");
        continha.transferir(50, continha2);
        System.out.println("\n");
        System.out.println("imprimindo saldo de gui");
        continha.imprimirSaldo();
        System.out.println("\n");
        System.out.println("imprimindo saldo de bru");
        continha2.imprimirSaldo();
        System.out.println("\n");
        System.out.println("imprimindo histórico da conta de gui");
        continha.imprimirHistorico();
        System.out.println("\n");
        System.out.println("imprimindo histórico da conta de bru");
        continha2.imprimirHistorico();

        //PROXIMAS IMPLEMENTAÇÕES: PEDIR SENHA, SIMULAR RENDIMENTOS--AHH, NAO ESQUEÇA DE CRIAR O REPOSITÓRIO SEPARADO

    }
}

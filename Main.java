public class Main {

    public static void main(String[] args) {
        Cliente patricia = new Cliente();
        patricia.setNome("Patricia");

        Conta cc = new ContaCorrente(patricia);
        Conta poupanca = new ContaPoupanca(patricia);

        cc.depositar(1000);
        cc.transferir(500, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}

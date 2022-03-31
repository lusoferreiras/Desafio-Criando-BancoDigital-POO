package BancoDigital;

public class Main {
    public static void main(String[] args) {

        Cliente luan = new Cliente();
        luan.setNome("Luan");
        Conta cc =  new ContaCorrente(luan);
        cc.depositar(100);

        ContaPoupanca cp = new ContaPoupanca(luan);

        cc.transferir(25, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}

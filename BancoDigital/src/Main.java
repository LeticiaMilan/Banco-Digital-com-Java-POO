public class Main {
    public static void main(String[] args){
        Banco bancoInicial = new Banco(); //instancia novo banco

        bancoInicial.setNome("Nubank"); //insere nome do banco

        Cliente leticia = new Cliente("Leticia", bancoInicial);  //criado novo cliente Leticia
        leticia.setNome("Leticia Milan"); //insere o nome do cliente

        Conta contaCorrente = new ContaCorrente(leticia); //instanciada nova conta corrente
        contaCorrente.depositar(100); //criado um deposito em conta corrente

        Cliente joao_vitor = new Cliente("João Vitor", bancoInicial);  //instancia novo cliente
        Conta contaPoupanca = new ContaPoupanca(joao_vitor);  //instanciada nova conta poupanca

        contaCorrente.imprimirExtrato();  //imprime extrato de conta corrente leticia
        contaPoupanca.imprimirExtrato();  //imprime estrato de conta poupanca joao_vitor

        contaCorrente.transferir(50, contaPoupanca);  //faz tranferencia de conta corrente para conta poupanca

        contaCorrente.imprimirExtrato(); //imprime extrato atualizado de conta corrente leticia
        contaPoupanca.imprimirExtrato(); //imprime extrato atualizado de conta poupanca joao_vitor
        bancoInicial.mostrarClientes(); //mostra lista de clientes
    }
}

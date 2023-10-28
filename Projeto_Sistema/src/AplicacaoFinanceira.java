public class AplicacaoFinanceira {
    public static void main(String[] args) {
        Banco banco1= new Banco();
        Agencia agencia1= new Agencia();
        Conta conta1= new Conta();
        ContaCorrente contaCorrente1= new ContaCorrente();
        ContaPoupanca contaPoupanca1 = new ContaPoupanca();
        Cliente cliente1 = new Cliente();

        //Banco
        banco1.setId(1111);
        banco1.setNumero("4224");
        System.out.println("ID do banco " + banco1.getId());
        System.out.println("Número do banco " + banco1.getNumero());

        //Agência
        agencia1.setId(2222);
        agencia1.setNumero("9696");
        System.out.println("ID da agência " + agencia1.getId());
        System.out.println("Número da agência " + agencia1.getNumero());

        //Conta
        conta1.setId(3333);
        conta1.setNumero("0866");
        System.out.println("ID da conta " + conta1.getId());
        System.out.println("Número da conta " + conta1.getNumero());

        //Conta Corrente
        contaCorrente1.setId(4444);
        contaCorrente1.setLimite(7777);
        System.out.println("ID da conta corrente " + contaCorrente1.getId());
        System.out.println("Limite da conta corrente " + contaCorrente1.getLimite());

        //Conta Poupança
        contaPoupanca1.setId(2244);
        contaPoupanca1.setNumero("7227");
        System.out.println("ID da conta poupança " + contaPoupanca1.getId());
        System.out.println("Número da conta poupança " + contaPoupanca1.getNumero());

        //Cliente
        cliente1.setCpf("15711");
        cliente1.setNome("4222134");
        System.out.println("Cpf do cliente " + cliente1.getCpf());
        System.out.println("Nome do cliente " + cliente1.getNome());





    }
}

public class AplicacaoFinanceira {
    public static void main(String[] args) {
        Banco banco1= new Banco();
        Agencia agencia1= new Agencia();
        Conta conta1= new Conta();
        ContaCorrente contaCorrente1= new ContaCorrente();

        banco1.setId(1111);
        banco1.setNumero("4224");

        agencia1.setId(2222);
        agencia1.setNumero("9696");

        conta1.setId(3333);
        conta1.setNumero("0866");

        contaCorrente1.setId(4444);
        contaCorrente1.setLimite(7777);

        System.out.println("ID do banco " + banco1.getId());
        System.out.println("Número do banco " + banco1.getNumero());

        System.out.println("ID da conta " + conta1.getId());
        System.out.println("Número da conta " + conta1.getNumero());

        System.out.println("ID da agência " + agencia1.getId());
        System.out.println("Número da agência " + agencia1.getNumero());

        System.out.println("ID da conta corrente " + contaCorrente1.getId());
        System.out.println("Limite da conta corrente " + contaCorrente1.getLimite());


    }
}

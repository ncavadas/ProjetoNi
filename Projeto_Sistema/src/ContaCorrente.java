public class ContaCorrente extends Conta {
    //criar construtor de cada um na aplicação financeira e tirar os sets caso o consrutor n fique vazio

    //Variáveis
    /*private int id;
    private String numero;
    private double saldo;*/
    private double limite;

    //Construtor
    public ContaCorrente(){}
    public ContaCorrente(int $id, String $numero, double $saldo, double $limite){
        super.setId($id);
        super.setNumero($numero);
        super.setSaldo($saldo);
        this.limite = $limite;
    }

    //Get e Set
    /*public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }*/
    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}

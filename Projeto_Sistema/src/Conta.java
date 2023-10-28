public class Conta {
    //criar construtor de cada um na aplicação financeira e tirar os sets caso o consrutor n fique vazio
    //Variáveis
    private int id;
    private String numero;
    private double saldo;

    //Construtor Conta
    public Conta() {}
    public Conta(int $id, String $numero, double $saldo){
        this.id = $id;
        this.numero = $numero;
        this.saldo = $saldo;
    }

    //Get e Set
    public int getId() {
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
    }



}

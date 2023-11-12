public abstract class Conta {

    private int id;
    private String numero;
    private double saldo;
    private double taxa;


    //Construtor Conta
    public Conta() {}
    public Conta(int $id, String $numero, double $saldo,double $taxa){
        this.id = $id;
        this.numero = $numero;
        this.saldo = $saldo;
        this.taxa = $taxa;
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

    public double getTaxa() {
        return 0.0;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }





}

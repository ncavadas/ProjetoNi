public class Conta {
    //criar construtor de cada um na aplicação financeira e tirar os sets caso o consrutor n fique vazio
    private int id;
    private String numero;
    private double saldo;

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

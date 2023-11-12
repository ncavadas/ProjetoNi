public class ContaCorrente extends Conta {

    //Variáveis
    /*private int id;
    private String numero;
    private double saldo;*/
    private double limite;
    private double taxaDeJuros;

    //Construtor
    public ContaCorrente(){}
    public ContaCorrente(int $id, String $numero, double $saldo,double $taxa, double $limite,double $taxaDeJuros){
        super.setId($id);
        super.setNumero($numero);
        super.setSaldo($saldo);
        super.setTaxa($taxa);
        this.limite = $limite;
        this.taxaDeJuros = $taxaDeJuros;
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

    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }
    @Override
    public double getTaxa() {
        return getTaxaDeJuros();
    }

    @Override
    public void setTaxa(double taxa) {
        setTaxaDeJuros(taxaDeJuros);
    }
}

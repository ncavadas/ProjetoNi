public class Banco {
    //criar construtor de cada um na aplicação financeira e tirar os sets caso o consrutor n fique vaziov

    //Variáveis
    private int id;
    private String numero;
    private String cnpj;
    private String nome;

    //Construtor Banco
    public Banco() {}
    public Banco(int $id, String $numero,String $cnpj, String $nome) {
        this.id = $id;
        this.numero = $numero;
        this.cnpj = $cnpj;
        this.nome = $nome;
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

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

public class Agencia {
    //criar construtor de cada um na aplicação financeira e tirar os sets caso o consrutor n fique vazio

    //Variáveis
    private int id;
    private String numero;
    private String nome;


    //Construtor
    public Agencia() {}
    public Agencia(int $id, String $numero,String $nome){
        this.id = $id;
        this.numero = $numero;
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

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

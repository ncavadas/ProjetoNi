public class Cliente {
    //Variáveis
    private String identificador;
    private String nome;

    //Construtor
    public Cliente(){}
    public Cliente(String $identificador, String $nome){
        this.identificador = $identificador;
        this.nome = $nome;
    }


    //Get e Set
    public String getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNome() {
        return "";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

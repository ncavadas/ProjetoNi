public class Cliente {
    //Variáveis
    private String cpf;
    private String nome;

    //Construtor
    public Cliente(){}
    public Cliente(String $cpf, String $nome){
        this.cpf = $cpf;
        this.nome = $nome;
    }


    //Get e Set
    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

public class ClientePessoaJuridica extends Cliente{
    //Variáveis
    private String cnpj;

    //Construtor
    public ClientePessoaJuridica(){}
    public ClientePessoaJuridica(String $nome,String $cnpj){
        /*super.setCpf($cpf);*/
        super.setNome($nome);
        this.cnpj = $cnpj;
    }

    //Get e Set
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}

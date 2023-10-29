public class ClientePessoaFisica extends Cliente{
    //Variáveis
    /*private String cpf;*/
    private String rg;

    //Construtor
    public ClientePessoaFisica(){}
    public ClientePessoaFisica(String $cpf,String $nome,String $rg){
        super.setCpf($cpf);
        super.setNome($nome);
        this.rg = $rg;
    }

    //Get e Set
    /*@Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }*/

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}

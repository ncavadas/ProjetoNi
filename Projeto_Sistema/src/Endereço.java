public class Endereço {
    //Variáveis
    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;

    //Construtores

    public Endereço(){}
    public Endereço(String $rua, String $numero, String $complemento, String $bairro, String $cep) {
        this.rua = $rua;
        this.numero = $numero;
        this.complemento = $complemento;
        this.bairro = $bairro;
        this.cep = $cep;
    }
}

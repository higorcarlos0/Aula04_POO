public class aluno {
    private String nome;
    private String cpf;
    private Integer ra;
    private String data_nascimento;
    private String sexo;

    public aluno ( String nome, String cpf, 
    int ra, String data_nascimento, String sexo){

        this.nome = nome;
        this.cpf = cpf;
        this.ra = ra;
        this.data_nascimento = data_nascimento;
        this.sexo = sexo;
    }
    public aluno (){

    }

    public void setNome (String entrada){
        this.nome = entrada;
    }
    public void setRa (int entrada){
        this.ra = entrada;
    }
    public String getNome (){
        return this.nome;
    }
    public Integer getra (){
        return this.ra;
    }
    }

 
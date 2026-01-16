public class Membro{
    String nome;
    int idade;
    String cargo;
    float salario;
    boolean contratado;

    //Construtores
    public Membro(String nome, int idade, String cargo, float salario, boolean contratado) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.salario = salario;
        this.contratado = contratado;
    } 

    //Getter e Setter - Métodos

    public String getNome(String nome){
        return nome;
    }
    public void setNome(String nome){
        this.nome = (nome);
    }

    //Idade - Int

    public int getIdade(int idade){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = (idade);
    }

    // Cargo - String

    public String getCargo(String cargo){
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo = (cargo);
    }

    //Salario - float

    public float getSalario(float salario){
        return salario;
    }
    public void setSalario(float salario){
        this.salario = (salario);
    }

    //Contratado - boolean

    public boolean getContratado(boolean contratado){
        return contratado;
    }
    public void setContratado(boolean contratado){
        this.contratado = (contratado);
    }
}
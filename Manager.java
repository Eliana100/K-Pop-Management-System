public class Manager {
    String nome;
    int idade;
    float salario;
    int anosDeExperiencia;

    //Construtores
    public Manager(String nome, int idade, float salario, int anosDeExperiencia){
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.anosDeExperiencia = anosDeExperiencia;
    }

    //Getter e Setter - Métodos

    public String getNome(String nome){
        return nome;
    }
    public void setNome(String nome){
        this.nome = (nome);
    }

    //Idade
    public int getIdade(int idade){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = (idade);
    }

    //Salario

    public float getSalario(float salario){
        return salario;
    }
    public void setSalario(float salario){
        this.salario = (salario);
    }

    //AnosDeExperiencia

    public int getAnosDeExperiencia(int anosDeExperiencia){
        return anosDeExperiencia;
    }
    public void setAnosDeExperiencia(int anosDeExperiencia){
        this.anosDeExperiencia = (anosDeExperiencia);
    }

}

import java.util.List;

public class Banda {
    String nome;
    String agencia;
    int anosDeEstreia;
    Manager managerResponsavel;
    List<Membro> listaDeMembros;

    //Construtores
    public Banda(String nome, String agencia, int anosDeEstreia, Manager managerResponsavel){
        this.nome = nome;
        this.agencia = agencia;
        this.anosDeEstreia = anosDeEstreia;
        this.managerResponsavel = managerResponsavel;
    }

    //Getter e Setters
    public String getNome(String nome){
        return nome;
    }
    public void setNome(String nome){
        this.nome = (nome);
    }

    //Agencia
    public String getAgencia(String agencia){
        return agencia;
    }
    public void setAgencia(String agencia){
        this.agencia = (agencia);
    }

    //anosDeEstreia
    public int getAnosDeEstreia(int anosDeEstreia){
        return anosDeEstreia;
    }
    public void setAnosDeEstreia(int anosDeEstreia){
        this.anosDeEstreia = (anosDeEstreia);
    }

    //managerResponsavel
    public Manager getManagerResponsavel(Manager managerResponsavel){
        return managerResponsavel;
    }
    public void setManagerResponsavel(Manager managerResponsavel){
        this.managerResponsavel = (managerResponsavel);
    }

    //List<Membro>
    public List<Membro> getListaDeMembros(List<Membro> listaDeMembros){
        return listaDeMembros;
    }
    public void adicionarMembros(List<Membro> listaDeMembros){
        this.listaDeMembros = (listaDeMembros);
    }

}

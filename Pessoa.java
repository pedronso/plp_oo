public class Pessoa{
    private String nome;
    private Pessoa amor;
    
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, Pessoa amor) {
        this.nome = nome;
        this.amor = amor;
    }
    
    public Pessoa getAmor() {
        return amor;
    }

    public void setAmor(Pessoa amor) {
        this.amor = amor;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return nome + " ama " + amor.nome + ", ";
    }
}
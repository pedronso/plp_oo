
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pessoa {

    private String nome;
    private String genero;
    private List<Pessoa> amores;

    public Pessoa(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
        this.amores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addAmor(Pessoa pessoa) {
        amores.add(pessoa);
    }
    
    public String getGenero() {
        return genero;
    }

    public List<Pessoa> getAmores() {
        return amores;
    }

    public void setAmores(List<Pessoa> amores) {
        this.amores = amores;
    }

    public List<Pessoa> getAmadas() {
    	return amores.stream().filter(x -> x.genero.equals("feminino")).toList();
    }
    
    public List<Pessoa> getAmados() {
    	return amores.stream().filter(x -> x.genero.equals("masculino")).toList();
    }
    
    @Override
    public String toString() {
        String str = nome;
        int size = amores.size();
        if(size > 0) {
        	str += " que amava";
        	for(Pessoa x : amores) {
        		str += " " + x.nome;
        		if(size -1 != amores.indexOf(x))
        			str += ",";
        	}
        }
        str += "|";
    	return str;
    }

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(nome, other.nome);
	}
}

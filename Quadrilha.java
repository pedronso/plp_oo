import java.util.ArrayList;
import java.util.List;

public class Quadrilha{
    List<Pessoa> pessoas = new ArrayList<>();

    public Quadrilha() {
    }

    public Quadrilha(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public void addPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
        System.out.println(pessoas.size());
        if(pessoas.size()>1){
            pessoas.get(pessoas.size()-2).setAmor(pessoa);
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pessoas.size(); i++) {
            sb.append(pessoas.get(i).getNome());
            sb.append(" ");
            if(pessoas.get(i).getAmor()!=null){
                sb.append("ama ");
                sb.append(pessoas.get(i).getAmor().getNome());
                if (i < pessoas.size() - 1) {
                    sb.append(", ");
                }
            }else{
                sb.append("ama toda a quadrilha.");
            }
        }
        return sb.toString();
    }
}
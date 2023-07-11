import java.util.ArrayList;
import java.util.List;

public class Quadrilha {
	private List<Pessoa> pessoas;

	public Quadrilha() {
		pessoas = new ArrayList<>();
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

	public void amava(Pessoa amante, Pessoa amado) {
		int indexAmante = pessoas.indexOf(amante);
		int indexAmado = pessoas.indexOf(amado);

		if (indexAmante == -1)
			pessoas.add(amante);
		else
			pessoas.get(indexAmante).addAmor(amado);

		if (indexAmado == -1)
			pessoas.add(amado);
	}

	private String generateString(List<Integer> indexAmores, Pessoa pessoa, String str) {
		if (str == null)
			str = "";
		if (pessoa == null)
			pessoa = pessoas.get(0);
		
		int indexPessoa = pessoas.indexOf(pessoa);
		int indexAmorPessoa = indexAmores.get(indexPessoa);
		
		if (indexAmorPessoa == pessoa.getAmores().size())
			return str += pessoa.getNome() + " que amava toda a quadrilha.";
		else {
			indexAmores.set(indexPessoa, indexAmorPessoa + 1);
			return str += pessoa.getNome() + "\n que amava " + generateString(indexAmores, pessoa.getAmores().get(indexAmorPessoa), str);
		}
	}

	@Override
	public String toString() {
		List<Integer> indexAmores = new ArrayList<>();
		pessoas.forEach(x -> indexAmores.add(0));
		if (pessoas.size() != 0)
			return generateString(indexAmores, null, null);
		else
			return "Sem quadrilha";
	}
}
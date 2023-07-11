public class Main {
    public static void main(String[] args) {
    	
    	Pessoa carlos = new Pessoa("Carlos", "masculino");
        Pessoa dora = new Pessoa("Dora", "feminino");
        Pessoa lia = new Pessoa("Lia", "feminino");
        Pessoa lea = new Pessoa("Léa", "feminino");
        Pessoa paulo = new Pessoa("Paulo", "masculino");
        Pessoa juca = new Pessoa("Juca", "masculino");
        Pessoa rita = new Pessoa("Rita", "feminino");
        Pessoa dito = new Pessoa("Dito", "masculino");
        Pessoa pedro = new Pessoa("Pedro", "masculino");
        Pessoa tanto = new Pessoa("tanto", "masculino");
        Pessoa filha = new Pessoa("a Filha", "feminino");

        Quadrilha quadrilha = new Quadrilha();
        quadrilha.amava(carlos, dora);
        quadrilha.amava(dora, lia);
        quadrilha.amava(lia, lea);
        quadrilha.amava(lea, paulo);
        quadrilha.amava(paulo, juca);
        quadrilha.amava(juca, dora);
        quadrilha.amava(dora, carlos);
        quadrilha.amava(carlos, dora);
        quadrilha.amava(dora, rita);
        quadrilha.amava(rita, dito);
        quadrilha.amava(dito, rita);
        quadrilha.amava(rita, dito);
        quadrilha.amava(dito, rita);
        quadrilha.amava(rita, carlos);
        quadrilha.amava(carlos, dora);
        quadrilha.amava(dora, pedro);
        quadrilha.amava(pedro, tanto);
        quadrilha.amava(tanto, filha);
        quadrilha.amava(filha, carlos);
        quadrilha.amava(carlos, dora);
        quadrilha.amava(carlos, dora);
        
        System.out.println(quadrilha + "\n");
        
        quadrilha.getPessoas().forEach(x -> System.out.println(x));
    }
}

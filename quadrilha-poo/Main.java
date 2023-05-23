public class Main {
    public static void main(String[] args) {
        Pessoa fulano = new Pessoa("Fulano");
        Pessoa ciclano = new Pessoa("Ciclano");
        Pessoa beltrano = new Pessoa("Beltrano");

        Quadrilha quadrilha = new Quadrilha();
        quadrilha.addPessoa(fulano);
        quadrilha.addPessoa(ciclano);
        quadrilha.addPessoa(beltrano);

        System.out.println(quadrilha);
    }
}

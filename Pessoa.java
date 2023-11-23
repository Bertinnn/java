
package POO;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private String genero;
    private String telefone;

    
    public Pessoa(String nome, String dataNascimento, String genero, String telefone) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.telefone = telefone;
    }

    
    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public String getTelefone() {
        return telefone;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("Fulano", "01/12/1969", "Masculino", "123456789");

       
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());
        System.out.println("Gênero: " + pessoa.getGenero());
        System.out.println("Telefone: " + pessoa.getTelefone());

        
        pessoa.setNome("Herbert");
        pessoa.setDataNascimento("22/04/2006");
        pessoa.setGenero("Rock in Roll");
        pessoa.setTelefone("987654321");

        
        System.out.println("\nInformações Atualizadas:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());
        System.out.println("Gênero: " + pessoa.getGenero());
        System.out.println("Telefone: " + pessoa.getTelefone());
    }
}

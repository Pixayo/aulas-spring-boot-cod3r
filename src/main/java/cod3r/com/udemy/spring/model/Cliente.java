package cod3r.com.udemy.spring.model;

public class Cliente {

    private int id;
    private String nome;
    private String cpf;

    // Nota: auto geração de construtores e getters/setters
    // Ctrl + Shift + P "Source Action"

    public Cliente(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

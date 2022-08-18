public abstract class Cliente {
    private String nome;
    private int cpf;
    private int telefone;
    private String email;
    private int matricula;

    // ***** MÉTODOS
    public double desconto() {
    }

    // ***** Getters
    public String getNome() {
        return nome;
    }
    public int getCpf() {
        return cpf;
    }
    public int getTelefone() {
        return telefone;
    }
    public String getEmail() {
        return email;
    }
    public int getMatricula() {
        return matricula;
    }

    // ***** Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

}
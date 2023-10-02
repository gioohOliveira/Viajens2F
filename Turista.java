public class Turista {

    public String setcpf;
    public String setnome;
    // Atributos
    private String nome;
    private String cpf;
    // Métodos
    public String viajar() {
        return "Viajando...";
    }
    // Cnstrutor padrão
    Turista(){

    }
    // Sobrecarga de contrutor personalizado
    Turista(String _nome){
        this.nome= _nome;
    }
    // Encapsulamento - Getters and Setters

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
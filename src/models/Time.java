package models;

public class Time {
    private String nome;

    public Time(String nome) {
        try {
            verificaNome(nome);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private void verificaNome(String nome) throws Exception {
        if(nome.trim().isEmpty()){
            System.out.println("Erro: Nome inválido");
            throw new Exception("Error: Nome Inválido");
        }
    }
}

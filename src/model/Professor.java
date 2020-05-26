/*
 * Classe que implementa objetos do tipo Professor.
 */
package model;

public class Professor {
    
    // declaração de variáveis de instância
    private String codigo;
    private String nome;
    private String endereco;
    private String cidade;
    private String telefone;
    private String titulacao;
    private String area;
    
    public Professor(){
    }

    public Professor(String codigo, String nome, String endereco, String cidade,
            String telefone, String titulacao, String area) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.telefone = telefone;
        this.titulacao = titulacao;
        this.area = area;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "\nProfessor"
                + "\nCódigo: " + codigo 
                + "\nNome: " + nome 
                + "\nEndereço: " + endereco 
                + "\nCidade: " + cidade
                + "\nTelefone: " + telefone
                + "\nTitulação: " + titulacao
                + "\nÁrea: " + area;
    }
    
}

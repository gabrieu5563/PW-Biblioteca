package br.com.etechoracio.livraria.model.models;

public class Editora {
    private String nome;
    private String site;
    void exibirEditora(){
        System.out.println("Site editora " + site);
        System.out.println("Nome da editora " + nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSite(String site) {
        this.site = site;
    }
}

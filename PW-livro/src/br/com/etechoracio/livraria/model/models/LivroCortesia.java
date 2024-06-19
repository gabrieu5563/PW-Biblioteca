package br.com.etechoracio.livraria.model.models;

public class LivroCortesia extends Livro{

    private String marcaDAgua;


    public LivroCortesia(String marcaDAgua) {
        this.marcaDAgua = marcaDAgua;
    }

    public void setValor(double valor) {

    }

    @Override
    protected void detalhar() {
        System.out.println("Marca d'água: " + marcaDAgua);
    }
}

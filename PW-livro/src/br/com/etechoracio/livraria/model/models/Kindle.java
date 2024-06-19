package br.com.etechoracio.livraria.model.models;

public class Kindle extends Livro implements Oferta{
    private String marcaDAgua;

    public void setMarcaDAgua(String marcaDAgua) {
        this.marcaDAgua = marcaDAgua;
    }

    @Override
    protected void detalhar(){
        System.out.println("Marca d'água: " + marcaDAgua);
    }

    @Override
    public void aplicarDesconto(Desconto desconto) {
        this.valor = desconto.aplicar(this.valor);
    }
}

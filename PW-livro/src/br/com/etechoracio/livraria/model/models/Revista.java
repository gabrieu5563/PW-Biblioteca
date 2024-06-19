package br.com.etechoracio.livraria.model.models;

public class Revista implements Exemplar, Oferta {
    private String titulo;
    private double valor;
    private String editora;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public double getValor(){
        return valor;
    }

    @Override
    public void aplicarDesconto(Desconto desconto) {
        this.valor = desconto.aplicar(this.valor);
    }
}

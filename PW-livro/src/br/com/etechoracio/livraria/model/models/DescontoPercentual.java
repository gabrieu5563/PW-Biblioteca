package br.com.etechoracio.livraria.model.models;

public class DescontoPercentual implements Desconto {
    private double percentual;

    public DescontoPercentual(double percentual) {
        this.percentual = percentual;
    }

    @Override
    public double aplicar(double preco) {
        return (preco - (preco * percentual));
    }
}

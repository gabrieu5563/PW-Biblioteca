package br.com.etechoracio.livraria.model.models;

import br.com.etechoracio.livraria.model.models.exceptions.ValorDescontoException;
import br.com.etechoracio.livraria.model.models.exceptions.ValorNegativoException;

import java.security.InvalidParameterException;

public class DescontoFixo implements Desconto {
    private double valor;

    public DescontoFixo(double valor) {
        if(valor < 0){
            //throw new InvalidParameterException("O valor do desconto não pode ser menor do que 0");
            throw new ValorNegativoException("O valor do desconto não pode ser menor do que 0");
        }
        this.valor = valor;
    }

    @Override
    public double aplicar(double preco){
        if(this.valor > preco){
            //throw new IllegalArgumentException("Valor é maior que preço");
            throw new ValorDescontoException("Valor é maior que preço");
        }
        return (preco-valor);
    }
}

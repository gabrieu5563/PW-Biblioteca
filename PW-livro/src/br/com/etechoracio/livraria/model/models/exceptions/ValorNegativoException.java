package br.com.etechoracio.livraria.model.models.exceptions;

public class ValorNegativoException extends RuntimeException{
    public ValorNegativoException(String message) {
        super(message);
    }
}

package br.com.etechoracio.livraria.model.models.exceptions;

public class CampoNegativoException extends RuntimeException{
    public CampoNegativoException(String message) {
        super(message);
    }
}

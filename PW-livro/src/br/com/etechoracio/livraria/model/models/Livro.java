package br.com.etechoracio.livraria.model.models;

import br.com.etechoracio.livraria.model.models.Editora;
import br.com.etechoracio.livraria.model.models.exceptions.CampoNegativoException;

public abstract class Livro implements Exemplar {
    String titulo;
    String resumo;
    Editora editora = new Editora();

    public double getValor() {
        return valor;
    }

    double valor;
    String autor;
    int paginas;

    protected abstract void detalhar();

    public double getTaxaEnvio() {
        return valor * 0.05F;
    }

    String formatarValor(double param) {
        return String.format("R$ %.2f", param);
    }

    double Desconto() {
        double desconto;
        desconto = valor * (0.15F);
        valor = valor - desconto;
        return valor;
    }

    public void setTitulo(String titulo) {
        if(titulo == null){
            throw new CampoNegativoException("Título não pode ser nulo");
        } else {
            this.titulo = titulo;
        }
    }

    public void setValor(double valor) {
        if(valor < 0){
            throw new CampoNegativoException("Valor não pode ser negativo");
        } else {
            this.valor = valor;
        }
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public void exibir(){
        System.out.println("------------------------");
        System.out.println("Título: " + titulo);
        System.out.println("Valor: " + formatarValor(valor));
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
        detalhar();
        editora.exibirEditora();
    }
}
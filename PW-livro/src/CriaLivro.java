import br.com.etechoracio.livraria.model.models.*;

public class CriaLivro {
    public static void main(String[] args) {
        Editora editora1 = new Editora();
        editora1.setSite("pedro.com.br");
        editora1.setNome("pedro");

        LivroImpresso primeiroLivro = new LivroImpresso();
        primeiroLivro.setPaginas(256);
        primeiroLivro.setTitulo("Harry Potter");
        primeiroLivro.setEditora(editora1);
        primeiroLivro.setTipoCapa(TipoCapa.ESPECIAL);
        primeiroLivro.setValor(100);
        primeiroLivro.setAutor("Pedro");
        primeiroLivro.exibir();

        CarrinhoCompras carrinho1 = new CarrinhoCompras();
        carrinho1.adicionar(primeiroLivro);

        Kindle segundoLivro = new Kindle();
        segundoLivro.setAutor("João");
        segundoLivro.setEditora(editora1);
        segundoLivro.setPaginas(341);
        segundoLivro.setTitulo("Pedroso");
        segundoLivro.setValor(150);
        segundoLivro.setMarcaDAgua("marcadagua");
        segundoLivro.exibir();

        LivroCortesia cortesia = new LivroCortesia("marca dagua");
        carrinho1.adicionar(cortesia);

        carrinho1.adicionar(primeiroLivro);
        carrinho1.exibirItens();
    }
}
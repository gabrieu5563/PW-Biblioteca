public class Livro {
    String titulo;
    String resumo;
    Editora editora = new Editora();
    double valor;
    String autor;
    TipoCapa tipoCapa;
    int paginas;

    void exibir() {
        System.out.println("--+--Detalhes do livro " + titulo + "--+--");

        System.out.println("Valor " + Capa());
        System.out.println("Autor: " + autor);
        System.out.println("Tipo de capa " + tipoCapa);
        System.out.println("Quantidade de páginas " + paginas);
        editora.exibirEditora();
    }

    double getTaxaEnvio() {
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

    public Livro(TipoCapa tipoCapa) {
        this.tipoCapa = tipoCapa;
    }

    double Capa() {
        if (tipoCapa == TipoCapa.DURA) {
            valor += 5;
        } else if (tipoCapa == TipoCapa.ESPECIAL) {
            valor += 10;
        }
        return  valor;
    }

    public Livro() {
        System.out.println("Construindo um livro");
        tipoCapa = TipoCapa.COMUM;


    }

    public void setTipoCapa(TipoCapa tipoCapa) {
        this.tipoCapa = tipoCapa;
        Capa();
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

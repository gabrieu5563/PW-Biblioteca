package br.com.etechoracio.livraria.model.models;

public class LivroImpresso extends Livro implements Oferta{
    private TipoCapa tipoCapa;

    public LivroImpresso() {
        System.out.println("Construindo um livro");
        tipoCapa = TipoCapa.COMUM;
    }

    public void setTipoCapa(TipoCapa tipoCapa) {
        this.tipoCapa = tipoCapa;
    }

    @Override
    protected void detalhar(){
        System.out.println("Tipo de capa: " + tipoCapa);
        System.out.println("Taxa de envio: " + getTaxaEnvio());
    }

    @Override
    public void aplicarDesconto(Desconto desconto) {
        this.valor = desconto.aplicar(this.valor);
    }
}

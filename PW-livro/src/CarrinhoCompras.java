import br.com.etechoracio.livraria.model.models.*;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras{

    //private double total;

    private List<Exemplar> itens = new ArrayList<>();
    public void adicionar(Exemplar item){
        System.out.println("Adicionado " + item);

        try {
            if(item instanceof Oferta){
                ((Oferta) item).aplicarDesconto(new DescontoFixo(8));
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        //total = total + item.getValor();
        itens.add(item);


        //sempre tratar excessões mais específicas primeiro
    }

    public double exibirTotal(){
        return itens.stream().mapToDouble(i -> i.getValor()).sum();
    }
    public void exibirItens(){
        itens.forEach(i -> System.out.println(i.getValor()));
        //i é um elemento da lista
    }
}

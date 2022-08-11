import java.util.Random;
import java.util.Scanner;

public class Carrinho {
    Random random = new Random();
    private int codigo;
    private Produto[] produto;
    private Produto produtoP;
    private Iniciar iniciar;



    Scanner ent = new Scanner(System.in);

//Construtores
public Carrinho(){
    produto = new Produto[100];
}

//getters e setters
public int getCodigo() {
    return codigo;
}
public Produto[] getProduto() {
    return produto;
}

//metodos especificos
public void codificar_carrinho(){
    this.codigo = random.nextInt(999);
    if (this.codigo > 100) {
        this.codigo = random.nextInt(999);
    }
    System.out.println("O código do carrinho é: "+this.codigo);
}


public void cadastrar_pedidos(){
    for (int i = 0; i < produto.length; i++) {
        if (produto[i] == null) {
            produto[i] = new Produto();
            break;
        }
    }
}

public void verificar_produtos(int quant){
    while (quant > 100) {
        break;
    }
}

public double valorPag() {
    double pag = 0;
    for (int i = 0; i < produto.length; i++) {
        if (produto[i] != null && produto[i].getValor() != 0 && produto[i].getQuantidade() != 0) {
            pag += produto[i].getValor() * produto[i].getQuantidade();
        }
    }
    return pag;
}
}
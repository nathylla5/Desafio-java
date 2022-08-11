import java.util.Scanner;
import java.util.Random;

public class Produto {
    private String descricao;
    private int quantidade;
    private double valor;
    private int codigo;
    private Fabricante fabricante;

    Scanner ent = new Scanner(System.in);
    Random random = new Random();

    public Produto() {
        System.out.println("Descrição do produto >>> ");
        descricao = ent.nextLine();
        System.out.println("Quantidade do produto >>> ");
        quantidade = ent.nextInt();
        System.out.println("Valor do produto >>> ");
        valor = ent.nextDouble();
        System.out.println("Código do produto >>> ");
        gerar_cod();
        System.out.println("Fabricante do produto >>> ");
        fabricante = new Fabricante();
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Fabricante getFabricante() {
        return this.fabricante;
    }
    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    //metodos especificos

    public void gerar_cod() {
        this.codigo = random.nextInt(999);
        if (this.codigo > 100) {
            this.codigo = random.nextInt(999);
        }
        System.out.println(this.codigo);
    }

    public void exibir() {
        System.out.println("-----EXIBIR O PRODUTO-----");
        System.out.println("Descrição: "+this.descricao);
        System.out.println("Quantidade: "+this.quantidade);
        System.out.println("Valor: "+this.valor);
        System.out.println("Código: "+this.codigo);
        System.out.println("Fabricante >>> ");
        fabricante.exibir();
    }

}
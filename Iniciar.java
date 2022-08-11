import java.util.Scanner;

public class Iniciar {
    private static int i = 0;
    private int sair;
    private Scanner ent = new Scanner(System.in);
    private Carrinho carrinho = new Carrinho();

    private int escolha;

    public Iniciar() {
        do {
            i++;
            System.out.println("\n---MENU---");
            System.out.println("\n1 - Cadastrar produtos no carrinho;");
            System.out.println("\n2 - Consultar produtos no carrinho;");
            System.out.println("\n3 - Exibir produtos de um fabricante;");
            System.out.println("\n4 - Total a pagar;");
            System.out.println("\n5 - Sair.");
            escolha = ent.nextInt();
            ent.nextLine();
            switch (escolha) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    consultar();
                    break;
                case 3:
                    quant_produtos_fabricante();
                    break;
                case 4:
                    quantidade_produtos();
                    break;

                case 5:
                    System.out.println("Deseja sair?");
                    sair = ent.nextInt();
                    ent.nextLine();
            }
        } while (sair != 5);
    }

    //GETTERS E SETTERS

    public Carrinho getCarrinho() {
        return this.carrinho;
    }
    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    //METODOS ESPECIFICOS

    public void cadastrar(){
        for (int i = 0; i < carrinho.getProduto().length; i++) {
            if (carrinho.getProduto()[i] == null) {
                carrinho.cadastrar_pedidos();
                break;
            }
    }
}
    public void consultar() {
        for (int i = 0; i < carrinho.getProduto().length; i++) {
            if (carrinho.getProduto()[i] != null) {
                System.out.println(carrinho.getCodigo());
                carrinho.getProduto()[i].exibir();
            } else {
                break;
            }
        }
    }

    public void quant_produtos_fabricante() {
        int fab = 0, resp, i = 0;
        System.out.println("Qual o nome do fabricante?");
        String nome = ent.nextLine();

        for (i = 0; i < carrinho.getProduto().length; i++) {
            if (carrinho.getProduto()[i] != null) {
                if (carrinho.getProduto()[i].getFabricante().getNome().equalsIgnoreCase(nome)) {
                    fab+=carrinho.getProduto()[i].getQuantidade();
                }
            }    
        }
        
        System.out.println("A quantidade de produtos do fabricante é" + fab);

    }


    public void quantidade_produtos(){
    
        System.out.println("Pagar compra");
        System.out.println("Valor total = R$" + carrinho.valorPag());
    }
}


import java.util.Scanner;
public class Fabricante {
    
    private String nome;
    private String email;
    private String telefone;
       
    Scanner teclado = new Scanner(System.in);
        
    public Fabricante(){
        System.out.println("Nome: ");
        nome = teclado.nextLine();
        System.out.println("E-mail: ");
        email = teclado.nextLine();
        System.out.println("Telefone: ");
        telefone = teclado.nextLine();  
    }

    public String getNome() {
        return nome;
    }
    
    public String getEmail() {
        return email;
    }
        
    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }  

    //metodos especificos

    public void exibir() {
        System.out.println("Nome: "+this.nome);
        System.out.println("Email: "+this.email);
        System.out.println("Telefone: "+this.telefone);
    }
}
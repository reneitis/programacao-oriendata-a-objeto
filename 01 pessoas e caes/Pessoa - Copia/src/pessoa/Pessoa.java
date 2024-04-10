
package pessoa;


public class Pessoa {
    int idade;
    String nome; 
 
    
  
    public static void main(String[] args) {
        Pessoa p;
        p = new Pessoa();
        Pessoa p1 = new Pessoa();
        
        p.nome = "rogerio ceni";
        p.idade = 49; 
        
        p1.nome = "renata";
        p1.idade = 19;
        
        System.out.println("nome: " + p.nome);
        System.out.println("idade: " + p.idade);
        
        System.out.println("nome 2: " + p1.nome);
        System.out.println("nome 2: " + p1.idade);
        
       
        
    }
    
}


package caes;


public class Caes {
    int idade;
    String nome;

    
    public static void main(String[] args) {
     Caes c; //nome do 
     c = new Caes();
     Caes c1 = new Caes();
     
     c.nome = "bolinha";
     c.idade = 5;
     
     c1.nome = "nina";
     c1.idade = 2;
     
        System.out.println("nome: " + c.nome);
        System.out.println("idade: " + c.idade);
        
        System.out.println("nome 2: " + c1.nome);
        System.out.println("idade 2: " + c1.idade);
             
             
     
       
    }
    
}

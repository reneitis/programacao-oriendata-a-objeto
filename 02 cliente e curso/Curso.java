
//renata vieira
// 535619145

package curso;

public class Curso {
    String nome;
    int qtd;
    String turma;
    
    
    public static void main(String[] args) {
        Curso c;
        c = new Curso();
        
        
        c.nome = "ads";
        c.qtd = 21;
        c.turma = "2ls";
        
        System.out.println("nome: " + c.nome);
        System.out.println("quantidade: " + c.qtd);
        System.out.println("turma: "+ c.turma);
            
    }
    
}

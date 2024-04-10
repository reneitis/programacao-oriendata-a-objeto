
package javasobrecarga;


public class JavaSobrecarga {

    
    public static void main(String[] args) {
        // TODO code application logic here
        RoboSimples BobleBee = new RoboSimples( "BobleBee", 20,10 , 'S'){};
        RoboSimples wALLY = new RoboSimples("WALLY"){};
        RoboSimples r2D2 = new RoboSimples("r2d2"){};
        
        BobleBee.move(10);
        wALLY.mudaDirecao('E');
        r2D2.move();
        
        System.out.println(BobleBee);
        System.out.println(wALLY);
        System.out.println(r2D2); 
    }
    
}

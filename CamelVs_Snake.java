package camelvs_snake;
import java.util.*;

public class CamelVs_Snake
{
    public static void main(String[] args)
    {
        Scanner z = new Scanner(System.in);
        
        System.out.println("Questo programma traforma una frase da scrittura normale in input a 'camel', 'snake' e 'kebab' notation");
        
        System.out.println("Scrivi una frase a scelta");
        String frase = z.nextLine();
        
        kebab C = new kebab();
        snake B = new snake();
        camel A = new camel();
        
        C.kebab(frase);
        B.snake(frase);
        A.camel(frase);
    }   
}

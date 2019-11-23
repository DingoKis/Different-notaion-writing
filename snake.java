package camelvs_snake;

public class snake
{
    public void snake(String frase)
    {
        frase = frase.replace(" ", "_");
        
        System.out.println("La scrittura in 'snake' notation equivale a: "+frase);
    }
}
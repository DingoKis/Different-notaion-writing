package camelvs_snake;
import java.lang.*;

public class camel
{
    public void camel(String frase)
    {
        char[] c = frase.toCharArray();
        char[] f = new char[frase.length()];
        int z=0;
        boolean b = false;
        
        for(int i=0; i<frase.length(); i++)
        {
            if(c[i]==' ')
            {
                f[z] = Character.toUpperCase(c[i+1]);
                z = z+1;
                b = true;
            }
            else
            {
                if(b==false)
                {
                    f[z] = c[i];
                    z = z+1;
                }
                else
                {
                    b=false;
                }
            }
        }
        
        String finale = String.copyValueOf(f);
        System.out.println("La scrittura in 'camel' notation equivale a: "+finale);
    }
}

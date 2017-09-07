/**
 * Hector David Hernandez Rodriguez
 * A01374009
 */
public class Racional
{
    public int Numerador=1;
    public int Denominador=1;
    public Racional(int Numerador, int Denominador)
    {
        if (Numerador==0);
            this.Denominador=1;
    }
    public void setNumerador (int x)
    {
        x= Numerador;
    }
    public int getNumerador()
    {
        return this.Numerador;
    }
    public void setDenominador (int y)
    {
        y = Denominador;
    }
    public int getDenominador()
    {
        return this.Denominador;
    }
    public String toString(int a, int b)
    {
        a = Numerador;
        b = Denominador;
        if (a==0)
            return ("0");
        if (a==b)
            return ("1");
        if (b==1)
            return (""+a);
        else
            return (""+a+"/"+""+b);
    }
}

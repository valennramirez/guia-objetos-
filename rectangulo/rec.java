package rectangulo;

public class rec {

    private float ancho;
    private float alto;

    public rectangulo ()
    {
        this.alto=1;
        this.ancho=1;
    }

    public rectangulo (float ancho, float alto)
    {
        this.alto=alto;
        this.ancho=ancho;
    }


    public float getAncho ()
    {
        return ancho;
    }

    public void setAncho(float ancho)
    {
        this.ancho=ancho;
    }


    public float getAlto ()
    {
        return alto;
    }

    public void setAlto(float alto)
    {
        this.alto=alto;
    }

    public float getArea ()
    {
        float area= ancho*alto;
        return area;
    }

    public float getPerimetro ()
    {
        float perimetro= (ancho*2)+(alto*2);
        return perimetro;
    }




}

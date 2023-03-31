package rectangulo;

public class empleado {

    private String nombre;
    private String apellido;
    private String dni;
    private float salario;

    public Empleado ()
    {
        this.nombre="";
        this.apellido="";
        this.dni="";
        this.salario=0;
    }

    public Empleado(String nombre, String apellido, String dni, Float salario)
    {
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.salario=salario;
    }

    public String getNombre ()
    {
        return nombre;
    }

    public String getApellido ()
    {
        return apellido;
    }

    public String getDni ()
    {
        return dni;
    }

    public float getSalario ()
    {
        return salario;
    }

    public void setSalario(float salario)
    {
        this.salario=salario;
    }

    public float aumentarSalario (float porcentaje)
    {
        float salario;
        salario= salario* ((porcentaje/100)+1);
        return salario;
    }



}

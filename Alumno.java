
/**
 * Actividad 1
 * 
 * Erick Bautista Perez A01379896
 * Hector David Hernandez Rodrigez A01374009
 * @version (a version number or a date)
 */
public class Alumno
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String apellido;
    private String matricula;
    private double promedio;
    private double beca;
    private final static double MAXIMO_BECA = 85.00;
    private final static double MINIMO_BECA = 15.00; 

    /**
     * Constructor for objects of class Alumno
     */
    public Alumno(String nombre, String apellido, String matricula, double promedio)
    {
        // initialise instance variables
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.promedio = promedio;
        this.beca = beca;
        if((promedio < 0)||(promedio > 100)){
            this.promedio = 0;
        }
        else {
            this.promedio = promedio;
        }
        
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public String getApellido()
    {
        return this.apellido;
    }
    
    public String getMatricula() 
    {
        return this.matricula;
    }
    
    public double getPromedio(){
        return this.promedio;
    }

    public void setPromedio(double promedio) {
        if ((promedio <= 0) && (promedio >= 100)){
            this.promedio = promedio;
        }else
        {
            this.promedio = promedio;
        }
    }
    
    public double getBeca() {
        becaPorPromedio();
        return this.beca;
    }
    
    public String toString() 
    {
        return "Alumno[" + this.nombre + " " + this.apellido + " " + 
        this.matricula + " " + this.promedio + "]" ;
    }
    
    public void becaPorPromedio() {
        if (promedio < 70.00) {
            this.beca = 0.0;
        }
        else if ((promedio <= 70.0)&&(promedio >= 80.0)) {
            this.beca = MINIMO_BECA;
        }
        else if ((promedio <=80)&&(promedio >= 85.0)) {
            this.beca = 40.0;
        }
        else if ((promedio <= 85)&&(promedio >= 95.0)) {
            this.beca = 60.0;
        }
        else if ((promedio <=95)&&(promedio >= 100.0)) {
            this.beca = MAXIMO_BECA;
        }    
    }
}

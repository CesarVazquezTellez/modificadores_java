import paquete1.Clase1;
public class Hijo extends Padre {
    private int variable3;

    public Hijo(){
        super();
    }
    public int getVariable3() {
        return variable3;
    }

    public void setVariable3(int variable3) {
        this.variable3 = variable3;
    }

    // Modificar las variables de la clase Padre 
    public void setVarsPadre(){
        super.variable1 = 500; // Propiedad publica del padre 
        variable1 = 250; // Propiedad publica del hijo 
        super.setVariable2(-43); // Propiedad privada del padre 
    }

    public void setDataClase1(){
        Clase1 objeto1 = new Clase1();
        objeto1.x = 15; // public 
        // datos protegidos no se pueden usar fuera del paquete1
        //.y = 22; // protected
        objeto1.setZ(34); // privada
        // datos de tipo default no se pueden usar fuera del paquete1
        // comportamiento semejante a protected
        //objeto1.w = 18; // default
    }

    @Override
    public String toString() {
        return super.toString() + "Hijo [variable3=" + variable3 + ", variable1=" + variable1 + "]";
    }
}

package paquete1;

public class Clase2 extends Clase1{
    
    //Clase dos hereda de Clase 1 y ambas estan en el mismo paquete
    //Por eso Clase2 puede usar los datos de Clase1 como si fueran suyos 
    public void setData(){
        this.x = 12; // x es variable publica "publica"
        this.y = 0; // y es variable protected "protected"
        setZ(18); // z es una variable privada "privada"
        this.w = 19; // w es una variabale de tipo default "default"
        // Pero ambas se utilizan iguales 
        
    }

    public String getData(){
        return "Datos de Clase2: x= " + this.x + " y= " + this.y
        + "z=" + getZ();
    }
}

import paquete1.Clase2;

public class TestingModificadores{

    public static void main(String[] args) {
        Padre papa = new Padre();
        Hijo chamaco = new Hijo();
        Hijo chamaca = new Hijo();
        Clase2 objet2 = new Clase2();
        // asignar valores a miembros de la clase Padre
        // asignar vlaores es un método de acceso a los miembros
        
        papa.setVariable2(-322); // propiedad o variable privada 
        papa.variable1 = 25; // propiedad o variable publica 

        // leer valores de los miembros de la calase Padre
        // leer valores es otro método de acceso a los miembros
        System.out.println("Valor de variable 2: "+ papa.getVariable2());
        System.out.println("Valor de variable 1: "+ papa.variable1);

        chamaco.setVariable3(24);
        chamaco.setVarsPadre();
        System.out.println("Info del chamaco: " + chamaco.toString());

        chamaca.setVariable3(98);
        chamaca.variable1 = 35;
        chamaca.setVariable2(-31);
        System.out.println("Info de la chamaca: " + chamaca.toString());

        System.out.println();
        objet2.x = 500;
        // Esto  no se puede hacer por que y es protegida y testing esta en otro paquete
        // objet1.y = 500;
        objet2.setZ(48);
        System.out.println(objet2.getData());
    }
}
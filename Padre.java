public class Padre{
    // Miembro de la clase Padre 
    public int variable1; // solo debe aceptar valores positivos 
    private int variable2; // solo debe aceptar variables negativas 

    public int getVariable2() {
        return variable2;
    }
    public void setVariable2(int variable2) {
        if (variable2 < 0)
            this.variable2 = variable2;
        else
            this.variable2 = 0;
    }
    @Override
    public String toString() {
        return "Padre [variable1=" + variable1 + ", variable2=" + variable2 + "]";
    }

}
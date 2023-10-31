package ejercicio7;
public class Ejercicio7 {
    public static void main(String[] args) {
        // Resolucion de ejercicio
        int var1 = 81;
        int var2 = 9;
        int var3 = 3;
        int var4 = 10;
        int var5 = 1;
        int var6 = 100;
        int var7 = 25;
        boolean op1;
        boolean op2;
        boolean rta = true;
        
        // Formulacion del ejercicio
        op1 = (Math.sqrt(var1) + var2/ var3) == var2;
        op2 = (var4 > var5);
        double resultado = ((var6/var7) + Math.sqrt(var6));
        
        
        //Imprension de cada solucio
        System.out.println("El resultado de la primera operacion es:" + op1);
        System.out.println("El resultado de la segunda operacion es" + op2);
        System.out.println("El resulatdo de las dos primeras operaciones es:" + rta);
        System.out.println("El resultado de la tercera operacion es" + resultado);
        
        //Se llego a la conclusion de que el ejercio 7 no tine solucion porque tiene una combinacion de valores numericos y boleanos.
                
        
    }
    
}

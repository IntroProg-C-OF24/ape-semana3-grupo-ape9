package ejercicio.pkg06;
public class Ejercicio06 {
    public static void main(String[] args) {
            int var1= 81;
            int var2= 9;
            int var3= 3;
            int var4= 9;
            int var5= 10;
            int var6= 1;
            double rta;
            boolean rta1;
            boolean rta2;
            boolean rta3 = false;
            rta= ((Math.sqrt(var1) + var2) / var3);
            rta1= rta == var4;
            rta2= var5 > var6;
            System.out.println("El resultado de la primera condicion es: " + rta1 );
            System.out.println("El resultado de la segunda condicion es: " + rta2 );
            System.out.println("El resultado de la condicion final es: " + rta3 );
    }  
}

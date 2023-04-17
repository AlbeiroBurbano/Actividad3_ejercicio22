
package Salario;

public class salario {
    public static String decision (double hrs,double valor,String name){
        double Salario;
        String R;
        Salario = hrs * valor;
        if (Salario > 450000){
          R = ("El nombre del empleado es "+name+" y su salario es: $"+Salario);
       }else{
           R = ("El nombre del empleado es: "+name);
       }
        return R;
    
    }
}

/*
Public class Perro {
private final int edad;
}
9. Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package ejercicio9guiapoo;

public class Matematica {
   
   public Double num1, num2;

    public Matematica() {
    }

    public Double getNum1() {
        return num1;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum2() {
        return num2;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    public Matematica(Double num1, Double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    
    
    public void devolverMayor(){
    if (num1>num2)
            System.out.println("El numero 1 tiene mayor valor ");
    else if (num1<num2)
            System.out.println("El numero 2 tiene mayor valor");
    }
}

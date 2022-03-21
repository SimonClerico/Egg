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

public class Ejercicio9GuiaPoo {

    public static void main(String[] args) {
        Matematica l1 = new Matematica();

        double numero1 = Math.random();
        double numero2 = Math.random();
        
        
        l1.setNum1(numero1);
        
        l1.setNum2(numero2);
        
        l1.devolverMayor();
        
        
        
    }

}

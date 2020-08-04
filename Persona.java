/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author DARIO
 */
interface Afectuoso{
    default String Saludar(String nombre){
        return "¡Saludos!"+ nombre+"¡Un Excelente día";
        
    }
}
interface Cordial {
    default String Saludar(String nombre){
        return "¡Buenos Días!"+nombre;
    }
} 
//ambas interfaces tienen un método String Saludar(String nombre)
//y ambas proveen una implementación por defecto 
//la clase se ve forzada a implementar la función Saludar

public class Persona implements Afectuoso, Cordial{
  /*
    @Override
  public String Saludar(String nombre){
      //se puede elegir la implementación de una interfaz
      //por ejemplo, escogemos que sea afectuoso
      return Afectuoso.super.Saludar(nombre);
  }*/
  
  @Override
  public String Saludar(String nombre){
  //se puede elegir la implementación de una interfaz
  //por ejemplo, escogemos que sea Cordial
  return Cordial.super.Saludar(nombre);
  }
  

    
    public static void main(String[] args) {
        Persona persona = new Persona();
      System.out.println(persona.Saludar("\nEstimado Profesor"));
       
    }
    
}






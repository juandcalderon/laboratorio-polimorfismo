
package polimorfismo;


public class ProgramaInterfaz{

	public static void main(String arg[]) { 
        Persona pavaroti = new Persona(); 
        hacerCantar(pavaroti); 
       
        Canario piolin = new Canario(); 
        hacerCantar(piolin); 
      
        Burro paco= new Burro();
        hacerCantar(paco);
    } 

    public static void hacerCantar(PuedeCantar cantor) { 
        cantor.cantar(); 
    } 
}

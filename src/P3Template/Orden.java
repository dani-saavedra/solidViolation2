package P3Template;

public abstract class Orden {
    
    public final void procesarOrden() {
        tomarOrder();               
        verificaDisponibilidad();   
        prepararOrden();            // Paso específico (debe ser implementado por subclases)
        calcularPrecio();          
    }

      
    public void tomarOrder() {
        System.out.println("Toma del pedido realizada.");
    }
    
    public void verificaDisponibilidad() {
        System.out.println("Verificando disponibilidad de los artículos.");
    }

    //Implementado por subclases
    public abstract void prepararOrden();

    
    public void calcularPrecio() {
        System.out.println("Calculando el precio total del pedido.");
    }

    

}

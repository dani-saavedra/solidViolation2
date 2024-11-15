package P1Prototype;

import java.util.ArrayList;

public class Guerrero extends Heroe {

    public Guerrero(String nombre, 
                    int nivel, 
                    int experiencia, 
                    ArrayList<String> visuales,
                    ArrayList<String> ataques, 
                    ArrayList<String> defensas) {
        super(nombre, nivel, experiencia, visuales, ataques, defensas);
    }

    
    @Override
    public Heroe clonar() {
        
        return new Guerrero(
            this.getNombre(),                
            this.getNivel(),                 
            this.getExperiencia(),        

            new ArrayList<>(this.getVisuales()), 
            new ArrayList<>(this.getAtaques()),  
            new ArrayList<>(this.getDefensas())

        );
    }


}

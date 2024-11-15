package P1Prototype;

import java.util.ArrayList;

public class Mago extends Heroe {

    private ArrayList<String> magicas;

    public Mago(String nombre, 
                    int nivel, 
                    int experiencia, 
                    ArrayList<String> visuales,
                    ArrayList<String> ataques, 
                    ArrayList<String> defensas,
                    ArrayList<String> magicas) {
        super(nombre, nivel, experiencia, visuales, ataques, defensas);
        this.magicas = magicas;
    }

    

    @Override
    public Heroe clonar() {
        
        return new Mago(
            this.getNombre(),                
            this.getNivel(),                 
            this.getExperiencia(),        
            new ArrayList<>(this.getVisuales()), 
            new ArrayList<>(this.getAtaques()),  
            new ArrayList<>(this.getDefensas()),
            this.magicas

        );
    }



}

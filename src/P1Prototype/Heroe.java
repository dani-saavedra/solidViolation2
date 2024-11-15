package P1Prototype;

import java.util.ArrayList;

public abstract class Heroe implements Clonar {


    private String nombre;
    private int nivel;
    private int experiencia;
    private ArrayList<String> visuales;
    private ArrayList<String> ataques;
    private ArrayList<String> defensas;
    private ArrayList<Integer> registroExperiencia; // Arreglo para almecenar el historico de experiencia


    public Heroe(String nombre, int nivel, int experiencia, ArrayList<String> visuales , ArrayList<String> ataques , ArrayList<String> defensas  ){
        this.nombre = nombre;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.visuales = visuales;
        this.visuales = ataques;
        this.visuales = defensas;
    };

    @Override
    public abstract Heroe clonar();

    public void cambiarExperiencia(int experiencia){
        registroExperiencia.add(experiencia);
    }

    protected String getNombre() { return nombre;}
    protected ArrayList<String> getVisuales() { return visuales;}
    protected int getNivel() { return nivel;}
    protected int getExperiencia() { return experiencia;}
    protected ArrayList<String> getAtaques() { return ataques;}
    protected ArrayList<String> getDefensas() { return defensas;}

    protected void setNombre(String nombre) { this.nombre= nombre;}
    protected void setVisuales(ArrayList<String> visuales) { this.visuales= visuales;}

}




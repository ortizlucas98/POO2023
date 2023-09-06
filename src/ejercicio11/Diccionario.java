package ejercicio11;

import java.util.ArrayList;

public class Diccionario {
    private ArrayList<String> diccionarioDepalabras;
    private int cantidadDePalabras;

    public Diccionario(){
        diccionarioDepalabras = new ArrayList<>();
        //POR DEFAULT LE METO 10 PALABRAS
        this.aniadirPalabra("Gato");
        this.aniadirPalabra("Perro");
        this.aniadirPalabra("koala");
        this.aniadirPalabra("queso");
        this.aniadirPalabra("xilofon");
        this.aniadirPalabra("yamaha");
        this.aniadirPalabra("avion");
        this.aniadirPalabra("zorro");
        this.aniadirPalabra("waterpolo");
        this.aniadirPalabra("kazajistan");
    }

    public void mostrarTodasLasPalabras(){
        for (String palabra : this.diccionarioDepalabras) {
            System.out.println(palabra);
        }
    }

    public String getPalabra(int pos){
        return this.diccionarioDepalabras.get(pos);
    }

    public void aniadirPalabra(String p){
        this.diccionarioDepalabras.add(p);
    }

    public ArrayList<String> getDiccionario(){
        return this.diccionarioDepalabras;
    }

}

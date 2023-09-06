package ejercicio8;

import java.util.Random;

public class Contrasenia {
    private int longitud;
    private StringBuilder contrasenia;
    private String esFuerteODebil;
    public Contrasenia(int longitud){
        this.longitud = longitud;
        this.contrasenia = this.generarContrasenia();
        this.esFuerteODebil = setContrasenia();
    }

    public Contrasenia(){
        this.longitud = 8;
        this.contrasenia = this.generarContrasenia();
        this.esFuerteODebil = setContrasenia();
    }

    public int getLongitud() {
        return longitud;
    }

    public StringBuilder getContrasenia() {
        return contrasenia;
    }

    public String getEsFuerteODebil() {
        return esFuerteODebil;
    }

    public void setLongitud(int l){
        this.longitud = l;
        this.contrasenia = this.generarContrasenia();
        this.esFuerteODebil = setContrasenia();
    }

    public boolean esFuerte(){
        int i = 0;
        int cantMayus=0;
        int cantMinus=0;
        int cantNum=0;

        char charActual;
        while(i<this.contrasenia.length()){
            charActual = this.contrasenia.charAt(i);
            if(Character.isUpperCase(charActual)){
                cantMayus++;
            }
            if(Character.isLowerCase(charActual)){
                cantMinus++;
            }
            if(Character.isDigit(charActual)){
                cantNum++;
            }
            i++;
        }
        return cantMayus>2 && cantMinus>1 && cantNum>=2;
    }

    private StringBuilder generarContrasenia(){
        String letrasMin ="abcdefghiklmnñopqrstuvwxyz";
        String letrasMayus =letrasMin.toUpperCase();
        String numeros = "0123456789";
        String alfabeto = letrasMin+letrasMayus+numeros;
        StringBuilder contraseniaParcial= new StringBuilder();
        Random random = new Random();
        for(int i=0;i<this.longitud;i++){
            int indice = random.nextInt(alfabeto.length());
            contraseniaParcial.append(alfabeto.charAt(indice));
        }
        return (contraseniaParcial);
    }

    private String setContrasenia(){
        if(this.esFuerte()){
            return "Fuerte";
        }else{
            return "Debil";
        }
    }
}

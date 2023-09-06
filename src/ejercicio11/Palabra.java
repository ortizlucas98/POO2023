package ejercicio11;

public class Palabra {

    private String palabra;
    private int longitud;
    private int valorEnPuntos;

    public Palabra(String p){
        this.palabra = p;
        this.longitud = p.length();
        this.valorEnPuntos = calcularValorEnPuntos();
    }

    public int calcularValorEnPuntos(){
        StringBuilder letrasConMasValor= new StringBuilder("kzxywq");
        int i = 0;
        char charActual;
        int valorTotal = 0;

        while(i<this.palabra.length()){
            charActual = letrasConMasValor.charAt(i);
            if(palabra.contains(String.valueOf(charActual))){
                valorTotal++;
            }
            i++;
        }

        valorTotal += this.longitud;
        return valorTotal;
    }
}

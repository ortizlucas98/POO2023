package ejercicio9;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fecha {
    private String dia;
    private String mes;
    private String anio;

    private LocalDate fecha;

    private int formato;

    public Fecha(String fecha, int formato) throws ParseException {
        this.formato = formato;
        if (formato == 1) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            this.fecha = LocalDate.parse(fecha, formatter);
        } else if (formato == 2) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
            this.fecha = LocalDate.parse(fecha, formatter);
        } else {
            throw new IllegalArgumentException("Formato no válido. Debe ser 1 o 2.");
        }
    }

    public void mostrarFecha(){
        String formato;
        if(this.formato==1){
            formato = "dd/MM/yyyy";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formato);
            System.out.println(fecha.format(formatter));
        }
        else{
            formato = "MM/dd/yyyy";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formato);
            System.out.println(fecha.format(formatter));
        }
    }

    public LocalDate getFecha(){
        return this.fecha;
    }

    public boolean estaEntre(LocalDate fechaInicio,LocalDate fechaFinal){
        return (this.fecha.isBefore(fechaFinal)) && this.fecha.isAfter(fechaInicio);
    }

    public boolean esMayor(LocalDate F2){
        return this.fecha.isAfter(F2);
    }

    public boolean esMenor(LocalDate F2){
        return this.fecha.isBefore(F2);
    }
}

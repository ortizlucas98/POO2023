package ejercicio8;

import java.util.ArrayList;

public class AdministradorDeContrasenia {
    private final ArrayList<Contrasenia> listaDeContrasenias;

    public AdministradorDeContrasenia(){
        this.listaDeContrasenias = new ArrayList<>();
    }

    public void mostrarContrasenias(){
        for (Contrasenia c : this.listaDeContrasenias){
            System.out.println("Contraseña :"+c.getContrasenia()+" - "+c.getEsFuerteODebil());
            System.out.println("------------------");
        }
    }
    public ArrayList<Contrasenia> getListaDeContrasenias(){return this.listaDeContrasenias;}

    public void aniadirContrasenia(int longitud){
        Contrasenia nuevaContrasenia = new Contrasenia(longitud);
        this.listaDeContrasenias.add(nuevaContrasenia);
    }

    public void aniadirContrasenia(){
        Contrasenia nuevaContrasenia = new Contrasenia();
        this.listaDeContrasenias.add(nuevaContrasenia);
    }
}

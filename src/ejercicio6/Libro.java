package ejercicio6;

public class Libro {
    private String titulo;
    private String autor;
    private String ISBN;
    private int cantPaginas;
    private int cantEjemplares;
    private int cantPrestamos;

    public Libro(String titulo,String autor,String ISBN,int cantPaginas,int cantEjemplares,int cantPrestamos){
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.cantPaginas = cantPaginas;
        this.cantEjemplares = cantEjemplares;
        this.cantPrestamos  = cantPrestamos;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public int getCantEjemplares() {
        return this.cantEjemplares;
    }

    public int getCantPaginas() {
        return this.cantPaginas;
    }

    public int getCantPrestamos() {
        return cantPrestamos;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setCantEjemplares(int cantEjemplares) {
        this.cantEjemplares = cantEjemplares;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    public void setCantPrestamos(int cantPrestamos) {
        this.cantPrestamos = cantPrestamos;
    }

    public void mostrarInfo(){
        System.out.println("Titulo :"+this.titulo);
        System.out.println("Autor :"+this.autor);
        System.out.println("ISBN :"+this.ISBN);
        System.out.println("Cantidad ejemplares :"+this.cantEjemplares);
        System.out.println("Cantidad de paginas :"+this.cantPaginas);
        System.out.println("Cantidad de prestamos :"+this.cantPrestamos);
    }

    //<   >
    public boolean prestamo(){
        if(this.cantEjemplares>1 && this.cantPrestamos<this.cantEjemplares-1){
            this.cantPrestamos++;
            System.out.println("Prestamo realizado");
            return true;
        }
        else{
            System.out.println("No se puede realizar el prestamo");
            return false;
        }
    }
}

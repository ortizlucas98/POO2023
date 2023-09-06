package ejercicio7;


public class FormulaCuadratica {
    private final int A;
    private final int B;
    private final int C;

    public FormulaCuadratica(int A, int B, int C){
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public void calcularRaices(){
        double discriminante = (this.B*this.B) - (4 * this.A * this.C);
        double raiz1;
        if(discriminante==0){
            raiz1 = (double)(-(this.B)) / (2*(this.A));
            System.out.println("Unica raiz : "+ raiz1);
        }
        else if(discriminante>0){
            raiz1 = (-(this.B) + Math.sqrt(discriminante)) / (2 * this.A);
            System.out.println("Raiz 1 : "+ raiz1);
            double raiz2 = (-(this.B) - Math.sqrt(discriminante)) / (2 * this.A);
            System.out.println("Raiz 2 : "+ raiz2);
        }
        else {System.out.println("No posee raices");}
    }

    public double calcularYEnFuncionDeX(double X){
        return (this.A * (X*X) + this.B * X + this.C);
    }
}

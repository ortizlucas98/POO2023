import ejercicio1.Lista;
import ejercicio11.Juego;
import ejercicio2.ListaDobleEnlazada;
import ejercicio3.Pila;
import ejercicio4.Cola;
import ejercicio5.listaDeTareas;
import ejercicio6.Libro;
import ejercicio7.FormulaCuadratica;
import ejercicio8.AdministradorDeContrasenia;
import ejercicio9.Fecha;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws ParseException {
        //***************EJERCICIO 1 LISTA***************
        /*System.out.println("***************EJERCICIO 1***************");
        Lista l = new Lista();// creo la lista

        //le cargo valores del 1 al 10
        for(int i=1;i<=10;i++){
            l.agregar(i); // aca ya hago lo de agregar al final de la lista
        }

        l.mostrarDatos();

        System.out.println("Primero le cargue 10 valores y ahora pruebo longitud y si es vacia");
        System.out.println("Es vacia :"+l.esVacia());
        System.out.println("Longitud :"+l.longitud());

        System.out.println("Elimino el 4 que esta en la posicion 3 y agrego el 100 en la posicion 5");

        l.eliminarPos(3); //elimino un elemento en la posicion 3;
        l.insertar(5,100);
        System.out.println("Muestro como queda la lista");
        l.mostrarDatos();*/
        //***************EJERCICIO 2 LISTA DOBLE ENLACE****************/
        //System.out.println("LA INTERFAZ DEBE SER LA MISMA? SI.");
        /*ListaDobleEnlazada l = new ListaDobleEnlazada();// creo la lista

        //le cargo valores del 1 al 10
        for(int i=1;i<=10;i++){
            l.agregar(i); // aca ya hago lo de agregar al final de la lista
        }

        l.mostrarDatos();

        System.out.println("Primero le cargue 10 valores y ahora pruebo longitud y si es vacia");
        System.out.println("Es vacia :"+l.esVacia());
        System.out.println("Longitud :"+l.longitud());

        System.out.println("Elimino el 4 que esta en la posicion 3 y agrego el 100 en la posicion 5");

        l.eliminarPos(3); //elimino un elemento en la posicion 3;
        l.insertar(5,100);
        System.out.println("Muestro como queda la lista");
        l.mostrarDatos();*/
        //***************EJERCICIO 3 PILA***************
        /*System.out.println("***************EJERCICIO 3***************");
        System.out.println("Interfaz definida como : APILAR, DESAPILAR , GETTOPE , ESVACIA, ADEMAS DE SU CONSTRUCTOR");
        System.out.println("Utiliza una clase pila la cual utiliza una clase Nodo");
        System.out.println("Hago algunas pruebas de funcionamiento");
        Pila p = new Pila();
        p.apilar(5);
        System.out.println("es vacia:"+p.esVacia());
        System.out.println(p.getTope());
        p.desapilar();
        System.out.println("es vacia:"+p.esVacia());*/

        //***************EJERCICIO 4***************
        /*System.out.println("***************EJERCICIO 4 COLA***************");
        System.out.println("Interfaz definida como : ENCLAR, DESENCOLAR,RECUPERAR, ESVACIA, ADEMAS DE SU CONSTRUCTOR");
        System.out.println("Utiliza una clase pila la cual utiliza una clase Nodo");
        System.out.println("Ejemplifico su uso");
        Cola c = new Cola();
        System.out.println("Encolo 3 elementos y los muestro");
        c.encolar(5);
        c.encolar(6);
        c.encolar(7);
        c.mostrarElementos();
        System.out.println("Verifico si es vacia");
        System.out.println("es vacia:"+c.esVacia());
        System.out.println("Desencolo el resto y muestro si es vacia");
        c.desencolar();
        c.desencolar();
        c.desencolar();
        System.out.println("es vacia:"+c.esVacia());*/
        /*System.out.println("***************EJERCICIO 5 LISTA DE TAREAS***************");
        listaDeTareas lt = new listaDeTareas();
        lt.aniadirTarea("Ir al supermercado mañana",2, LocalDate.of(2023,9,23),1,LocalDate.of(2023,9,20));
        lt.aniadirTarea("Cosultar respuesto del auto",1,LocalDate.now().minusDays(1),2,LocalDate.of(2023,8,20));
        lt.aniadirTarea("Ir al cine a ver una pelicula de marvel",3,LocalDate.now().minusDays(1),3,LocalDate.of(2023,8,25));
        lt.agregarColaborador("Lucas");
        lt.getTarea(1).finalizarTarea(lt.getColaborador("Lucas")); //ACLARACION : DEBIDO A LAS IMPLEMENTACIONES POSTERIORES
        //EN LAS CUALES HABIA QUYE CERRAR UNA TAREA Y PONER QUIEN LA FINALIZO TUVE QUE ADAPTAR ACA Y PONERLE
        //UN COLABORADOR (ADEMAS APARECEN CONSIGNAS COMO EL POR VENCER DE EL EJERCICIO 10 ETC)- UN EFECTO QUE SE PUEDE VER ES QUE CUANDO
        //LA TAREA SE ESTA POR VENCER LE CAMBIA LA PRIORIDAD Y ES DIFERENTE A LA QUE SE PASO POR TECLADO
        lt.mostrarTodasLasTareas();

        ***************EJERCICIO 10 EXTENSION DE CLASE TAREA***************
        //System.out.println("***************EJERCICIO 10 EXTENSION DE CLASE TAREA***************");*/

        /*listaDeTareas lt = new listaDeTareas();

        System.out.println("Hago la prueba de fecha recordatorio");
        lt.aniadirTarea("Bañar al perro",2, LocalDate.of(2023,11,5),4,LocalDate.of(2023,11,1));
        lt.getTarea(0).mostrarTareaCompleta();//MUESTRA UN MENSAJE DE POR VENCER, PERO SU PRIORIDAD ES NORMAL
        lt.aniadirTarea("Limpiar el patio",3,LocalDate.of(2023,9,10),5,LocalDate.of(2023,9,2));
        lt.getTarea(1).mostrarTareaCompleta();//MUESTRA LA PRIORIDAD EN 1 Y UN MENSAJE DE QUE SE VA A VENCER
        System.out.println("Se puede apreciar como correspondientemente se cambia la prioridad y se muestran los datos correctos");*/
        //***************EJERCICIO 6 CLASE LIBRO***************
        /*System.out.println("***************EJERCICIO 6 CLASE LIBRO***************");
        Libro librouno = new Libro("El principito","Lucas","123abc",300,1,0);
        Libro librodos = new Libro("El diario de Ana Frank","Romina","456bcd",200,5,0);

        librouno.mostrarInfo();
        System.out.println("--------------------------------");
        librodos.mostrarInfo();
        System.out.println("--------------------------------");

        if(librouno.getCantPaginas()== librodos.getCantPaginas()){
            System.out.println("Tienen la misma cantidad de paginas");
        }
        else if(librouno.getCantPaginas()> librodos.getCantPaginas()){
            System.out.println("El libro "+librouno.getTitulo()+" tiene mas paginas");
        }else System.out.println("El libro "+librodos.getTitulo()+" tiene mas paginas");

        System.out.println("--------------------------------");
        System.out.println("Intento prestar 1 de el principito que no puedo y uno de ana frank que si me deja");
        System.out.println("--------------------------------");
        librouno.prestamo();
        librodos.prestamo();
        System.out.println("aca testeo hacer los prestamos necesarios hasta que no pueda prestar porque queda uno solo para consulta en la biblioteca");
        librodos.prestamo();
        librodos.prestamo();
        librodos.prestamo();
        librodos.prestamo();

        System.out.println("Cantidad total hecha de prestamos de "+librouno.getTitulo()+" = "+librouno.getCantPrestamos());
        System.out.println("Cantidad total hecha de prestamos de "+librodos.getTitulo()+" = "+librodos.getCantPrestamos());

        //ACA COMO LO RESOLVI ANTES DE LA CLASE PLANTIE EL EJERCICIO RESOLVIENDOLO SOLO CON LA CLASE LIBRO, POR LO
        //TANTO NO PUEDO CONTAR LA CANTIDAD DE PRESTAMOS TOTALES PORQUE NO POSEO UNA CLASE EXTERIOR A LIBRO
        //ES DECIR NO POSEO LA CLASE BIBLIOTECA PARA QUE VAYA CONTANDO LOS LIBROS PRESTADOS TOTALES Y CADA LIBRO
        //TIENE LA CANTIDAD DE VECES QUE FUE PRESTADO EL MISMO MISMO.
        //BIEN PODRIA HABER HECHO UN ATRIBUTO ESTATICO EN BIBLIOTECA Y AUMENTARLO CADA VEZ QUE SE CREE UN LIBRO*/

        //***************EJERCICIO 7 ECUACION CUADRATICA***************
        /*System.out.println("***************EJERCICIO 7 ECUACION CUADRATICA***************");
        FormulaCuadratica FormC =  new FormulaCuadratica(1,-5,6);
        System.out.println("Calculo las raices con A = 1, B = -5, C = 6");
        FormC.calcularRaices();
        System.out.println("Calculo Y en base a X = 1, X = 2, X = 3");
        System.out.println("Y en funcion de X: "+ FormC.calcularYEnFuncionDeX(1));
        System.out.println("Y en funcion de X: "+ FormC.calcularYEnFuncionDeX(4));
        System.out.println("Y en funcion de X: "+ FormC.calcularYEnFuncionDeX(6));*/

        //***************EJERCICIO 8 GENERADOR DE CONTRASEÑAS***************
        /*System.out.println("***************EJERCICIO 8 GENERADOR DE CONTRASEÑAS***************");
        AdministradorDeContrasenia ADC = new AdministradorDeContrasenia();

        //IMPORTANTE : EN ESTE CONSTRUCTOR ACEPTA QUE LE PASES LA LONGITUD DE LA CADENA POR PARAMETRO
        // YO LO DEJE VACIO PARA QUE TOME LOS 8 CARACTERES PPOR DEFAULT
        //(NO ESTA VALIDADO, POR FAVOR INGRESAR ENTEROS POSITIVOS EN LO POSIBLE NO MUY GRANDES)
        ADC.aniadirContrasenia();
        ADC.aniadirContrasenia();
        ADC.aniadirContrasenia();
        ADC.aniadirContrasenia();
        ADC.mostrarContrasenias();

        System.out.println("Aca agrego una contraseña , si es debil va a regenerarla hasta que sea fuerte");
        ADC.aniadirContrasenia();
        System.out.println("Probamos regenerar passwords");

        while (!ADC.getListaDeContrasenias().get(4).esFuerte()){
            System.out.println(ADC.getListaDeContrasenias().get(4).getContrasenia());
            System.out.println(ADC.getListaDeContrasenias().get(4).getEsFuerteODebil());
            System.out.println("REGENERANDO...");
            ADC.getListaDeContrasenias().get(4).setLongitud(12); //
            System.out.println("-----------------------");
        }
        System.out.println(ADC.getListaDeContrasenias().get(4).getContrasenia());
        System.out.println(ADC.getListaDeContrasenias().get(4).getEsFuerteODebil());*/

        //***************EJERCICIO 9 MANEJO DE FECHAS***************
        /*System.out.println("***************EJERCICIO 9 MANEJO DE FECHAS***************");
        Fecha F1 = new Fecha("13/12/1998",1);
        Fecha F2 = new Fecha("04/06/1998",2);
        Fecha F3 = new Fecha("12/23/1998",2);
        System.out.println("Muestro una fecha formato 1 y 2 formato 2");
        F1.mostrarFecha();
        F2.mostrarFecha();
        F3.mostrarFecha();

        System.out.println("Pruebo que una fecha este entre dos fechas, y una que no cumpla");
        System.out.println("Fecha 1 esta entre fecha 2 y fecha 3");
        System.out.println(F1.estaEntre(F2.getFecha(),F3.getFecha()));
        System.out.println("Fecha 2 no esta entre fecha 1 y 2");
        System.out.println(F2.estaEntre(F1.getFecha(),F3.getFecha()));

        System.out.println("Prueba de es mayor , menor");
        System.out.println("F1 es mayor a F2");
        System.out.println(F1.esMayor(F2.getFecha()));
        System.out.println("F1 es menor a F2");
        System.out.println(F1.esMenor(F2.getFecha()));
        System.out.println("F2 es menor a F1");
        System.out.println(F2.esMenor(F1.getFecha()));
        System.out.println("F2 es mayor a F1");
        System.out.println(F2.esMayor(F1.getFecha()));*/

        //***************EJERCICIO 12 EXTENSION EN LISTA DE TAREAS***************
        /*System.out.println("***************EJERCICIO 12 EXTENSION EN LISTA DE TAREAS***************");*/
        /*System.out.println("ESTAS TRES TAREAS NO ESTAN VENCIDAS NI NADA, DEBEN PRESENTARSE NORMAL");
        listaDeTareas ltej12 = new listaDeTareas();
        ltej12.aniadirTarea("terminar este TP",1, LocalDate.of(2023,9,25),1,LocalDate.now().plusDays(3));
        ltej12.aniadirTarea("Cosultar respuesto del auto",1,LocalDate.now(),2,LocalDate.now().plusDays(3));
        ltej12.aniadirTarea("Ir al cine a ver una pelicula de marvel",3,LocalDate.of(2023,9,18),3,LocalDate.now().plusDays(3));
        ltej12.mostrarTodasLasTareas();
        System.out.println("-------------------------------------");
        System.out.println("ESTAS TAREAS DEBERIAN TENER TODAS PRIORIDAD 1 Y ENUNCIARSE COMO POR VENCER(TENER EN CUENTA QUE SON LAS ULTIMAS 3 TAREAS DE LA LISTA QUE POSEE HASTA AHORA 6 TAREAS)");
        ltej12.aniadirTarea("Cortar el pasto",2, LocalDate.of(2023,9,25),1,LocalDate.now());
        ltej12.aniadirTarea("Vender la bici",3,LocalDate.of(2023,9,12),2,LocalDate.now());
        ltej12.aniadirTarea("Ir al cine a ver una pelicula de marvel AVENGERS",3,LocalDate.of(2023,9,18),3,LocalDate.now());
        ltej12.mostrarTodasLasTareas();

        System.out.println("ACA SE PUEDEN VER 3 TAREAS VENCIDAS Y 3 TAREAS NO VENCIDAS");
        listaDeTareas listaPrueba = new listaDeTareas();
        listaPrueba.aniadirTarea("sacar licencia de conducir",1, LocalDate.of(2023,9,25),1,LocalDate.now().plusDays(3));
        listaPrueba.aniadirTarea("hacer tramite de pasamporte",2,LocalDate.now(),2,LocalDate.now().plusDays(3));
        listaPrueba.aniadirTarea("ir a la escuela a pagar la cuota",2,LocalDate.of(2023,9,18),3,LocalDate.now().plusDays(3));
        listaPrueba.aniadirTarea("terminar este TP",1, LocalDate.of(2023,8,25),8,LocalDate.now().plusDays(3));
        listaPrueba.aniadirTarea("Cosultar respuesto del auto",1,LocalDate.now().minusDays(10),2,LocalDate.now().plusDays(3));
        listaPrueba.aniadirTarea("Ir al cine a ver una pelicula de marvel",3,LocalDate.of(2023,8,18),3,LocalDate.now().plusDays(3));
        listaPrueba.mostrarTodasLasTareas();
        System.out.println("-------------------------------------");
        System.out.println("AHORA TOMO SOLO LAS TAREAS NO VENCIDAS Y LAS ORDENO PRIMERO POR PRIORIDAD Y LUEGO POR FECHA");
        listaPrueba.Listadetareasnovencidas(); //EN ESTE CASO SOLO PUSE 3, SE PUEDEN AGREGAR LAS NECESARIAS
        System.out.println("----------------------------");
        System.out.println("ACA HAGO LA BUSQUEDA POR TITULO, BUSCANDO LA TAREA -SACAR LICENCIA DE CONDUCIR-");
        //ingrese en el parametro el titulo que desea buscar
        listaPrueba.buscarTareaPorNombre("sacar licencia de conducir");

        System.out.println("----------------------------");
        System.out.println("POR ULTIMO MARCAR LA TAREA COMO COMPLETA Y MOSTRARLA");
        //NUEVAMENTE CREO UN COLABORADOR PARA PODER CERRAR LA TAREA
        listaPrueba.agregarColaborador("Lucas");
        listaPrueba.getTarea(1).finalizarTarea(listaPrueba.getColaborador("Lucas"));
        listaPrueba.getTarea(1).mostrarTareaCompleta();*/

        //***************EJERCICIO 13 EXTENSION EN LISTA DE TAREAS- SE AGREGAN COLABORADORES***************
        System.out.println("***************EJERCICIO 12 EXTENSION EN LISTA DE TAREAS- SE AGREGAN COLABORADORES***************");
        System.out.println("primero creo una lista de tareas y le agrego 4 tareas");
        listaDeTareas listaPrueba = new listaDeTareas();
        listaPrueba.aniadirTarea("sacar licencia de conducir",1, LocalDate.of(2023,9,25),1,LocalDate.now().plusDays(3));
        listaPrueba.aniadirTarea("hacer tramite de pasamporte",2,LocalDate.now(),2,LocalDate.now().plusDays(3));
        listaPrueba.aniadirTarea("ir a la escuela a pagar la cuota",2,LocalDate.of(2023,9,18),3,LocalDate.now().plusDays(3));
        listaPrueba.aniadirTarea("Ir al cine a ver una pelicula de marvel",3,LocalDate.of(2023,12,18),3,LocalDate.now().plusDays(3));

        //ahora le voy a agregar 2 colaboradores
        listaPrueba.agregarColaborador("Lucas");
        listaPrueba.agregarColaborador("Romina");

        //muestro las tareas
        listaPrueba.mostrarTodasLasTareas();

        System.out.println("Ahora le asigne colaboradores a cada tarea y vuelvo a mostrar las tareas");
        listaPrueba.getTarea(0).finalizarTarea(listaPrueba.getColaborador("Lucas"));
        listaPrueba.getTarea(1).finalizarTarea(listaPrueba.getColaborador("Romina"));
        listaPrueba.getTarea(2).finalizarTarea(listaPrueba.getColaborador("Romina"));
        listaPrueba.getTarea(3).finalizarTarea(listaPrueba.getColaborador("Lucas"),LocalDate.of(2001,11,28));

        System.out.println("Muestro las tareas ya finalizadas y con la fecha de finalizacion");
        //NOTA : SOBRECAGUE EL METODO PARA FINALIZAR TAREA, UNA QUE SETEE SIEMPRE CON LA FECHA ACTUAL
        //Y LA OTRA QUE LE PODES PASAR LA FECHA EN FORMATO ANIO MES DIA PARA ELEGIR
        listaPrueba.mostrarTodasLasTareas();

        System.out.println("Ahora muestro las tareas realizadas por cada colaborador");

        //listaPrueba.mostrarTareasXColaborador(C1);
        listaPrueba.getListadetareasDeColaboradores().get(0).mostrarListaDeTareasRealizadas();
        System.out.println("---------------------");
        listaPrueba.getListadetareasDeColaboradores().get(1).mostrarListaDeTareasRealizadas();

        /*System.out.println("Muestro los jugadores inicialmente");
        Juego J = new Juego("Lucas","Romina");
        J.mostrarJugadores();
        System.out.println("--------");

        System.out.println("Muestro el diccionario inicial al cual se le pueden agregar palabras");
        J.mostrarDiccionario();

        System.out.println("Hago que ambos jugadores jueguen 2 palabras y calculo su puntaje");
        J.Jugarturno(J.getJ1(),"koala");
        //J.Jugarturno(J.getJ2(),"xilofon"); //NO SE PORQUE NO FUNCIONA SOLO CON LA PALABRA XILOFON
        J.Jugarturno(J.getJ2(),"yamaha");
        J.Jugarturno(J.getJ1(),"perro");//PERRO CON MINUSCULA NO ESTA
        J.Jugarturno(J.getJ2(),"Perro");//ESTA SI
        J.Jugarturno(J.getJ1(),"zorro");
        J.Jugarturno(J.getJ1(),"avion");

        J.mostrarJugadores();
        J.obtenerGanador(J.getJ1(),J.getJ2());
        */
    }
}



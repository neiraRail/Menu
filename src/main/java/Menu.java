import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void desplegarMenuPrincipal(){

        int opcion=1;
        while(opcion!=3) {

            System.out.println("------Menu------");
            System.out.println("[1] Opcion 1");
            System.out.println("[2] Opcion 2");
            System.out.println("[3] Salir");

            opcion = recibirOpcion(3);

            elegirOpcion(opcion);
        }
    }
    /**
     * Intenta recibir una opcion numerica y captura una excpecion
     * @param nroOpciones cantidad de opciones en el menú
     * @return el numero de la opcion elegida
     */
    public static int recibirOpcion(int nroOpciones){
        int opcion;

        try{
            opcion= tratarRecibirNro(nroOpciones);
        }
        catch (InputMismatchException ime){
            System.out.println("Debe ingresar un numero!");

            opcion=recibirOpcion(nroOpciones);
        }
        return opcion;
    }
    /**
     *Recibe un numero y lo valida dentro de un rango
     * @param nroOpciones rango de opciones para validar
     * @return opcion elegida
     */
    public static int tratarRecibirNro(int nroOpciones){
        Scanner scan = new Scanner(System.in);

        int opcion;
        do{
            opcion = scan.nextInt();
        }
        while(!validarOpcion(opcion,nroOpciones));
        return opcion;
    }
    /**
     * Valida que un numero este dentro de un rango
     * @param opcion el numero para validar
     * @param nroOpciones tope superior del rango
     * @return True si el numero está dentro del rango
     */
    public static boolean validarOpcion(int opcion,int nroOpciones){
        boolean flag=false;
        if (opcion>0 && opcion<=nroOpciones){
            flag=true;
            //System.out.println("bien validado, opcion:"+opcion);
        }
        if (opcion<=0||opcion>nroOpciones){
            System.out.println("Opcion no valida!");

        }
        return flag;
    }

    /**
     * Llama a la funcion que correpsonda a cada opcion
     * @param opcion int que indica la opcion
     */
    public static void elegirOpcion(int opcion) {
        if (opcion==1){
            System.out.println("Opcion 1");
            //funcion1();
        }
        if (opcion==2){

            System.out.println("Opcion 2");
            //Funcion2();
        }
        if (opcion==3){
            System.out.println("Salir");
        }

    }

}

import java.util.Scanner;
import java.util.Random;
/*
 * crear un programa que dado el total de votos deseados de una eleccion, reparta de forma
 * aleatoria los votos, dependiendo de los posibles patidos a elejir
 * 
 */
public class Votacion{
    /*
     * se crea la funcion votacion con los parametros votos, elecciones
     * se crean las variables enteras i , votos residuales, partido y el objecto random
     * se implementa la estrucura while para repetir hasta el decremento de las cantidades de las elecciones llegue a 0
     * se obtiene la cantidad de votos aleatorios para cada partido -> (numero_aleatorio_decimal * votos)/2
     * se obtiene los votos residuales  -> votos - votos_aleatorios_partido
     * se imprime el partido, los votos para ese patido y los residuales
     * se realiza el trazpaso de valores [votos_residuales a votos] para que por medio del decremento de la cantidad de elecciones se vuelva a ciclo while
     */ 
    public static void votacion(int votos, int elecciones ){
        int i=0, votosResiduales, partido;
        Random r=new Random();
         while (elecciones>0) {
            i++;
            partido=Integer.parseInt(String.valueOf((r.nextDouble()*votos)/2).split("\\.")[0]);
            votosResiduales=votos-partido;
 
            System.out.println("partido "+ i + " = " + partido);
            System.out.println("residuales " + votosResiduales);
            System.out.println("_=====================_");
            
            votos=votosResiduales;
            elecciones--;
        }
    }

    public static void main(String args[]){
        Scanner s= new Scanner(System.in); 
        System.out.println("votos");
        int votos=s.nextInt();
        System.out.println("elecciones");
        int elecciones=s.nextInt();
        votacion(votos, elecciones);

    }
}
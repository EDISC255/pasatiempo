package ejemplo;

import java.util.Scanner;
import java.util.Random;
public class Votacion{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in); 
        int partido, votos, elecciones, i=0, votosResiduales;
        Random r=new Random();
        System.out.println("votos");
        votos=s.nextInt();
        System.out.println("elecciones");
        elecciones=s.nextInt();
        while (elecciones>0) {
            i++;
            String aux=String.valueOf(r.nextDouble()*votos);
            //System.out.println(aux.split("\\.")[0]);
            
            partido=Integer.parseInt(String.valueOf(r.nextDouble()*votos).split("\\.")[0]);
            votosResiduales=votos-partido;
            System.out.println("partido "+ i+ " = " + partido);
            System.out.println("residuales " + votosResiduales);
            
            votos=votosResiduales;
            elecciones--;
        }
    }
}
/**
 * Argumentos
 */
public class Argumentos {
    public static void main(String[] args) {
        System.out.print(args.length+"\n[");
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]+","); 
        }
        System.err.println("]");
    }
}
import java.util.Scanner;
import java.util.Random;
public class papeltijerapiedra {
    public static void main(String[] args) {
        
        Random randomNumbers = new Random();
        Scanner myObj = new Scanner(System.in);
        String tecleado=myObj.nextLine();
        String[] posibilidades =  {"PIEDRA", "PAPEL", "TIJERA"};
        int random = randomNumbers.nextInt(3);
        String introduccion=tecleado.toUpperCase().trim();
        String ResultRandom=posibilidades[random];

        if(ResultRandom==introduccion.toUpperCase())
        {
            System.out.println("EMPATE");
        }else if( ResultRandom.equals("PIEDRA") && introduccion.equals("TIJERA"))
        {
            System.out.println("HAS PERDIDO");
            
        }else if( ResultRandom.equals("PIEDRA") && introduccion.equals("PAPEL"))
        {
            System.out.println("HAS GANADO");
        }else if( ResultRandom.equals("TIJERA") && introduccion.equals("PAPEL"))
        {
            System.out.println("HAS PIERDES");
        }else if( ResultRandom.equals("TIJERA") && introduccion.equals("PIEDRA"))
        {
            System.out.println("HAS GANADO");
        }else if( ResultRandom.equals("PAPEL") && introduccion.equals("PIEDRA"))
        {
            System.out.println("HAS PERDIDO");
        }else if( ResultRandom.equals("PAPEL") && introduccion.equals("TIJERA"))
        {
            System.out.println("HAS GANADO");
        }else
        {
            System.out.println("Has introducid;o el valor Mal");
            System.out.println("El valor que has introducido es:" + introduccion);
        }
            System.out.println("LA MAQUINA A SACADO " + ResultRandom);
}
}
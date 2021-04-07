import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Area {
	public static void main(String[] args) throws IOException {
        // Variables para capturar las pulsaciones de teclado del usuario
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        String valorEntrada;
        
        
        System.out.println("---------------------------------------------");
        System.out.println(" CÁLCULO DEL ÁREA DE UN RECTÁNGULO");
        System.out.println("---------------------------------------------");
        
        float ladoMenor=0;
        do{
        	// Solicitamos al usuario la longitud del lado menor del rectángulo
        	System.out.println(" Indique la longitud del lado menor: ");
        	valorEntrada = teclado.readLine();
        	ladoMenor = Float.parseFloat(valorEntrada);
        }while (ladoMenor<=0);
        
        float ladoMayor;
        do {
        // Solicitamos al usuario la longitud del lado mayor del rectángulo
        System.out.println(" Indique la longitud del lado mayor: ");
        valorEntrada = teclado.readLine();
        ladoMayor = Float.parseFloat(valorEntrada);
        }while (ladoMayor<=0);
         
        
        // Calculamos y mostramos el área del rectángulo
        float area = ladoMenor * ladoMayor;
        System.out.println(" El área del rectángulo es: " + area);
        
	}
}
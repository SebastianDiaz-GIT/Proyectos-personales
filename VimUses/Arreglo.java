import java.util.Scanner;

public class Arreglo
{
	public static void main(String [] args)
	{
	
	Scanner entrada = new Scanner(System.in);

	double [] arrPorcentaje = {0.15,0.22,0.12,0.23,0.28,0.1};

	double nota = 0;
		for(i = 0; i < arrPorcentaje.length;i++)
		{	
		  System.out.println("Nota # " + i+1 +": ");
		  nota = nota + (entrada.nextDouble() * arrPorcentaje[i]);
		  System.out.println(nota);
		}
	}
}


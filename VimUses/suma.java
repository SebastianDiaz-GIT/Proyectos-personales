import java.util.Scanner;

public class suma
{
	public static void main(String [] args)
	{

	Scanner sc = new Scanner(System.in);	
	System.out.println("\033[34mInserte primer dijito");
	int num1 = sc.nextInt();
	System.out.println("\033[32mInserte Segundo Dijito");
	int num2 = sc.nextInt();

	//Esta es la operacion.
	int Total = num1 + num2;

	System.out.println("La suma es igual a : " + Total);
	
		if(num1 > 3)
		{
			num1 = num1 + 3;
			System.out.println("\033[32mEste if num1 da : "+ num1);
		}else
		{
			Total = Total - 2;
			System.out.println("Este if del total da : " + Total);
		}
		
	
	}
}


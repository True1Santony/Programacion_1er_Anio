import java.util.Scanner;
/*import java.util.regex.Matcher;
import java.util.regex.Pattern;*/

public class EjecutarPokemon {

	public static void main(String[] args) {
		
		String aux="";
		int energia, vida;
		int aux1=0;
		/*boolean resultado=false;*/
		
		Pikachu miPicachu;
		
		Scanner sc=new Scanner(System.in); // NOPMD by espar on 28/2/23 18:14
		
		/*do{                           //1er. intento Parece que al compilador no le gusta que haya 2 condiciones para instanciar un objeto, no compila, creo por no garantizar la inicializacion
			
			System.out.println("Introduzca a que tipo de Raichu(Aloa o Kanto) va a evolucionar: ");              //si agrego un else, funciona, pero no de forma deseada
		
		Scanner sc=new Scanner(System.in);
		aux=sc.nextLine();
			if(aux.equalsIgnoreCase("Aloa")) 		{
		
				miPicachu=new Aloa();
				
			}else if(aux.equalsIgnoreCase("Kanto")) {
				System.out.println("Introduzca en numeros, cuanta vida va a tener Kanto");
				vida=sc.nextInt();
				
				System.out.println("Introduzca en numeros, cuanta energía va a tener Kanto");
				energia=sc.nextInt();
				
				miPicachu=new Kanto(energia, vida);
			}
		}while(!(aux.equalsIgnoreCase("Aloa") || aux.equalsIgnoreCase("Kanto")));no funciona*/
		do{ 
				System.out.println("Introduzca a que tipo de Raichu(Alola o Kanto) va a evolucionar: ");          //para validar lo introducido por teclado 
				aux=sc.nextLine();
				
			if(aux.equalsIgnoreCase("Alola")) 		{
		
				aux1=1;
				
			}else if(aux.equalsIgnoreCase("Kanto")) {
				aux1=2;
			}
		}while(!(aux.equalsIgnoreCase("Alola") || aux.equalsIgnoreCase("Kanto")));
		
		/*do {
			if(resultado==false) {
		Pattern p=Pattern.compile("kanto"..... ); escojo la otra opcion para validar lo introducido, no terminado.
		Matcher m=p.matcher(aux);
		resultado=m.matches();}
		}while(resultado);*/	
		
		if(aux1==1) {                                    //instancio un tipo de pokemon, polimorfismo
			miPicachu=new Aloa();
			
		}else {
			System.out.println("Introduzca en numeros, cuanta vida va a tener Kanto");
			vida=sc.nextInt();
			
			System.out.println("Introduzca en numeros, cuanta energía va a tener Kanto");
			energia=sc.nextInt();
			
			miPicachu=new Kanto(energia, vida);
			
		}
			
	
	if(miPicachu instanceof Aloa) {
		Aloa aloa=(Aloa) miPicachu;
		do { 
			System.out.println("|********************ALOLA***|");
			System.out.println("| 1. LUCHAR                  |");
			System.out.println("| 2. ENTRENAR                |");
			System.out.println("| 3. VOLAR                   |");
			System.out.println("| 4. FIN                     |");
			System.out.println("******************************");
			aux1=sc.nextInt();
			if(aloa.nivel_vida==0) {
				System.out.println("A Alola no le queda vida!!! K.O. ");
			}else if(aux1==1) {
				aloa.luchar();
			}else if(aux1==2) {
				aloa.entrenar();
			}else if(aux1==3) {
				if(aloa.nivel_energia==0) {
					System.out.println("A Alola ya no le queda energia, pero puedes entrenar para que se recupere.");
				}else
				aloa.volar();
			}
			
		}while(!(aux1==4));
		aloa.toString(); // NOPMD by espar on 28/2/23 18:14
		
	}else if(miPicachu instanceof Kanto) {
		Kanto kanto=(Kanto) miPicachu;
		do {
			System.out.println("|********************KANTO***|");
			System.out.println("| 1. LUCHAR                  |");
			System.out.println("| 2. ENTRENAR                |");
			System.out.println("| 3. FIN                     |");
			System.out.println("******************************");
			aux1=sc.nextInt();
			
			if(kanto.nivel_vida<=1) {                                       //por si se introduce un numero impar y no quede la vida en negativo
				System.out.println("A Kanto le queda "+kanto.nivel_vida+" de vida, no puede seguir luchando. ");
			}else if(aux1==1) {
				kanto.luchar();
			}else if(aux1==2) {
				kanto.entrenar();
			}

			
		}while(!(aux1==3));
		
	}
		/*if(miPicachu.dimeTipo()==1) {// pruebas
			
		}*/
	System.out.println(miPicachu.toString());
	sc.close();
}
 
}
import java.util.Scanner;
class EjemploC{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int h[]=new int [5];
		for(int i=0;i<5;i++){
			System.out.println("Introduce un numero entero");
			h[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++){
			System.out.println(h[i]);
		}
	}
}		
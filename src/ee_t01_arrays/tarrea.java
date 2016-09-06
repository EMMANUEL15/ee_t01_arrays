package ee_t01_arrays;
/**
 * en este proyecto se importa los datos desde un documento de texto
 * la primera fila se toma como el tamaño de arreglo donde se almacena el resto
 * final mente el se crea un metodo donde se recorre el arreglo de manera descendente 
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
public class tarrea {
public  int arr[];
public int contador=0;
public int tamaño,num,c=0;
public String A;
public void leer(String Archivo )
{
try{
	A=Archivo;//nombre del archivo que contiene los datos
  String Nombre;
  FileReader Ar =new FileReader(A);
			String cadena=null;
			BufferedReader s =new BufferedReader(Ar);
			while ((cadena=s.readLine())!=null){		//leer los datos que contine el archivo
				if(tamaño==0){						//se toma el primer dato para el tamaño de arreglo
					System.out.println(" "+cadena+" ELEMENTOS");
					this.tamaño=Integer.parseInt(cadena);//convertir de String a entero
					arr=new int[tamaño];
					this.contador=tamaño;
					
				}else{				// se almacena el resto de los datos en el arreglo
					num=Integer.parseInt(cadena);
					System.out.println("["+num+"]");
					arr[c]=num;
					c=c+1;	
				}
			}
			
		}
		catch(Exception ex){
		
		System.out.println("EXEPCIONES");
	}
}
//recorrer para imprimir de forma desendende
public void recorrer(){
	System.out.println("SALIDA:");
	int s=arr.length-1;
	for(int x=s;x>=0;x--){
	System.out.println(" ["+arr[x]+"]");
	}
}
//metodo main
public static void main(String[] args)
{
tarrea p=new tarrea();
System.out.println("ENTRADA:");
p.leer("Datos.txt");
p.recorrer();
}
}
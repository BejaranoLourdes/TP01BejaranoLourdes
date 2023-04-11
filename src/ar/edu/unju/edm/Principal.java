package ar.edu.unju.edm;
import java.util.Scanner;
import java.util.Calendar;

import ar.edu.unju.edm.model.Empleado;

public class Principal {
	//EJERCICIO 1
    public static String bisiesto(int numero) {
    	String aux;
    	if(numero%4==0&&numero%100!=0||numero%400==0) {
    		aux="es un año bisiesto";
    	}else {
    		aux="no es un año bisiesto";
    	}
		return aux;
    	 
    }
    //EJERCICIO 2
    public static String mesDelAño(int numero) {
    	//coloque valor "mes" porque si no, no me dejaba ejecutar
    	String m="mes";
    	switch(numero) {
    	case 1:m="Enero"; break;
    	case 2:m="Febrero"; break;
    	case 3:m="Marzo"; break;
    	case 4:m="Abril"; break;
    	case 5:m="Mayo"; break;
    	case 6:m="Junio"; break;
    	case 7:m="Julio"; break;
    	case 8:m="Agosto"; break;
    	case 9:m="Septiembre"; break;
    	case 10:m="Octubre";break;
    	case 11:m="Noviembre";break;
    	case 12:m="Diciembre";break;
    	default: m="No es un mes";
    	}
    	return m;
    }
    //EJERCICIO 3
    public static void primos(int n) {
    	for(int i=2;i<n;i++) {
    		int creciente=2;
    		boolean esPrimo=true;
    		while(esPrimo&&creciente<i) {
    			if(i%creciente==0) {
    				esPrimo=false;
    			}else {
    				creciente++;
    			}
    			
    		}
    		if(esPrimo) {
    		System.out.println(i);
    	    }
    	}	
    }
    //EJERCICIO 4
    public static void parImpar(int menor,int mayor,String op) {
    	if(op.equals("PAR")) {
    		for(int i=menor;i<mayor;i++) {
    		  if(i%2==0) {
    			 System.out.println(i);
    		 }
    		}
    	 }else if(op.equals("IMPAR")) {
    		 for(int x=menor;x<mayor;x++) {
    		  if(x%2!=0) {
    			 System.out.println(x);
    		  }
    		 }
    	 }else {
    		 System.out.println("Ingrese opcion correcta");
    	 }
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in);
      
      //Ejercicio 1
      System.out.println("Ejercicio1-Ingrese año:");
      if(sc.hasNextInt()) {
      int num= sc.nextInt();
      System.out.println(bisiesto(num));
      }else {
    	  System.out.println("ingrese valor correcto y ejecute otra vez");
      sc.close();
    	  return;
      }
      
      //Ejercicio 2
      System.out.println("Ejercicio2-Ingrese numero de mes:");
     if(sc.hasNextInt()) {
      int mes=sc.nextInt();
      System.out.println(mesDelAño(mes));
     }else {
    	 System.out.println("ingrese valor correcto y ejecute otra vez");
         sc.close();
       	  return;
     }
     
      //Ejercicio 3
      System.out.println("Ejercicio3-Primos");
  		System.out.println("Ingrese un valor entero positivo:");
  		int primo=sc.nextInt();
  		primos(primo);
  		
  		//Ejercicio 4
  		System.out.println("Ejercicio4");
  		System.out.println("PAR o IMPAR:");
  		sc.nextLine();
  		String op=sc.nextLine();
  		System.out.println("Ingrese valor inferior:");
  		int menor=sc.nextInt();
  		System.out.println("Ingrese valor superior:");
  		int mayor=sc.nextInt();
  		parImpar(menor,mayor,op);
    	
  	    //Ejercicio 5
  		System.out.println("Ejercicio5-Empleados");
  		System.out.println("Constructor parametrizado");
  		Calendar calendario = Calendar.getInstance();
  		calendario.set(2005, 4, 15, 15, 30, 10);
  		Empleado empleado1 = new Empleado("Rosa Mamani", calendario.getTime(), 33884410, "rose556@hotmail.com", 299);
  		empleado1.mostrarDatos();
  		System.out.println("Constructor por defecto");
  		Empleado empleado2 = new Empleado();
  		System.out.println("Ingrese nombre:");
  		sc.nextLine();
  		String name = sc.nextLine();
  		empleado2.setNombre(name);
  		System.out.println("Fecha de ingreso");
  		int a, m, d;
  		System.out.println("Ingrese año:");
  		a = sc.nextInt();
        System.out.println("Ingrese mes:");
  		sc.nextLine();
        m = sc.nextInt() - 1;
  		System.out.println("Ingrese dia:");
  		sc.nextLine();
  		d = sc.nextInt();
  		calendario.set(a, m, d, 15, 30, 35);
  		empleado2.setFechaIngreso(calendario.getTime());
  		System.out.println("Ingrese legajo:");
  		sc.nextLine();
  		int leg = sc.nextInt();
  		empleado2.setLegajo(leg);
  		System.out.println("Ingrese e-mail:");
  		sc.nextLine();
  		String email = sc.nextLine();
  		empleado2.setEmail(email);
  		System.out.println("Ingrese horas trabajadas:");
  		int horas= sc.nextInt();
  		empleado2.setHorasTrabajadas(horas);
  		sc.nextLine();
  		System.out.println("Datos del empleado:");
  	    empleado2.mostrarDatos();
  		
      sc.close();
	}
}

package ar.edu.unju.edm.model;
import java.util.Date;
public class Empleado {
	//atributos
   String nombre;
   Date fechaIngreso;
   int legajo;
   String email;
   int sueldo;
   int horasTrabajadas;
   //constructores
   public Empleado() {
	   this.nombre="";
	   this.fechaIngreso=new Date();
	   this.legajo=0;
	   this.email="";
	   this.sueldo=0;
	   this.horasTrabajadas=0;
   }
   public Empleado(String nombre,Date fechaIngreso,int legajo,String email,int horasTrabajadas) {
	   this.nombre=nombre;
	   this.fechaIngreso=fechaIngreso;
	   this.legajo=legajo;
	   this.email=email;
	   this.horasTrabajadas=horasTrabajadas;
	   this.sueldo=calculoSueldo();
   }
   //metodos
   public int calculoSueldo() {
		int sueldo = 0;
		int horas = this.horasTrabajadas;
		if (this.horasTrabajadas > 160) {
			horas -= 160;
			sueldo += 5500 * horas;
		}else {
		    sueldo += 4000 * horas;
		}
		return sueldo;
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre:" + this.nombre); 
		System.out.println("Legajo:" + this.legajo);
		System.out.println("E-Mail:" + this.email);
		System.out.println("Fecha de Ingreso:" + this.fechaIngreso);
		System.out.println("Horas Trabajadas:" + this.horasTrabajadas);
		System.out.println("Sueldo:" + this.sueldo);
	}
   
   //getters y setters
   public String getNombre() {
	return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public String getEMail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSueldo() {
		return sueldo;
	}
	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
}
 
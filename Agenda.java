package agendaDeExamenes;

import java.util.ArrayList;
import java.util.Collections;

public class Agenda {
	
	private ArrayList<Examen> examenes;
	
	public Agenda(){
		this.examenes= new ArrayList<Examen>();		
	}
	
	public void agregarExamen(Examen e){
		this.examenes.add(e);
	}
	
	public void ordenarAgenda(){
		Collections.sort(examenes);
		
	}
	
	public void mostrarAgendaOrdenadaCronologicamente(){
		for(Examen cadaUno:examenes)
			System.out.println(cadaUno);
	}

	public static void main(String[] args) {
		
		Fecha f=new Fecha(29,2,2016);
		System.out.println(f);
		Fecha f1=new Fecha(22,11,2017);
		System.out.println(f1);
		Fecha f2=new Fecha(2,3,17);
		System.out.println(f2);
		Fecha f3=new Fecha(2,3,7);
		System.out.println(f3);
		Fecha f4=new Fecha(28,2,217);
		System.out.println(f4);
		ArrayList<Fecha> fechas = new ArrayList<Fecha>();
		
		fechas.add(f);
		fechas.add(f1);
		fechas.add(f2);
		fechas.add(f3);
		fechas.add(f4);
		
		Collections.sort(fechas);
		
		for(Fecha cadaUno:fechas)
			System.out.println(cadaUno);
		
		Agenda agenda=new Agenda();
		agenda.agregarExamen(new Examen("POO1",217,new Fecha(12,12,2017)));
		agenda.agregarExamen(new Examen("Sistemas Operativos",211,new Fecha(14,12,2017)));
		agenda.agregarExamen(new Examen("POO2",200,new Fecha(30,11,2017)));
		agenda.agregarExamen(new Examen("Base de Datos",12,new Fecha(28,11,2017)));
		agenda.agregarExamen(new Examen("Algoritmos",217,new Fecha(22,12,2017)));
		
		
		agenda.ordenarAgenda();
		agenda.mostrarAgendaOrdenadaCronologicamente();
		
		
		
	}
	
	
	

}

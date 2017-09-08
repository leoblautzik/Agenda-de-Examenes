package agendaDeExamenes;

public class Examen implements Comparable<Examen> {
	private String materia;
	private int aula;
	private Fecha fecha;
	
	public Examen(String m, int a, Fecha f){
		this.materia=m;
		this.aula=a;
		this.fecha=f;
	}
	
	@Override
	public String toString(){
		return "Materia:"+this.materia+" "+ "Aula:"+this.aula+ " "+"Fecha:" +this.fecha; 
	}
	@Override
	public int compareTo(Examen e) {
		return this.fecha.compareTo(e.fecha);
	}
	

}

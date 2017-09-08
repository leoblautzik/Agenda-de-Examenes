package agendaDeExamenes;

public class Fecha implements Comparable<Fecha> {
	private int dia;
	private int mes;
	private int anio;
	
	public Fecha(int d, int m, int a) throws FechaInvalidaException {
		if (!esValida(d,m,a))throw new FechaInvalidaException(" Fecha Invalida ");
		setDia(d);
		setMes(m);
		setAnio(a);

	}

	public String toString(){
		String s="";
		if(this.dia<=9)
			s=s+"0"+this.dia;
		else 
			s=s+this.dia;
		s=s+"/";
		if(this.mes<=9)
			s=s+"0"+this.mes;
		else 
			s=s+this.mes;
		s=s+"/";
		if(this.anio<=9)
			s=s+"000";
		else
			if(this.anio<=99)
				s=s+"00";
			else
				if(this.anio<=999)
					s=s+"0";		
		s=s+this.anio;
		return s;
	}

	private boolean esValida(int d, int m, int a){
		if (d<1 || d>31 || m<1 || m>12 || a<0)
			return false;
					
		if((d==29 && m==2 && a%4!=0)||(d>29 && m==2))
			return false;
		
		if ((m==4 || m==6 || m== 9 || m==11) && d==31)
			return false;
		
		return true;
		
	}
	
	public boolean esAnterior(Fecha f){
		
		if (this.anio<f.anio) return true;
		if (this.anio>f.anio) return false; 
		
		if (this.mes<f.mes) return true;
		if (this.mes>f.mes) return false; 
		
		if (this.dia<f.dia) return true;
		if (this.dia>f.dia) return false; 
		
		return false;
	}
	
	
	public int compareTo(Fecha f){
		if (this.esAnterior(f)) return -1;
		if (f.esAnterior(this)) return 1;
		return 0;
		
		
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

}

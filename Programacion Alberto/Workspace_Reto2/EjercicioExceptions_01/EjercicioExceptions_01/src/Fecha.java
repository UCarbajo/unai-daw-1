
public class Fecha {
	private int ano;
	private int mes;
	private int dia;

	public static final int MESES_AÑO = 12;


	public Fecha(int ano, int mes, int dia) {
		this.ano = ano;
        this.mes = mes;
        this.dia = dia;
	}

	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}


	@Override
	public String toString() {
		return + this.ano + "/" + this.mes + "/" +  this.dia;
	}

	

}
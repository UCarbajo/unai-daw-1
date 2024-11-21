import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {
	private int ano = 0;
	private int mes = 1;
	private int dia = 1;

	public static final int MESES_AÑO = 12;

	public Fecha() {
		super();
	}

	public Fecha(int ano, int mes, int dia) {
		if (mes <= 0 || mes > 12) {
			throw new FechaException("La fecha es incorrecta");
		}
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
	}

	public Fecha(Fecha f) throws FechaException {
		this.ano = f.getAno();
		this.mes = f.getMes();
		this.dia = f.getDia();
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
		if (mes <= 0 || mes > 12) {
			throw new FechaException("La fecha es incorrecta");
		}
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		Calendar calendario = new GregorianCalendar(this.ano, this.mes - 1, 1);
		if (dia <= 0 || dia > calendario.getActualMaximum(Calendar.DAY_OF_MONTH)) {
			throw new FechaException("La fecha es incorrecta");
		}
		this.dia = dia;
	}

	public boolean esBisiesto() {
		if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 100 == 0 && ano % 400 == 0)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean esBisiesto(int ano) {
		if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 100 == 0 && ano % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	public void set(int ano, int mes, int dia) {
		if(mes <= 0 || mes > 12) {
			throw new FechaException("La fecha es incorrecta");
        }
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
	}

	public void set(Fecha f) {
		this.ano = f.getAno();
		this.mes = f.getMes();
		this.dia = f.getDia();
	}

	public boolean equals(Object o) {
		Fecha f = (Fecha) o;
		if (this.ano == f.getAno()) {
			if (this.mes == f.getMes()) {
				if (this.dia == f.getDia()) {
					return true;
				}
			}
		}
		return false;

	}

	@Override
	public String toString() {
		return this.ano + "/" + this.mes + "/" + this.dia;
	}

}

public class Fecha {
	private int ano = 0;
	private int mes = 1;
	private int dia = 1;

	public static final int MESES_AÑO = 12;

	public Fecha() {
		super();
	}

	public Fecha(int ano, int mes, int dia) {
		if(mes <= 0 || mes > 12) {
			throw new FechaException("La fecha es incorrecta");
        }
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
	}

	public Fecha(Fecha f) throws FechaException {
		this.ano = f.getAno();
		this.mes = f.getMes();
		this.dia = f.getMes();
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
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
	}

	public void set(Fecha f) {
		f.setAno(this.ano);
		f.setMes(this.mes);
		f.setDia(this.dia);
	}

	public boolean equals(Object o) {
		Fecha f = (Fecha) o;
			if(this.ano == f.getAno()) {
				if(this.mes == f.getMes()) {
					if(this.dia == f.getDia()) {
						return true;
					}
				}
			}
		return false;

	}

	@Override
	public String toString() {
		return +this.ano + "/" + this.mes + "/" + this.dia;
	}

}
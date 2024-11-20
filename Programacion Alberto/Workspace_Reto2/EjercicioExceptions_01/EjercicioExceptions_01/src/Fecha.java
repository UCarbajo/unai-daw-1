
public class Fecha {
	private int a�o = 0;
	private int mes = 1;
	private int dia = 1;

	public static final int MESES_A�O = 12;

	public static boolean esBisiesto(int a�o);

	public Fecha();

	public Fecha(int a�o, int mes, int dia);

	public Fecha(Fecha f);

	public boolean esBisiesto();

	public void setA�o(int a�o);

	public int getA�o();

	public void setMes(int mes);

	public int getMes();

	public void setDia(int dia);

	public int getDia();

	public void set(int a�o, int mes, int dia);

	public void set(Fecha f);

	public String toString();

	public boolean equals(Object o);

}
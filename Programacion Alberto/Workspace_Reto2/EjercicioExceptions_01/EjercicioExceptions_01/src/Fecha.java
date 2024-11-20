
public class Fecha {
	private int año = 0;
	private int mes = 1;
	private int dia = 1;

	public static final int MESES_AÑO = 12;

	public static boolean esBisiesto(int año);

	public Fecha();

	public Fecha(int año, int mes, int dia);

	public Fecha(Fecha f);

	public boolean esBisiesto();

	public void setAño(int año);

	public int getAño();

	public void setMes(int mes);

	public int getMes();

	public void setDia(int dia);

	public int getDia();

	public void set(int año, int mes, int dia);

	public void set(Fecha f);

	public String toString();

	public boolean equals(Object o);

}
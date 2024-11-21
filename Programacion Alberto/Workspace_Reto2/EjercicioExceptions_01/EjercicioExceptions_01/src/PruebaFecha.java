

public class PruebaFecha {
	public static final int MAX_FECHAS = 100;

	public static int random(int min, int max) {
		return (int) (Math.random() * (max - min + 1)) + min;
	}

	public static void main(String[] args) {
		for (int i = 0; i < MAX_FECHAS; i++) {
			try {
				Fecha f = new Fecha(random(1, 2007), random(1, Fecha.MESES_AÑO), random(1, 31));
				boolean Bisiesto = f.esBisiesto();
				
				System.out.println("Fecha correcta: " + f + " " + Bisiesto);
			} catch (Exception e) {
				System.out.println("EXCEPTION: " + e.getMessage());
			}
		}
	}
	public static void validarFecha(boolean bi, Fecha f) throws FechaException {
		if((bi == true && f.getMes() == 2 && f.getDia() > 29) || (bi == false && f.getMes() == 2 && f.getDia() > 28)) {
			throw new FechaException();
        }
    }
}

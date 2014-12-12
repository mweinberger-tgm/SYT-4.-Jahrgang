package calculator;
import java.math.BigDecimal;

/**
 * 
 * Ein Interface, dass die Funktion fuer die Berechnung für die Nachkommastellen vordeklariert
 * 
 * @author Michael Weinberger & Matthias El-Far 4AHITT
 * @version 2014-12-12
 *
 */

public interface Calculator {
	
	public BigDecimal pi (int anzahl_nachkommastellen);
		
}
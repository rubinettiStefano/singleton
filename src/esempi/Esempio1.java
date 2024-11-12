package esempi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Esempio1
{


	public static void main(String[] args)
	{
		String laDataFintaEbrutta = "12/11/2024";
		LocalDate laVeraData = LocalDate.of(2024,11,12);
		//                       new LocalDate(2024,11,12);
		//alcune classi offrono metodi statici per generare proprie istanze, al posto del costruttore
		LocalDate tra40giorni = laVeraData.plusDays(140);

		System.out.println(tra40giorni);


		LocalTime oraDiInizioLezione = LocalTime.of(16, 0, 0);

		LocalTime perdonateliVoid = LocalTime.parse("04:00 pm", DateTimeFormatter.ofPattern("hh:mm a"));
		oraDiInizioLezione = oraDiInizioLezione.plusMinutes(70);
		System.out.println(perdonateliVoid);

		LocalDate oggi = LocalDate.now();
		LocalTime adesso = LocalTime.now();

		System.out.println("Siamo nel giorno "+oggi);
		System.out.println("all'ora "+adesso.format(DateTimeFormatter.ofPattern("HH:mm")));

		//yyyy-MM-dd
		//dd/MM/yyyy

		// yyyy -> anno
		// MM -> mese
		// dd -> giorno

		//HH ore formato 24
		//hh ore formato 12
		//mm minuti
		//ss secondi
		//SSS millisecondi
		//a pm/am
		LocalDateTime adessovero = LocalDateTime.now();
		adessovero = adessovero.plusHours(240);
		System.out.println("Siamo nel giorno "+adessovero.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
	}


}

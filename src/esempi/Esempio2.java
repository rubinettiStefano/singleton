package esempi;

import java.time.LocalDate;
import java.util.List;

public class Esempio2
{

	public static void main(String[] args)
	{
		Planner p = Planner.getInstance();
		Appointment dentista = new Appointment("Dentista","aiiiii","23/11/2024","16:09");
		Appointment palestra = new Appointment("Palestra","iron","12/11/2024","18:09");

		p.addAppointment(dentista);
		p.addAppointment(palestra);


		List<Appointment> tutti = p.getAppointments();
		LocalDate min = LocalDate.of(2024,11,10);
		LocalDate max = LocalDate.of(2024,11,15);

		tutti.removeIf(d->d.getSchedule().toLocalDate().isBefore(min)||d.getSchedule().toLocalDate().isAfter(max));

		//System.out.println(p.getAppointments());


		sottoprogramma();
	}

	private static void sottoprogramma()
	{
		Planner p =Planner.getInstance();
		System.out.println(p.getAppointments());
	}
}

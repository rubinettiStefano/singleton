package esempi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Appointment
{
	private LocalDateTime schedule;
	private String title;
	private String description;

	public Appointment(){}

	public Appointment(String title, String description, String date, String time)
	{
		this.title = title;
		this.description = description;
		setSchedule(date, time);
	}


	public LocalDateTime getSchedule()
	{
		return schedule;
	}

	public void setSchedule(LocalDateTime schedule)
	{
		this.schedule = schedule;
	}

	public void setSchedule(int year, int month, int day, int hour, int minute)
	{
		this.schedule = LocalDateTime.of(year, month, day, hour, minute);
	}

	/**
	 * Voglio la data in formato eu e il tempo come ore:minuti
	 */
	public void setSchedule(String laDataInStringa,String time)
	{
		LocalDate localDate = LocalDate.parse(laDataInStringa, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalTime localTime = LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm"));
		this.schedule = LocalDateTime.of(localDate, localTime);
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String toString()
	{
		return "Appuntamento in data "+schedule.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"))+"\n"+
				"Titolo: "+title+"\n"+
				"Descrizione: "+description				;
	}
}

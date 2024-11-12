package esempi;

import java.util.ArrayList;
import java.util.List;

public class Planner
{
   	//1) Rendere costruttore private (riga 20)
	//2) Creare proprietà static con l'unica istanza della classe (riga 13)
	//3) creare il suo getter (riga 15)


//	private static Planner mySingleInstance = new Planner();
//
//	public static Planner getInstance()
//	{
//		return mySingleInstance;
//	}

	private static Planner mySingleInstance = null;

	public static Planner getInstance()
	{
		if(mySingleInstance == null)
			mySingleInstance = new Planner();

		return mySingleInstance;
	}


	private Planner(){}

	private List<Appointment> appointments = new ArrayList<>();

	public List<Appointment> getAppointments()
	{
		List<Appointment> res = new ArrayList<>(appointments);
		return res;//clono
		//return appointments;
	}

	public void addAppointment(Appointment a)
	{
		appointments.add(a);
	}

	public void removeAppointment(Appointment a)
	{
		appointments.remove(a);
	}

	public void modifyAppointment(Appointment oldVersion, Appointment newVersion)
	{
		appointments.remove(oldVersion);
		appointments.add(newVersion);
	}

}

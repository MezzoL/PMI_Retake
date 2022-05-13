import java.util.ArrayList;

public class Dentist
{
    ArrayList<Appointments> appointments = new ArrayList<>();
    public void newAppointment(String patientName, String timestamp)
    {
        boolean teeth = false;
        for (int i = 0; i < appointments.size(); i++)
        {
            if (appointments.get(i).getPatientName().equals(patientName))
            {
                teeth = true;
            }
        }
        if (!teeth)
        {
            appointments.add(new Appointments(patientName, timestamp));
        }
    }
    public String getAppointments() {
        String give_time = "";
        for (int i = 0; i < appointments.size(); i++)
            {
                if (i < appointments.size() - 1)
                {
                    give_time = give_time + appointments.get(i).getPatientName() + " " + appointments.get(i).getAppointment() + "\r\n";
                }else
                {
                    give_time = give_time + appointments.get(i).getPatientName() + " " + appointments.get(i).getAppointment();
                }
            }
        return give_time;
    }
    public void resign(String patientName)
    {
        for (int i = 0; i < appointments.size(); i++)
        {
            if (appointments.get(i).getPatientName().equals(patientName))
            {
                appointments.remove(i);
                break;
            }
        }
    }
    class Appointments
    {
        String patientName;
        String appointment;

        public Appointments(String patients, String appoints)
        {
            this.patientName = patients;
            this.appointment = appoints;
        }
        public String getPatientName()
        {
            return patientName;
        }
        public void setPatientName(String patients)
        {
            this.patientName = patients;
        }
        public String getAppointment()
        {
            return appointment;
        }
        public void setAppointment(String appoints)
        {
            this.appointment = appoints;
        }
    }
}
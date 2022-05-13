public class Assistant extends Dentist
{
    public void refreshAppointment(String patients, String timestamp)
    {
        for (int i = 0; i < appointments.size(); i++)
        {
            if(appointments.get(i).getPatientName().equals(patients))
            {
                appointments.get(i).setAppointment(timestamp);
            }
        }
    }
}




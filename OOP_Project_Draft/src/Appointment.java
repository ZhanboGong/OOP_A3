import javax.print.Doc;

public class Appointment {
    private String Name;
    private String MobilePhone;
    private String TimeSlot;
    private HealthProfessional healthprofessional;

    public Appointment(){}
    public Appointment(String Name, String MobilePhone, String TimeSlot, HealthProfessional healthprofessional)
    {
        this.Name = Name;
        this.MobilePhone = MobilePhone;
        this.TimeSlot = TimeSlot;
        this.healthprofessional = healthprofessional;
    }
    public void PrintInformation()
    {
        System.out.println("================================");
        System.out.println("Patient Name: " + Name);
        System.out.println("Mobile Phone: " + MobilePhone);
        System.out.println("Doctor: " + healthprofessional);
        System.out.println("================================");
        System.out.println();
        System.out.println("Please check the printed information!");
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMobilePhone() {
        return MobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        MobilePhone = mobilePhone;
    }

    public String getTimeSlot() {
        return TimeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        TimeSlot = timeSlot;
    }

    public Object getHealthProfessional() {
        return healthprofessional;
    }

    public void setHealthProfessional(HealthProfessional healthProfessional) {
        //加一条判断是否为医疗专家子类
        healthprofessional = healthProfessional;
    }
}

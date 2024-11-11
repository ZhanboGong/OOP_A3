public class Surgeon extends HealthProfessional{
    private String SurgicalField;
    public Surgeon()
    {
        super();
    }
    public Surgeon(int ID, String Name, String OfficeAddress, String SurgicalField)
    {
        super(ID, Name, OfficeAddress);
        this.SurgicalField = SurgicalField;
    }

    @Override
    public void PrintInformation()
    {
        System.out.println("================================");
        System.out.println("Surgeon Information");
        System.out.println("ID: " + getID());
        System.out.println("Name: " + getName());
        System.out.println("Office Address: " + getOfficeAddress());
        System.out.println("Surgical Field: " + SurgicalField);
        System.out.println("================================");
        System.out.println();
        System.out.println("Please check the printed information!");
    }

    public String getSurgicalField() {
        return SurgicalField;
    }

    public void setSurgicalField(String surgicalField) {
        SurgicalField = surgicalField;
    }
}

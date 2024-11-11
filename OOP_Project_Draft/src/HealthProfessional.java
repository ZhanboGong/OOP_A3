public class HealthProfessional {
    private int ID;
    private String Name;
    private String OfficeAddress;

    public HealthProfessional()
    {
        this.ID = 0;
        this.Name = null;
        this.OfficeAddress = null;
    }
    public HealthProfessional(int ID, String Name,String OA)
    {
        this.ID = ID;
        this.Name = Name;
        this.OfficeAddress = OA;
        //可以加一个部门
    }

    public void PrintInformation()
    {
        System.out.println("================================");
        System.out.println("Health Professional Information");
        System.out.println("ID: " + ID);
        System.out.println("Name: " + Name);
        System.out.println("Office Address: " + OfficeAddress);
        System.out.println("================================");
        System.out.println();
        System.out.println("Please check the printed information!");
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getOfficeAddress() {
        return OfficeAddress;
    }

    public void setOfficeAddress(String OfficeAddress) {
        this.OfficeAddress = OfficeAddress;
    }
}

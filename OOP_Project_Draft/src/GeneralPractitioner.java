public class GeneralPractitioner extends HealthProfessional{

    private boolean VisitingService;

    public GeneralPractitioner()
    {
        super();
    }
    public GeneralPractitioner(int ID, String Name, String OfficeAddress, boolean VisitingService)
    {
        super(ID, Name, OfficeAddress);
        this.VisitingService = VisitingService;
    }

    @Override
    public void PrintInformation()
    {
        System.out.println("================================");
        System.out.println("General Practitioner Information");
        System.out.println("ID: " + getID());
        System.out.println("Name: " + getName());
        System.out.println("Office Address: " + getOfficeAddress());
        System.out.println("Visiting Service Statue: " + VisitingService);
        System.out.println("================================");
        System.out.println();
        System.out.println("Please check the printed information!");
    }
    public boolean isVisitingService() {
        return VisitingService;
    }

    public void setVisitingService(boolean visitingService) {
        VisitingService = visitingService;
    }
}

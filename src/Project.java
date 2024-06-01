import java.util.List;

public class Project {
    private String name;
    private List<Resource> theResources;
    private List<Employee> theEmployees;
    private WorkBreakdownStructure theWorkBreakdownStructure;

    // Métodos getters y setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<Resource> getTheResources() { return theResources; }
    public void setTheResources(List<Resource> theResources) { this.theResources = theResources; }
    public List<Employee> getTheEmployees() { return theEmployees; }
    public void setTheEmployees(List<Employee> theEmployees) { this.theEmployees = theEmployees; }
    public WorkBreakdownStructure getTheWorkBreakdownStructure() { return theWorkBreakdownStructure; }
    public void setTheWorkBreakdownStructure(WorkBreakdownStructure theWorkBreakdownStructure) { this.theWorkBreakdownStructure = theWorkBreakdownStructure; }
}


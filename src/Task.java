import java.util.List;

public class Task {
    private String name;
    private List<Employee> theEmployees;
    private List<Resource> theResources;

    // Métodos getters y setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<Employee> getTheEmployees() { return theEmployees; }
    public void setTheEmployees(List<Employee> theEmployees) { this.theEmployees = theEmployees; }
    public List<Resource> getTheResources() { return theResources; }
    public void setTheResources(List<Resource> theResources) { this.theResources = theResources; }
}

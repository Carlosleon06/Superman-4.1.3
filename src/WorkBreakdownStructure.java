import java.util.List;

public class WorkBreakdownStructure {
    private String name;
    private List<Task> theTasks;

    // Métodos getters y setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<Task> getTheTasks() { return theTasks; }
    public void setTheTasks(List<Task> theTasks) { this.theTasks = theTasks; }
}

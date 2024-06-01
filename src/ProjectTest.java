import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ProjectTest {

    @Test
    public void testSetName() {
        Project project = new Project();
        project.setName("Project Alpha");
        assertEquals("Project Alpha", project.getName());
    }

    @Test
    public void testSetResources() {
        Project project = new Project();
        Resource resource = new Resource();
        resource.setName("Resource 1");
        List<Resource> resources = new ArrayList<>();
        resources.add(resource);
        project.setTheResources(resources);
        assertEquals("Resource 1", project.getTheResources().get(0).getName());
    }
}

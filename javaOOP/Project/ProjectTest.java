public class ProjectTest {
    public static void main(String[] args) {
        Project newProject = new Project();
        newProject.setName("Gandalf");
        newProject.setDescription("The White");

        System.out.println(newProject.elevatorPitch());
        
    }
}
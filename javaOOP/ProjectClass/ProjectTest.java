public class ProjectTest {
    public static void main(String[] args) {
        Project project1 = new Project();
        Project project2 = new Project("2nd Project");
        Project project3 = new Project("3rd Project", "Project Description");

        System.out.println(project1.elevatorPitch());
        System.out.println(project2.elevatorPitch());
        System.out.println(project3.elevatorPitch());

        project1.setName("1st Project");
        project1.setDescription("Project 1 Description");
        System.out.println("Project 1: "+ project1.elevatorPitch());

        project2.setDescription("Project 2 Description");
        System.out.println(project1.getProjectName());
        System.out.println(project1.getDescription());
    }
}
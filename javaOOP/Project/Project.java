public class Project {
    private String name;
    private String description;

    public String elevatorPitch() {
        return name + " : " + description; 
    }

    public Project(){

    }

    public Project(String name) {
        this.name = name; 
    }

    public Project(String name, String description) {
        this.name = name; 
        this.description = description;
    }

    //setters
    public void setName(String newName) {
        this.name = newName;
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    //getters
    public String getName() {
        return name; 
    }

    public String getDescription() {
        return description;
    }
}
public class Project {
    private String name;
    private String description;

    public String elevatorPitch(){
        return this.getName()+": "+ this.getDescription();
    }
    public Project(){
        this.name = "";
        this.description = "";    
    }
    public Project(String name){
        this.name = name;
    }
    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void setDescription(String newDescription){
        this.description = newDescription;
    }
}
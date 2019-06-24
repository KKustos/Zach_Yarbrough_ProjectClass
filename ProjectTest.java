public class ProjectTest {
    public static void main(String[] args){
        Project p = new Project();
        Project p2 = new Project("Project 2", "Description for Project 2...");
        Project p3 = new Project("Project 3");

        p.setName("Project 1");
        p.setDescription("Description for Project...");
        System.out.print(p.elevatorPitch()+"\n");
        System.out.println(p2.elevatorPitch());
        System.out.println(p3.getName());

    }
}
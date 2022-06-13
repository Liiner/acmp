public class Main {
    public static void main(String[] args) {
        Team[] teamsArray = new Team[4];
        teamsArray[0] = new Team("Roma", 40);
        teamsArray[1] = new Team("Petya", 50);
        teamsArray[2] = new Team("Sasha", 100);
        teamsArray[3] = new Team("Sveta", 70);
        Course course = new Course(60);
        course.doIt(teamsArray);
        course.showDistance();
        course.showResults(teamsArray);
        }
}

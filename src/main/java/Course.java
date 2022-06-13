public class Course {
    int runCourse;

    public  Course(int runCourse){
        this.runCourse = runCourse;
    }

    public void doIt(Team team[]){
        for (int i = 0; i < team.length; i++  ) {
            if (team[i].run >= runCourse) {
                System.out.println(team[i].name + " прошел дистанцию ");
            } else {
                System.out.println(team[i].name + " не прошел дистанцию");
            }
        }
    }

    public void   showResults(Team team[]) {
        for (int i = 0; i < team.length; i++  ) {
            System.out.println("Участник :" + team[i].name + " пробежал " + team[i].run );
        }
    }

    public void  showDistance(){
        System.out.println("_________________");
        System.out.println(" Дистация : " + runCourse);
        System.out.println("_________________");
    }
}

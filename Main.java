package lesson1;

public class Main {
    public static void main(String[] args){
        Team team1 = new Team("Pervi", new String[]{"Petya", "Vasya", "Olya", "Oleg"},5,4);
        team1.allInfo();
        Course course1 = new Course(3,8,3);
        course1.doIt(team1);
    }
}

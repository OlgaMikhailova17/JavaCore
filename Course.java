package lesson1;

public class Course {
    private int wall;
    private int time;
    private int pool;

    public Course(int wall,int pool,int time){
        this.pool=pool;
        this.wall=wall;
        this.time=time;
    }

    public int getWall() {
        return wall;
    }

    public void setWall(int wall) {
        this.wall = wall;
    }

    public int getPool() {
        return pool;
    }

    public void setPool(int pool) {
        this.pool = pool;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void doIt(Team team){
        if((((team.getSpeed()*getTime())>getPool()))&&(getWall()<team.getJump())){
            System.out.print("The team swam through the pool and jumped over the wall");

        }
        else {
            System.out.print("The team did not pass the test");

        }
    }
}

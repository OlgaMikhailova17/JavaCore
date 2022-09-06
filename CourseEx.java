package lesson9;

public class CourseEx implements Course{
    private String name;

    public CourseEx(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

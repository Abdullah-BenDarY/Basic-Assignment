package oop.season2.person;

public class Teacher extends Person {
    private int numberOfCourses;
    private String courses[];
    final int COURSES_CAPACITY = 10;

    public Teacher(String name, String adress, int numberOfCourses, String courses[]) {
        super(name, adress);
        courses = new String[COURSES_CAPACITY];
        numberOfCourses = 0;
    }

    public boolean addCourse(String courseName) {
        if (numberOfCourses == COURSES_CAPACITY) {
            return false;
        }
        for (int i = 0; i < numberOfCourses; i++) {
            if (courseName.equals(courses[i])) {
                System.out.println("This course is already exist.");
                return false;
            }
        }
        courses[numberOfCourses] = courseName;
        numberOfCourses++;
        return true;
    }

    public boolean removeCourse(String courseName) {
        int index = -1;
        for (int i = 0; i < numberOfCourses; i++) {
            if (courseName.equals(courses[i])) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return false;
        }
        for (int i = index; i<numberOfCourses-1; i++){
            courses[i]=courses[i+1];
        }
        numberOfCourses--;
        return true;
    }
}

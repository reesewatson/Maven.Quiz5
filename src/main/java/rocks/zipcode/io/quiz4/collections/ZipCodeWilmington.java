package rocks.zipcode.io.quiz4.collections;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington extends Student {

    private List<Student> students;
    private double numberOfHours;


    public void enroll(Student student) {

        this.students.add(student);

    }

    public Boolean isEnrolled(Student student) {

        if (students.contains(student)) {
            return true;
        }
        return false;
    }

    public void lecture(double numberOfHours) {

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            student.learn(numberOfHours);
        }

    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> map = new LinkedHashMap<>();
        for (Student student : students)
            map.put(student, student.getTotalStudyTime(numberOfHours));
        return map;
    }

}


package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {

    private Integer id;
    private double totalStudyTime;

    public Student() {

        this(null);
    }

    public Student(Integer id) {
        this.id = id;
        this.totalStudyTime = 0.0;
    }

    public void learn(Double amountOfHours) {

        //Method takes in an amount of hours.
        //Has no return type.
        //Is a setter of sorts.

        totalStudyTime += amountOfHours;
    }

    public Double getTotalStudyTime(double numberOfHours) {

        return this.totalStudyTime;
    }
}

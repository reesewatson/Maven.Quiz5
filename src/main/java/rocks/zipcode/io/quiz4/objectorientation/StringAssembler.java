package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {

    private char delimeter;
    private StringBuilder stringBuilder;

    public StringAssembler(Character delimeter) {
        this.delimeter = delimeter;
        this.stringBuilder = new StringBuilder();
    }

    public StringAssembler append(String str) {

        return null; // this.stringBuilder.append(str).append(delimeter);
    }

    public String assemble() {
        return null;
    }
}

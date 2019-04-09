package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.StringEvaluator;

/**
 * @author leon on 19/12/2018.
 */
public class StringEvaluatorObject {

    private String str;
    private String secondInput;
    private StringEvaluator evaluator;

    public StringEvaluatorObject(String str) {
        this.str = str;
        this.secondInput = secondInput;
        this.evaluator = new StringEvaluator();
    }

    public String[] getAllSubstrings() {

        return evaluator.getAllSubstrings(str);
    }

    public String[] getCommonSubstrings(String secondInput) {

        return evaluator.getCommonSubstrings(str, secondInput);
    }

    public String getLargestCommonSubstring(String secondInput) {

        return evaluator.getLargestCommonSubstring(str, secondInput);
    }
}

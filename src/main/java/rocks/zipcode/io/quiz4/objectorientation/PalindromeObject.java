package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.PalindromeEvaluator;

import static rocks.zipcode.io.quiz4.fundamentals.PalindromeEvaluator.isPalindrome;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObject {

    private String input;
    private PalindromeEvaluator evaluator;

    public PalindromeObject(String input) {
        this.input = input;
        this.evaluator = new PalindromeEvaluator();
    }

    public String[] getAllPalindromes(){

        return this.evaluator.getAllPalindromes(input);
    }

    public Boolean isPalindrome(){

        return this.evaluator.isPalindrome(input);
    }

    public String reverseString(){

        return evaluator.reverseString(input);
    }
}

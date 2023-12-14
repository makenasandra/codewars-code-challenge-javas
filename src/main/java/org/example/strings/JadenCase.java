package org.example.strings;

/**
 * Jaden Casing Strings
 *
 * Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013). Jaden is also known for some of his philosophy that he delivers via Twitter. When writing on Twitter, he is known for almost always capitalizing every word. For simplicity, you'll have to capitalize each word, check out how contractions are expected to be in the example below.
 *
 * Your task is to convert strings to how they would be written by Jaden Smith. The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.
 *
 * Example:
 *
 * Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
 * Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
 * Note that the Java version expects a return value of null for an empty string or null.
 */
public class JadenCase {

    public static void main(String[] args) {

        toJadenCase("most trees are blue");
    }
    public static String toJadenCase(String phrase) {
        // TODO put your code below this comment
        if(phrase == null || phrase.isEmpty())return null;
        String[] phraseArray = phrase.split(" ");
        for (int i = 0; i < phraseArray.length; i++) {
            String[] stringArray = phraseArray[i].split("");
            stringArray[0] = stringArray[0].toUpperCase();
            String joinedString = String.join("", stringArray);
            phraseArray[i] = joinedString;
//            System.out.println(joinedString);
        }
        phrase =  String.join(" ", phraseArray);
//        System.out.println(phrase);
        return phrase;
    }


}



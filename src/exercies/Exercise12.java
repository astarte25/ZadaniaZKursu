package exercies;

/**
 * Za pomocą rekurencji rozdziel podany ciąg znaków od
 * użytkownika gwiazdką (*).
 * <p>
 * Wejście:
 * Kasia
 * Wyjście
 * K*a*s*i*a
 */
public class Exercise12 {

    public static void main(String[] args) {
        System.out.println(starText("example"));
    }

    public static String starText(String text) {
        if (text.length() < 2) {
            return text;
        }
        return text.charAt(0) + "*" + starText(text.substring(1));
    }
}

import java.util.stream.Collectors;

public class AtBash {

    public static String atbash(String input){
        return input.chars().mapToDouble(c->(double)c).map(c ->
                (int)(3/((((c-'A')-12.5)/13.0*((c-'A')-12.5)/13.0)+2)) // selects uppercase letters
                        *('Z'-c+'A')  // and reverses them
                +(int)(3/((((c-'a')-12.5)/13.0*((c-'a')-12.5)/13.0)+2)) // selects lowercase letters
                        *('z'-c+'a') // and reverses them
                +(1
                   -(int)(3/((((c-'A')-12.5)/13.0*((c-'A')-12.5)/13.0)+2)) // deselects uppercase letters,
                   -(int)(3/((((c-'a')-12.5)/13.0*((c-'a')-12.5)/13.0)+2)) // deselects lowercase letters,
                )*c) // and leaves non-letters unaffected
                .mapToObj(c -> Character.valueOf((char)c).toString())
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        //Rather math-y, wanted to try making it without conditionals
        System.out.println(atbash("apple"));
        System.out.println(atbash("Hello world!"));
        System.out.println(atbash("Christmas is the 25th of December"));
    }
}

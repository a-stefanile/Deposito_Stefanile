public class MiddleMain {
    public static void main(String[] args) {
        String text = "Ciao, sono stato rApito dagLi alieni";
        CapsLock capsLock = new CapsLock();
        FirstLetterUpperCase firstLetterUpperCase = new FirstLetterUpperCase();
        ReverseString reverseString = new ReverseString();

        System.out.println(reverseString.apply(text));
        System.out.println(capsLock.apply(text));
        System.out.println(firstLetterUpperCase.apply(text));

    }
}

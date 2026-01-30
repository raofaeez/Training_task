package LinearAndBinary;

public class ConcatUsingbuffer {
    public static String concatenateStrings(String[] arr) {

        // Step 1: Create StringBuffer
        StringBuffer sb = new StringBuffer();

        // Step 2: Append each string to StringBuffer
        for (String s : arr) {
            sb.append(s);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String[] arr = {"Hello", " ", "World", "!"};

        String result = concatenateStrings(arr);
        System.out.println(result);
    }
}

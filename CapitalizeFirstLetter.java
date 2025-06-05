public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        String input = "hello world";
        String output = input.substring(0, 1).toUpperCase() + input.substring(1);
        System.out.println(output);
    }
}

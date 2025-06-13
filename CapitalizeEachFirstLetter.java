public class CapitalizeEachFirstLetter {
    public static void main(String[] args) {
        String str = "naresh it";
        String[] words = str.trim().split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }
        System.out.println(result.toString().trim());
    }
}

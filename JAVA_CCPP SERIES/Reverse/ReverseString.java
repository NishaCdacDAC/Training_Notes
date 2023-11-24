public class ReverseString {
    public static void main(String[] args) {
        String input = "Hello!Goodmorning";
        String reversed = reverseString(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseString(String input) {
        char[] characters = input.toCharArray();
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            // Swap the characters at the left and right indices
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;

            // Move the indices towards the center
            left++;
            right--;
        }

        return new String(characters);
    }
}

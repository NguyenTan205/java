import java.util.Stack;

public class ReverseWordsUsingStac {
    public static String reverseWords(String sentence) {
        Stack<String> wordStack = new Stack<>();
        String[] words = sentence.trim().split("\\s+");

        // Bước 1: Push từng từ vào Stack
        for (String word : words) {
            wordStack.push(word);
        }

        // Bước 2: Pop ngược các từ ra để tạo chuỗi mới
        StringBuilder result = new StringBuilder();
        while (!wordStack.isEmpty()) {
            result.append(wordStack.pop()).append(" ");
        }

        return result.toString().trim(); // loại bỏ khoảng trắng cuối
    }

    public static void main(String[] args) {
        String input = "Java is very powerful";
        String reversed = reverseWords(input);

        System.out.println("Chuỗi gốc: " + input);
        System.out.println("Chuỗi đảo ngược: " + reversed);
    }
}


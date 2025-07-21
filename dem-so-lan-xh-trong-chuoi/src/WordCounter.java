import java.util.Map;
import java.util.TreeMap;

public class WordCounter {
    public static void main(String[] args) {
        String text = "Chuong trinh su dung TreeMap de dem so lan xuat hien cua moi tu. Chuong trinh rat huu ich.";

        // Chuyển toàn bộ chuỗi thành chữ thường và tách từ
        String[] words = text.toLowerCase().split("\\W+"); // \W+: tách theo ký tự không phải chữ

        // Khởi tạo TreeMap để lưu từ và số lượng
        TreeMap<String, Integer> wordMap = new TreeMap<>();

        // Duyệt từng từ trong mảng
        for (String word : words) {
            if (word.isEmpty()) continue; // bỏ qua từ rỗng

            if (wordMap.containsKey(word)) {
                wordMap.put(word, wordMap.get(word) + 1);
            } else {
                wordMap.put(word, 1);
            }
        }

        // Hiển thị kết quả
        System.out.println("Số lần xuất hiện của các từ:");
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

import java.io.*;
import java.util.Scanner;

public class CopyFileText {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập đường dẫn tệp nguồn: ");
        String sourcePath = scanner.nextLine();

        System.out.print("Nhập đường dẫn tệp đích: ");
        String targetPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);

        // Kiểm tra nếu tệp nguồn không tồn tại
        if (!sourceFile.exists()) {
            System.out.println("❌ Tệp nguồn không tồn tại.");
            return;
        }

        // Cảnh báo nếu tệp đích đã tồn tại
        if (targetFile.exists()) {
            System.out.println("⚠️ Tệp đích đã tồn tại. Ghi đè...");
        }

        int charCount = 0;

        // Tiến hành sao chép tệp
        try (
                FileReader reader = new FileReader(sourceFile);
                FileWriter writer = new FileWriter(targetFile)
        ) {
            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
                charCount++;
            }

            System.out.println("✅ Đã sao chép thành công.");
            System.out.println("🔢 Số ký tự đã sao chép: " + charCount);

        } catch (IOException e) {
            System.out.println("❌ Đã xảy ra lỗi khi sao chép tệp: " + e.getMessage());
        }
    }
}


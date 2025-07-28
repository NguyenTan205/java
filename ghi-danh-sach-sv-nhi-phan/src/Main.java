import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    //Tạo phương thức ghi danh sách học sinh vào file. Nó nhận:
    // Path: đường dẫn file,
    // students: danh sách đối tượng Student.
    public static void writeDataToFile(String Path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(Path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));

        writeDataToFile("students.txt", students);
        List<Student> studentDataFromFile = readDataFromFile("students.txt");
        for (Student student : studentDataFromFile) {
            System.out.println(student);
        }
    }

    // Bước 6: Tạo phương thức readDataFromFile(String path) trong lớp Main để lấy ra danh sách học viên đang có
    // trong file student.txt
    public static List<Student> readDataFromFile(String path) {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return students;
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Program {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        inputData();
        for (String s : listsIPv4()) {
            System.out.println(s);
        }
    }

    public static void inputData() throws Exception {
        //writeFile
        System.out.println("Chương trình ghi file:");
        System.out.println("Nhập vào file muốn ghi:");
        String path = ScannerUltis.inputString();

        //Random
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int o1 = random.nextInt(222) + 1;
            int o2 = random.nextInt(256);
            int o3 = random.nextInt(256);
            int o4 = random.nextInt(256);
            int prefix = random.nextInt(32) + 1;
            String content = o1 + "." + o2 + "." + o3 + "." + o4 + "/" + prefix + "\n";
            IOManager.writeFile(path, true, content);
        }
    }

    public static List<String> listsIPv4() throws Exception {
        //readFile
        System.out.println("Chương trình đọc file:");
        System.out.println("Nhập vào file muốn đọc:");
        String path1 = ScannerUltis.inputString();
        String s = IOManager.readFile(path1);
        sc = new Scanner(s);
        List<String> listsIPv4 = new ArrayList<>();
        while (sc.hasNext()) {
            listsIPv4.add(sc.next());
        }
        return listsIPv4;
    }
}

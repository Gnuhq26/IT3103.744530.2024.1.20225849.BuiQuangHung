import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbageHungBQ {
    public static void main(String[] args) throws IOException {
        String filename = "D:\\HUST\\20241\\OOP_Lab\\IT3103.744530.2024.1.20225849.BuiQuangHung\\Lab2\\OtherProject\\src\\test.txt";
        byte[] inputBytes = { 0 };
        long startTime, endTime;

        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
            startTime = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            for(byte b : inputBytes) {
                sb.append((char)b);
            }
            String oupuString = sb.toString();
            endTime = System.currentTimeMillis();
            System.out.println(endTime - startTime);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
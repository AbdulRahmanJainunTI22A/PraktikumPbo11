import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @AbdulRahmanJainun
 */
public class CSVWriter {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\kompoter 17\\Documents\\new_students.csv";
        String[] data = {
                "4, David, 23",
                "5, Eva, 22",
                "6, Ferdi, 21"
        };

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {
            for (String line : data) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
    

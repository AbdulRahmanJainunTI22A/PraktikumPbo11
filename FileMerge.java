import java.io.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @AbdulrahmanJainun
 */
public class FileMerge {
    public static void main(String[] args) {
        String[] files = {
            "C:\\Users\\kompoter 17\\Documents\\students.csv",
            "C:\\Users\\kompoter 17\\Documents\\new_students.csv"
        };
        String mergedFile = "C:\\Users\\kompoter 17\\Documents\\merge_students.csv";
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(mergedFile))){
            for (String file : files){
                try (BufferedReader br = new BufferedReader(new FileReader(file))){
                    String line;
                    while ((line = br.readLine()) != null){
                        bw.write(line);
                        bw.newLine();
                    }
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

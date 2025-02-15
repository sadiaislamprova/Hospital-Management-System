/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AddDoctor_input {
    public void addDoctorToFile(String id, String name, String specialty) {
        String fileName = "addDoctor.txt";

        try {
            // Create a File object
            File file = new File(fileName);

            // Check if the file exists, create it if not
            if (!file.exists()) {
                file.createNewFile();
            }

            // Append data to the file
            FileWriter fileWriter = new FileWriter(file, true); // 'true' for appending
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Write the doctor details
            String record = id + "," + name + "," + specialty;
            bufferedWriter.write(record);
            bufferedWriter.newLine(); // Move to the next line for the next record

            // Close the writer
            bufferedWriter.close();

            System.out.println("Doctor added successfully: " + record);
        } catch (IOException e) {
            // Handle exceptions
            System.err.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}

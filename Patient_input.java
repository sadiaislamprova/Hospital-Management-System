
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;



public class Patient_input {
    public void PatientToFile(String id, String name, String disease) {
        String fileName = "patient.txt";

        try {
            // Create a File object for the specified file
            File file = new File(fileName);

            // Check if the file exists; create it if it doesn't
            if (!file.exists()) {
                file.createNewFile();
            }

            // Capture the current date and time
            String currentDate = LocalDate.now().toString(); // Format: YYYY-MM-DD
            String currentTime = LocalTime.now().toString(); // Format: HH:MM:SS

            // Append data to the file
            try (FileWriter fileWriter = new FileWriter(file, true);
                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

                // Combine data into a single string, separated by commas
                String record = id + "," + name + "," + disease + "," + currentDate + "," + currentTime;

                // Write the record to the file
                bufferedWriter.write(record);
                bufferedWriter.newLine(); // Move to the next line for the next record
            }

            // Show a success message
            JOptionPane.showMessageDialog(null, "Data inserted successfully");

        } catch (IOException e) {
            // Handle exceptions
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
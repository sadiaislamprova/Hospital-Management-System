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

public class Login_input {
    public static void main(String[] args) {
        // Define the file name and path
        String fileName = "login.txt";

        try {
            // Create a File object
            File file = new File(fileName);

            // Check if the file already exists
            if (!file.exists()) {
                file.createNewFile(); // Create the file if it doesn't exist
            }

            // Create a FileWriter and BufferedWriter for writing to the file
            // Use 'true' as the second argument to FileWriter to append to the file
            FileWriter fileWriter = new FileWriter(file, false); // 'false' overwrites the file
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Write content to the file in a parsable format
            bufferedWriter.write("admin,admin"); // Username and password in "username,password" format
            bufferedWriter.newLine(); // Add a new line for the next user

            // Close the writer
            bufferedWriter.close();

            System.out.println("File written successfully: " + file.getAbsolutePath());
        } catch (IOException e) {
            // Handle exceptions
            System.err.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
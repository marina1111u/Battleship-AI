package Cheese;
import java.io.*;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.*;
import java.io.File;
import javax.swing.*;
import javax.sound.sampled.*;

 /*
Created by: Daphne Cheng
Teacher: Mr.A
Date: June 1,2021
Description: This program will recommend a cheese for the user after a few questions
Note: Please read the 'Read Me' text file for full comments of the program
 */


    public class Cheese extends JFrame {
        public static void main(String[] args) throws Exception  {

            //GUI portion for fun
            String Num1, num2;
            int number1, number2, sum;

            Num1 = JOptionPane.showInputDialog("So, how many 'okay' cheeses do you want? ");
            number1 = Integer.parseInt(Num1);

            num2 = JOptionPane.showInputDialog("And how many 'good' cheeses do you want?");
            number2 = Integer.parseInt(num2);

            sum = number1 + number2;

            JOptionPane.showMessageDialog(null, "The number of cheeses you wanted was : " + sum + " . However I'll only recommend you one great cheese!", "Results", JOptionPane.PLAIN_MESSAGE );

            //This is where the program actually starts
            PrintWriter output = new PrintWriter(System.out);
            Scanner sc = new Scanner(System.in);
            System.out.println("Hi there! I'll help recommend a cheese for you to try. Though, you gotta answer some questions first. ");
            System.out.println("First things first. What's your name?: ");
            String Name = sc.next();

            // This portion plays the music during the program
            File audioFile = new File("C:\\Users\\daphn\\IdeaProjects\\Past\\src\\song.wav"); // Please modify the path so it locates where the 'song.wav' file is
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            AudioFormat format = audioStream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);
            Clip audioClip = (Clip) AudioSystem.getLine(info);
            audioClip.open(audioStream);
            audioClip.start();

            //This portion deals with the file management
            System.out.println("But do you have a file number? If yes, type 'yes' and press 'Enter'. If not type 'no', and press 'Enter'");
            String file_exist = sc.next();

            if (file_exist.equalsIgnoreCase("yes")) {
                System.out.println("Please enter your file number and press 'Enter' : ");
                String user_Input = sc.next();
                try {
                    File toChange = new File(user_Input + ".txt"); //toChange = original file name
                    if (toChange.exists() && toChange.isFile()) {
                        output = new PrintWriter(new FileWriter(user_Input + ".txt", true));
                    } else {
                        throw new Error();
                    }
                } catch (Exception Error) {
                    System.out.println("Oh no, that file number doesn't exist. But don't worry, we made a a file with the number.");
                    output = new PrintWriter(user_Input + ".txt");
                }
            } else {
                System.out.println("That's okay, we made a new file just for you!");
                int new_file = fileCreate();
                Integer num1 = new_file;
                System.out.println("Your new file number is: " + new_file);
                System.out.println("Remember that number, since you'll need it later.");
                output = new PrintWriter(new_file + ".txt");
            }

            //This portion asks the user questions and stores the answers in their file
            String[] answers_Given = new String[7];
                    File file = new java.io.File("Questions.txt");
            Scanner input = new Scanner(file);

            boolean flag;

            for (int i = 0; i < answers_Given.length; i++) {
                flag = true;
                String Question = input.nextLine();
                System.out.println(Question);
                do {
                    String num = sc.next();
                    if ((num.equals("0") || (num.equals("1")))) {
                        answers_Given[i] = num;
                        System.out.println("Cool.");
                        flag = false;
                    } else {
                        System.out.println("Try again.");
                    }
                } while (flag);

            }
            output.println(Arrays.toString(answers_Given));
            input.close();
            output.close();

            //This portion takes the answers from the user's file and matches it to a cheese
            System.out.println("Nice, if you could please enter your file number again: ");
            String user_Input = sc.next();
            File file1 = new java.io.File(user_Input + ".txt");
            Scanner fileInput = new Scanner(file1);
            String fileContents = fileInput.nextLine().replaceAll("[^0-9]", "");

            int decimal = Integer.parseInt(fileContents, 2);
            decimal = decimal % 38;

            System.out.println(decimal);

            File file2 = new java.io.File("Cheeses.txt");
            Scanner input_final = new Scanner(file2);

            BufferedReader abc = new BufferedReader(new FileReader("Cheeses.txt"));
            ArrayList<String> listOfLines = new ArrayList<>();

            String line = abc.readLine();
            while (line != null) {
                listOfLines.add(line);
                line = abc.readLine();
            }

            System.out.println("Hi " + Name + "! After a through look through our databases we find that best cheese for you to try is the " + listOfLines.get(decimal) + ".");
            System.out.println("Thank you! ");

            abc.close();
            audioClip.close();
            audioStream.close();
        }

        // This method generates the 4 or 3 digit unique file number for users who don't have a file number yet
        public static int fileCreate() {
            int[] ArrayList;

            int num = -1;
            ArrayList<Integer> arNumber = new ArrayList<Integer>();
            for (int x = 0; x < 10; x++) {
                arNumber.add(x);
            }
            Collections.shuffle(arNumber);

            String strNum = "";
            for (int i = 0; i < 4; i++)
                strNum = strNum + arNumber.get(new Random().nextInt(10));

            num = Integer.parseInt(strNum);

            return num;
        }


    }
}

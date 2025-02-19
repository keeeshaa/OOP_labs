package com.example.strings;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindText {

    private String fileName = "C:\\Users\\Admin\\oop_labs\\03-lab\\StringsPractice02\\gettys.html";
    // Create Pattern
    private static Pattern pattern1 = Pattern.compile("<h4>");
    private static Pattern pattern2 = Pattern.compile("\\bto\\b");
    private static Pattern pattern3 = Pattern.compile("^\\s{4}");
    private static Pattern pattern4 = Pattern.compile("^<[p|d]");
    private static Pattern pattern5 = Pattern.compile("^</.*?>$");
        // Create Matcher
        private Matcher m1, m2, m3, m4, m5;
        
        
    
        public static void main(String[] args) {
            FindText find = new FindText();
            find.run();
        }
    
        public void run() {
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String line = "";
                int c = 1;
                while ((line = reader.readLine()) != null) {
                    // Generate a matcher based on Pattern
                    m1 = pattern1.matcher(line);
                    m2 = pattern2.matcher(line);
                    m3 = pattern3.matcher(line);
                    m4 = pattern4.matcher(line);
                    m5 = pattern5.matcher(line);
                    // Search for text
                    if (m1.find() || m2.find() || m3.find() || m4.find() || m5.find()) {
                        System.out.println(" " + c + " "+ line);
                        }
                    c++;
                }
    
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    
        private static class pattern {
    
            public pattern() {
        }
    }
}

package com.hataysoftware;

import javax.management.ObjectName;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operation {

    public static void Write(String object_temp) {

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter("fileName.txt", true));
            writer.newLine();
            writer.append(object_temp);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static List<String> Read() {
        //  try {         Write();        } catch (IOException e) {            e.printStackTrace();        }
        String content = "";

        List<String> strings = new ArrayList();
        try {

            strings = Files.readAllLines(Paths.get("fileName.txt"), StandardCharsets.UTF_8);


        } catch (IOException e) {
            Write("");
           // e.printStackTrace();
        }
        System.out.println(content);
        return strings;

    }

    public static void Update(String object_temp)
    {
        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter("fileName.txt", false));
            writer.append(object_temp);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

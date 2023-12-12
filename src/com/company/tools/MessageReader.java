package com.company.tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class MessageReader {
    private String filename;
    private File myFile;
    private Scanner fileScanner;
    private  List<String> lineContainer = new ArrayList<String>();
    private Map<String, Integer> uniqueWords = new HashMap<>();



    public String getFilename() {
        return filename;
    }

    public void obtainFilename(String arguments[]) {
        if (arguments.length >= 1) {
            filename = "src/" + arguments[0]; // або інша відносна шлях
        } else {
            Scanner inputReader = new Scanner(System.in);
            System.out.println("Zadaj nazov suboru: ");
            filename = "src/" + inputReader.nextLine(); // або інша відносна шлях
        }
        System.out.println("Subor ktory budem spracovavat je: " + filename);
    }

    public void openAndRead()
    {
        try{
            myFile = new File(filename);
            fileScanner = new Scanner(myFile);

            while(fileScanner.hasNextLine()){
                lineContainer.add(fileScanner.nextLine());
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Nenasiel som subor.");
            e.printStackTrace();
        }
    }

    public void processMessage(){
        for (int i = 0; i < lineContainer.size(); i++){
            String temp = lineContainer.get(i);
            Integer count = uniqueWords.getOrDefault(temp,0);
            count += 1;
            uniqueWords.put(temp,count);
        }
        System.out.println("Zoznam tvorov>");
        uniqueWords.forEach((key,value) -> System.out.println(key + ":" + value));
    }
}

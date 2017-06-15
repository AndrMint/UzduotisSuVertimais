package sample;

import java.io.*;
import java.util.Map;

/**
 * Created by Svecias on 6/15/2017.
 */
public class ReadFile {
    private Map<String, String> engMap;
    private Map<String, String> ltMap;

    ReadFile(Map<String, String> engMap, Map<String, String>ltMap){
        this.engMap = engMap;
        this.ltMap = ltMap;
    }

    public void read(){
        try{
            BufferedReader bf = new BufferedReader(new FileReader(new File("Zodziai.txt")));
            String line = null;
            while ((line = bf.readLine())!=null){
                String[] elements = line.split("-");
                if(elements.length == 2){

                    engMap.put(elements[0], elements[1]);
                    ltMap.put(elements[1], elements[0]);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

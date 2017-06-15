package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;

public class Controller {



    @FXML
    private TextField inputENG;

    @FXML
    private TextField inputLT;




    private Map<String, String> engMap = new HashMap<>();
    private Map<String, String> ltMap = new HashMap<>();

    public void versti(ActionEvent event){
        if (engMap.isEmpty() || ltMap.isEmpty()){
            ReadFile readFile = new ReadFile(engMap, ltMap);
            readFile.read();
        }



String lt = engMap.get(inputENG.getText());
        String en = ltMap.get(inputLT.getText());
        if (lt != null){
            inputLT.setText(lt);
        }else {
            inputENG.setText(en);
        }



        //is mapo pasiimti key reiksme //susikurti du tipus

    }



}

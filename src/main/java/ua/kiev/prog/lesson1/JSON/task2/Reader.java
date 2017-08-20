package ua.kiev.prog.lesson1.JSON.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Вадим on 20.08.2017.
 */
public class Reader {

    public String reaFromFile(String path){
        String res = "";
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(path))){
                while (br.ready()){
                    res +=br.readLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return res;
    }
}

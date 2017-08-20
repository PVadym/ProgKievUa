package ua.kiev.prog.lesson1.JSON.task2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by Вадим on 20.08.2017.
 */
public class Solution {

    private static String path = "c:\\IdeaProjectProg\\JavaProCourse\\" +
            "src\\main\\java\\ua\\kiev\\prog\\lesson1\\JSON\\task2\\json.txt";

    public static void main(String[] args) {

        Reader reader = new Reader();
        String jsonString = reader.reaFromFile (path);

        Gson gson = new GsonBuilder().create();

        Person person = gson.fromJson(jsonString, Person.class);

        System.out.println(person);
    }

}

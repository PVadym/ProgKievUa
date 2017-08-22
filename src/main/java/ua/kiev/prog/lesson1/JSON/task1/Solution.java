package ua.kiev.prog.lesson1.JSON.task1;

/**
 * Created by Вадим on 20.08.2017.
 */
public class Solution {

    public static void main(String[] args) {

        Trains trains = new Trains();

        trains.getAllTrains().forEach(System.out::println);
        System.out.println("===========================================");

        Train train1 = new Train(3,"Paris","Kiev","15.02.2015","15:05");
        Train train2 = new Train(5,"Pryluky","Podolsk","19.02.2017","15:18");


        trains.addToTrains(train1);
        trains.addToTrains(train2);
        trains.getAllTrains().forEach(System.out::println);
        System.out.println("===========================================");

        trains.addToTrains(train2);
        trains.getAllTrains().forEach(System.out::println);
        System.out.println("===========================================");

        trains.removeFromTrains(train1);
        trains.getAllTrains().forEach(System.out::println);
        System.out.println("===========================================");

        trains.getTrainsByTime("15:20", "19:06").forEach(System.out::println);
    }


}

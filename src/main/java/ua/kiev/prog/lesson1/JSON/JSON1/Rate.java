package ua.kiev.prog.lesson1.JSON.JSON1;

import com.google.gson.annotations.SerializedName;

public class Rate {
    public String id;
    @SerializedName("Name")
    public String name;
    public double Rate;
    public String Date;
    public String Time;
    public String Ask;
    public String Bid;
}

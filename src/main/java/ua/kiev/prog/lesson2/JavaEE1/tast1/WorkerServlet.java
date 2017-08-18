package ua.kiev.prog.lesson2.JavaEE1.tast1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Вадим on 16.08.2017.
 */
@WebServlet(urlPatterns = "/statistic")
public class WorkerServlet extends HttpServlet {

    private volatile int visitsCounter;
    private volatile int happyCounter;
    private volatile int unhappyCounter;
    private volatile int javaCounter;
    private volatile int cCounter;

    public void init() {
        visitsCounter = 0;
        happyCounter = 0;
        unhappyCounter = 0;
        javaCounter = 0;
        cCounter = 0;
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        increaseAmountOfVisits();

        String firstName = request.getParameter("firstname");
        String lastName = request.getParameter("lastname");
        int age = Integer.parseInt(request.getParameter("age"));
        String happy = request.getParameter("happy");
        String lang = request.getParameter("lang");


        getStatistic(happy, lang);


        response.setContentType("text/html");

        String docType = "<!DOCTYPE html>";
        String title = "Statistic information";
        PrintWriter writer = response.getWriter();

        writer.println(docType + "<html>" +
                "<head>" +
                "<title>" + title +
                "</title>" +
                "</head>" +
                "<body>" +
                "<h1>Hi, " + firstName + " " + lastName +" !</h1>"+ "<br>"+
                "<h2> You have age: " + age +"</h2><br>" +
                "<Get statistics:><br>" +
                "Count of visitors:"+
                visitsCounter + "<br>" +
                "Happy visitors =  " + happyCounter + "<br>" +
                "Unhappy visitors =  " + unhappyCounter + "<br>" +
                "Knows java =  " + javaCounter + "<br>" +
                "Knows C++ =  " + cCounter + "<br>" +
                "</body>" +
                "</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    private synchronized void getStatistic(String happy, String lang) {
        if (happy.equalsIgnoreCase("yes")) {
            happyCounter++;
        } else {
            unhappyCounter++;
        }

        if (lang.equalsIgnoreCase("java")) {
            javaCounter++;
        } else {
            cCounter++;
        }
    }

    private synchronized void increaseAmountOfVisits() {
        visitsCounter++;
    }

}

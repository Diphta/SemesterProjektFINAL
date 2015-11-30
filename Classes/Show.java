/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author philip
 */
public class Show {

    private String name;
    private String time;
    private String date;
    private Hall hall;

    public Show(String name, String time, String date, Hall hall) {
        this.name = name;
        this.time = time;
        this.date = date;
        this.hall = hall;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getTime() {
        return time;
    }

    public void setTime(String[] time) {
        this.time = time;
    }

}

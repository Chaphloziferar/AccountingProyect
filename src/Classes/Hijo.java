package Classes;

import java.io.Serializable;

/**
 * @author Chaphloziferar
 **/

public class Hijo implements Serializable {

    private String Son_Name;
    private String Son_Born_Date;
    private int Son_Age;

    public Hijo() {
        this.Son_Name = "";
        this.Son_Born_Date = "";
        this.Son_Age = 0;
    }

    public Hijo(String Son_Name, String Son_Born_Date, int Son_Age) {
        this.Son_Name = Son_Name;
        this.Son_Born_Date = Son_Born_Date;
        this.Son_Age = Son_Age;
    }

    public String getSon_Name() {
        return Son_Name;
    }

    public void setSon_Name(String Son_Name) {
        this.Son_Name = Son_Name;
    }

    public String getSon_Born_Date() {
        return Son_Born_Date;
    }

    public void setSon_Born_Date(String Son_Born_Date) {
        this.Son_Born_Date = Son_Born_Date;
    }

    public int getSon_Age() {
        return Son_Age;
    }

    public void setSon_Age(int Son_Age) {
        this.Son_Age = Son_Age;
    }

    public String toString(){
        return "El Nombre es = "+Son_Name+"\nLa fecha de nacimiento es = "+Son_Born_Date+"\nLa edad es = "+Son_Age;
    }

}

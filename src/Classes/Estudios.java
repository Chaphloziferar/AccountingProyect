package Classes;

import java.io.Serializable;

/**
 * @author Chaphloziferar
 **/

public class Estudios implements Serializable {

    private String Study_Name;
    private String Study_Place;
    private String Study_Date;

    public Estudios() {
        this.Study_Name = "";
        this.Study_Place = "";
        this.Study_Date = "";
    }

    public Estudios(String Study_Name, String Study_Place, String Study_Date) {
        this.Study_Name = Study_Name;
        this.Study_Place = Study_Place;
        this.Study_Date = Study_Date;
    }

    public String getStudy_Name() {
        return Study_Name;
    }

    public void setStudy_Name(String Study_Name) {
        this.Study_Name = Study_Name;
    }

    public String getStudy_Place() {
        return Study_Place;
    }

    public void setStudy_Place(String Study_Place) {
        this.Study_Place = Study_Place;
    }

    public String getStudy_Date() {
        return Study_Date;
    }

    public void setStudy_Date(String Study_Date) {
        this.Study_Date = Study_Date;
    }

    public String toString(){
        return "Descripcion del estudio = "+Study_Name+"\nIntitucion de estudio = "+Study_Place+"\nLa fecha de obtencion = "+Study_Date;
    }

}

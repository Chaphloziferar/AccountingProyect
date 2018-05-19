package Classes;

import java.io.Serializable;
import java.util.LinkedList;

/**
 * @author Chaphloziferar
 *
 */
public class Empleado implements Serializable {

    private String Name;
    private String Born_year;
    private String Born_Country;
    private String DNI;
    private String Civil_State;
    private boolean Childrens;
    private LinkedList<Hijo> Son_Info;
    private String Home;
    private String Place;
    private int Phone;
    private String Career;
    private String Academic_Level;
    private LinkedList<Estudios> Studies_Info;
    private String ID;
    private String Job;
    private String Departament;
    private String Contracting;
    private double Salary;
    private String Start_Day;
    private int Workday;
    private double Deduction_Bank;
    private double Deduction_Hospital;
    private double Deduction_Syndicate;
    private double Deduction_debt;
    private double Deduction_retention;
    private int Antiguedad_Years;
    private double Antiguedad;
    private int Extra_Hours;
    private double Extra_Hours_Amount;
    private double Commisions;
    private double Total_Income;
    private double INSS;
    private double IR;
    private double Total_Deductions;
    private double Net_To_Receive;
    private double INSS_Patronal;
    private double Inatec;
    private double Vacations;
    private double Bonus;
    private double Compensation;
    private String ID_INSS;

    public Empleado(String Name, String Born_year, String Born_Country, String DNI, String Civil_State, boolean Childrens, LinkedList<Hijo> Son_Info, String Home,
            String Place, int Phone, String Career, String Academic_Level, LinkedList<Estudios> Studies_Info, String ID, String Job, String Departament,
            String Contracting, double Salary, String Start_Day, int Workday, double Deduction_Bank, double Deduction_Hospital, double Deduction_Syndicate,
            double Deduction_debt, double Deduction_retention, int Antiguedad_Years, double Antiguedad, int Extra_Hours, double Extra_Hours_Amount, double Commisions, double Total_Income, double INSS,
            double IR, double Total_Deductions, double Net_To_Receive, double INSS_Patronal, double Inatec, double Vacations, double Bonus, double Compensation, String ID_INSS) {

        this.Name = Name;
        this.Born_year = Born_year;
        this.Born_Country = Born_Country;
        this.DNI = DNI;
        this.Civil_State = Civil_State;
        this.Childrens = Childrens;
        this.Son_Info = Son_Info;
        this.Home = Home;
        this.Place = Place;
        this.Phone = Phone;
        this.Career = Career;
        this.Academic_Level = Academic_Level;
        this.Studies_Info = Studies_Info;
        this.ID = ID;
        this.Job = Job;
        this.Departament = Departament;
        this.Contracting = Contracting;
        this.Salary = Salary;
        this.Start_Day = Start_Day;
        this.Workday = Workday;
        this.Deduction_Bank = Deduction_Bank;
        this.Deduction_Hospital = Deduction_Hospital;
        this.Deduction_Syndicate = Deduction_Syndicate;
        this.Deduction_debt = Deduction_debt;
        this.Deduction_retention = Deduction_retention;
        this.Antiguedad_Years = Antiguedad_Years;
        this.Antiguedad = Antiguedad;
        this.Extra_Hours = Extra_Hours;
        this.Extra_Hours_Amount = Extra_Hours_Amount;
        this.Commisions = Commisions;
        this.Total_Income = Total_Income;
        this.INSS = INSS;
        this.IR = IR;
        this.Total_Deductions = Total_Deductions;
        this.Net_To_Receive = Net_To_Receive;
        this.INSS_Patronal = INSS_Patronal;
        this.Inatec = Inatec;
        this.Vacations = Vacations;
        this.Bonus = Bonus;
        this.Compensation = Compensation;
        this.ID_INSS = ID_INSS;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getBorn_year() {
        return Born_year;
    }

    public void setBorn_year(String Born_year) {
        this.Born_year = Born_year;
    }

    public String getBorn_Country() {
        return Born_Country;
    }

    public void setBorn_Country(String Born_Country) {
        this.Born_Country = Born_Country;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCivil_State() {
        return Civil_State;
    }

    public void setCivil_State(String Civil_State) {
        this.Civil_State = Civil_State;
    }

    public boolean getChildrens() {
        return Childrens;
    }

    public void setChildrens(boolean Childrens) {
        this.Childrens = Childrens;
    }

    public LinkedList<Hijo> getSon_Info() {
        return Son_Info;
    }

    public void setSon_Info(LinkedList<Hijo> Son_Info) {
        this.Son_Info = Son_Info;
    }

    public String getHome() {
        return Home;
    }

    public void setHome(String Home) {
        this.Home = Home;
    }

    public String getPlace() {
        return Place;
    }

    public void setPlace(String Place) {
        this.Place = Place;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

    public String getCareer() {
        return Career;
    }

    public void setCareer(String Career) {
        this.Career = Career;
    }

    public String getAcademic_Level() {
        return Academic_Level;
    }

    public void setAcademic_Level(String Academic_Level) {
        this.Academic_Level = Academic_Level;
    }

    public LinkedList<Estudios> getStudies_Info() {
        return Studies_Info;
    }

    public void setStudies_Info(LinkedList<Estudios> Studies_Info) {
        this.Studies_Info = Studies_Info;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String Job) {
        this.Job = Job;
    }

    public String getDepartament() {
        return Departament;
    }

    public void setDepartament(String Departament) {
        this.Departament = Departament;
    }

    public String getContracting() {
        return Contracting;
    }

    public void setContracting(String Contracting) {
        this.Contracting = Contracting;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public String getStart_Day() {
        return Start_Day;
    }

    public void setStart_Day(String Start_Day) {
        this.Start_Day = Start_Day;
    }

    public int getWorkday() {
        return Workday;
    }

    public void setWorkday(int Workday) {
        this.Workday = Workday;
    }

    public double getDeduction_Bank() {
        return Deduction_Bank;
    }

    public void setDeduction_Bank(double Deduction_Bank) {
        this.Deduction_Bank = Deduction_Bank;
    }

    public double getDeduction_Hospital() {
        return Deduction_Hospital;
    }

    public void setDeduction_Hospital(double Deduction_Hospital) {
        this.Deduction_Hospital = Deduction_Hospital;
    }

    public double getDeduction_Syndicate() {
        return Deduction_Syndicate;
    }

    public void setDeduction_Syndicate(double Deduction_Syndicate) {
        this.Deduction_Syndicate = Deduction_Syndicate;
    }

    public double getDeduction_debt() {
        return Deduction_debt;
    }

    public void setDeduction_debt(double Deduction_debt) {
        this.Deduction_debt = Deduction_debt;
    }

    public double getDeduction_retention() {
        return Deduction_retention;
    }

    public void setDeduction_retention(double Deduction_retention) {
        this.Deduction_retention = Deduction_retention;
    }

    public int getAntiguedad_Years() {
        return Antiguedad_Years;
    }

    public void setAntiguedad_Years(int Antiguedad_Years) {
        this.Antiguedad_Years = Antiguedad_Years;
    }

    public double getAntiguedad() {
        return Antiguedad;
    }

    public void setAntiguedad(double Antiguedad) {
        this.Antiguedad = Antiguedad;
    }

    public int getExtra_Hours() {
        return Extra_Hours;
    }

    public void setExtra_Hours(int Extra_Hours) {
        this.Extra_Hours = Extra_Hours;
    }

    public double getExtra_Hours_Amount() {
        return Extra_Hours_Amount;
    }

    public void setExtra_Hours_Amount(double Extra_Hours_Amount) {
        this.Extra_Hours_Amount = Extra_Hours_Amount;
    }

    public double getCommisions() {
        return Commisions;
    }

    public void setCommisions(double Commisions) {
        this.Commisions = Commisions;
    }

    public double getTotal_Income() {
        return Total_Income;
    }

    public void setTotal_Income(double Total_Income) {
        this.Total_Income = Total_Income;
    }

    public double getINSS() {
        return INSS;
    }

    public void setINSS(double INSS) {
        this.INSS = INSS;
    }

    public double getIR() {
        return IR;
    }

    public void setIR(double IR) {
        this.IR = IR;
    }

    public double getTotal_Deductions() {
        return Total_Deductions;
    }

    public void setTotal_Deductions(double Total_Deductions) {
        this.Total_Deductions = Total_Deductions;
    }

    public double getNet_To_Receive() {
        return Net_To_Receive;
    }

    public void setNet_To_Receive(double Net_To_Receive) {
        this.Net_To_Receive = Net_To_Receive;
    }

    public double getINSS_Patronal() {
        return INSS_Patronal;
    }

    public void setINSS_Patronal(double INSS_Patronal) {
        this.INSS_Patronal = INSS_Patronal;
    }

    public double getInatec() {
        return Inatec;
    }

    public void setInatec(double Inatec) {
        this.Inatec = Inatec;
    }

    public double getVacations() {
        return Vacations;
    }

    public void setVacations(double Vacations) {
        this.Vacations = Vacations;
    }

    public double getBonus() {
        return Bonus;
    }

    public void setBonus(double Bonus) {
        this.Bonus = Bonus;
    }

    public double getCompensation() {
        return Compensation;
    }

    public void setCompensation(double Compensation) {
        this.Compensation = Compensation;
    }

    public String getID_INSS() {
        return ID_INSS;
    }

    public void setID_INSS(String ID_INSS) {
        this.ID_INSS = ID_INSS;
    }

}

/*
ReportManager =>
    1- generates report data
    2- formats it into a specific output (CSV, JSON) 
    3- distributes it via email

class : 
1- ReportGenerator
2- ReportFormatter
3- ReportDistributor
*/
import java.util.*;
public class Main{
    public static void main(String[] args){
        ReportGenerator report = new ReportGenerator();
        ReportFormatter format = new ReportFormatter();
        ReportDistributor distributor = new ReportDistributor(); 

        List<String[]> data = report.generate(); 
        String csv = format.format(data); 
        distributor.distributor("hosamzakria@gmail.com", csv); 
    }   
}

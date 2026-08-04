import java.util.List;

public class ReportFormatter{

    public String format(List<String[]> data){
        StringBuilder csv = new StringBuilder();  
        for(int i = 0; i < data.size() ;i++){
            csv.append(String.join(",", data.get(i))).append("\n"); 
        }
        csv.append("\n"); 
        return csv.toString();     
    }
}

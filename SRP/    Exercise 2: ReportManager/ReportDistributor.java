public class ReportDistributor {
    public void distributor(String mail, String csv){
        System.out.println("Sending report to: " + mail);
        System.out.println(csv.toString());
        System.out.println("Report sent successfully.");
    }
}

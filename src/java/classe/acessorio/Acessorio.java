package classe.acessorio;
import java.time.LocalDate;
import java.time.LocalTime;

public class Acessorio {
    
    public static double convertendoParaDolar(double a){
        return ((a / 537) * 100);
    }  
      
    public static String dataHourAuthor(){
        
        String msg = "";
        
        msg += "<p>" + LocalDate.now().getDayOfMonth() + " de " + LocalDate.now().getMonth() + " de " + LocalDate.now().getYear() + "</p>";
        msg += "<p>" + LocalTime.now().getHour() + " h " + LocalTime.now().getMinute() + " min.</p>";
         
        return msg;
    }
}

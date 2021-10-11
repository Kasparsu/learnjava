import java.util.Calendar;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        IdCode myIdCode = new IdCode("39303217010");
        System.out.println(myIdCode.getGender()); // "MALE" ("FEMALE") (switch case)
        // System.out.println(myIdCode.getYear()); // 93
        // System.out.println(myIdCode.getCentury()); // 1900 (switch case)
        // System.out.println(myIdCode.getFullYear()); // 1993
        // System.out.println(myIdCode.getMonth()); // 03 kui oskate siis (March)
        // System.out.println(myIdCode.getDay()); // 21
        // System.out.println(myIdCode.getOrderNumber()); // 701
        // System.out.println(myIdCode.getCheckSum()); // 0
        // System.out.println(myIdCode.isValid()); // true v false        
        //LocalDate date = LocalDate.of(1993, 03, 33);
        
    }
}

class IdCode {
    String code;

    public IdCode(String code) {
        this.code = code;
    }

    public String getGender() {
        return "MALE";
    }
}
package Common.utilities;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DateUtils {


    public static String getCurrentDate(){
        Date date = new Date();
        return date.toString();
    }

    public static String getCurrentDateTime() {
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return formatter.format(now);
    }
    public static String getCurrentDateTimeCustom(String separator_Character) {
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String timeStamp = formatter.format(now).replace("/", separator_Character);
        return timeStamp.replace(" ", separator_Character).replace(":", separator_Character);
    }

    public static String getCurrentDateTimeJP() {
        ZoneId tokyoZoneId = ZoneId.of("Asia/Tokyo");
        LocalDateTime myDateObj = LocalDateTime.now(tokyoZoneId);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy年M月dd日 (E) HH:mm");
        return myDateObj.format(myFormatObj.withLocale(Locale.JAPANESE));
    }

    public static String getCurrentDateTimeVN_TypeVN() {
        ZoneId tokyoZoneId = ZoneId.of("Asia/Ho_Chi_Minh");
        Locale vietnam = new Locale("vi", "VN");
        LocalDateTime myDateObj = LocalDateTime.now(tokyoZoneId);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("(E) dd/MM/YYYY HH:mm");
        return myDateObj.format(myFormatObj.withLocale(vietnam));
    }
}

package test3;

import java.time.ZoneId;
import java.util.Set;

public class zoneid {
    public static void main(String[] args) {
        Set<String> zoneIds= ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds.size());
        System.out.println(zoneIds);

        ZoneId zoneId1=ZoneId.systemDefault();
        System.out.println(zoneId1);

        ZoneId zoneId2 = ZoneId.of("America/El_Salvador");
        System.out.println(zoneId2);
    }
}

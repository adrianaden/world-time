package org.adendrata.common.worldtime;

import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        long currentMillis = System.currentTimeMillis();

        ZonedDateTime worldTimeUTC = WorldTime.of(currentMillis).toUTC();
        ZonedDateTime worldTimeGMT5 = WorldTime.of(currentMillis).toGMT(5);

        System.out.println(worldTimeUTC);
        System.out.println(worldTimeGMT5);
    }
}

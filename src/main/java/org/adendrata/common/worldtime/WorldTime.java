package org.adendrata.common.worldtime;

import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Date;

public class WorldTime {

    private WorldTime(){
        throw new IllegalStateException("Illegal State Exception");
    }

    public static WorldTimeConverter of(Long epochMilli) {
        Instant instant = Instant.ofEpochMilli(epochMilli);
        return new WorldTimeConverter(instant);
    }

    public static WorldTimeConverter of(Date date) {
        Instant instant = Instant.ofEpochMilli(date.getTime());
        return new WorldTimeConverter(instant);
    }
    public static WorldTimeConverter of(ZonedDateTime zonedDateTime) {
        Instant instant = zonedDateTime.toInstant();
        return new WorldTimeConverter(instant);
    }

}

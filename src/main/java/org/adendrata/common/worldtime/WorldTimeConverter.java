package org.adendrata.common.worldtime;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class WorldTimeConverter {

    private Instant instant;

    WorldTimeConverter(Instant instant) {
        this.instant = instant;
    }

    private ZonedDateTime covert() {
        return covert(ZoneId.systemDefault());
    }

    private ZonedDateTime covert(ZoneId zoneId) {
        return instant.atZone(zoneId);
    }

    public ZonedDateTime toDefault() {
        return covert();
    }

    public ZonedDateTime toUTC() {
        return  covert(ZoneId.of(WorldTimeZone.ETC_UTC.getName()));
    }

    public ZonedDateTime toGMT() {
        return  covert(ZoneId.of(WorldTimeZone.ETC_GMT.getName()));
    }

    public ZonedDateTime toGMT(long offset) {
        WorldTimeZone worldTimeZone = WorldTimeZone.findTimeZone("Etc/GMT", offset);
        return  covert(ZoneId.of(worldTimeZone.getName()));
    }



}

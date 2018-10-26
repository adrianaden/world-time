package org.adendrata.common.worldtime;

public enum WorldTimeZone {
    ETC_UTC("Etc/UTC"),
    ETC_GMT("Etc/GMT"),
    ETC_GMT0("Etc/GMT+0"),
    ETC_GMT1("Etc/GMT+1"),
    ETC_GMT2("Etc/GMT+2"),
    ETC_GMT3("Etc/GMT+3"),
    ETC_GMT4("Etc/GMT+4"),
    ETC_GMT5("Etc/GMT+5"),
    ETC_GMT6("Etc/GMT+6"),
    ETC_GMT7("Etc/GMT+7"),
    ETC_GMT8("Etc/GMT+8"),
    ETC_GMT9("Etc/GMT+9"),
    ETC_GMT10("Etc/GMT+10"),
    ETC_GMT11("Etc/GMT+11"),
    ETC_GMT12("Etc/GMT+12"),

    ETC_GMT1_MINUS("Etc/GMT-1"),
    ETC_GMT2_MINUS("Etc/GMT-2"),
    ETC_GMT3_MINUS("Etc/GMT-3"),
    ETC_GMT4_MINUS("Etc/GMT-4"),
    ETC_GMT5_MINUS("Etc/GMT-5"),
    ETC_GMT6_MINUS("Etc/GMT-6"),
    ETC_GMT7_MINUS("Etc/GMT-7"),
    ETC_GMT8_MINUS("Etc/GMT-8"),
    ETC_GMT9_MINUS("Etc/GMT-9"),
    ETC_GMT10_MINUS("Etc/GMT-10"),
    ETC_GMT11_MINUS("Etc/GMT-11"),
    ETC_GMT12_MINUS("Etc/GMT-12"),
    ETC_GMT13_MINUS("Etc/GMT-13"),
    ETC_GMT14_MINUS("Etc/GMT-14");

    private String name;

    WorldTimeZone(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static WorldTimeZone findTimeZone(String prefix, long offset) {
        boolean isPositiveNumber = offset >= 0;
        String name = prefix + (isPositiveNumber ? "+" : "") + String.valueOf(offset);
        for (WorldTimeZone worldTimeZone : WorldTimeZone.values()) {
            if (worldTimeZone.name.equals(name)) {
                return worldTimeZone;
            }
        }
        throw new IllegalArgumentException("Unknown Time Zone: " + name );
    }


}

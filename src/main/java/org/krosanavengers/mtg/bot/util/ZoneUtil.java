package org.krosanavengers.mtg.bot.util;

import org.krosanavengers.mtg.bot.zones.Zone;

public class ZoneUtil {

    public static boolean isEmptyOrNull(Zone zone) {
        return zone == null || zone.getCards() == null || zone.getCards().isEmpty();
    }
}

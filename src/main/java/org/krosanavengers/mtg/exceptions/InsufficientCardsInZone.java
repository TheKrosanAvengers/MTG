package org.krosanavengers.mtg.exceptions;

import org.krosanavengers.mtg.bot.zones.ZoneEnum;

public class InsufficientCardsInZone extends Exception {
    ZoneEnum zoneEnum;

    public InsufficientCardsInZone(ZoneEnum zoneEnum) {
        super();
        this.zoneEnum = zoneEnum;
    }
}

package com.main;

import java.util.ArrayList;
import java.util.List;

public enum Abilities {
    DEATHTOUCH_1("Deathtouch", "(Any amount of damage this deals to a creature is enough to destroy it.)"),
    DEATHTOUCH_2("Deathtouch", "(Any amount of damage they deal to a creature is enough to destroy it.)"),
    DEFENDER("Defender", "(This creature can't attack.)"),
    DOUBLE_STRIKE_1("Double Strike", "(This creature deals both first-strike and regular combat damage.)"),
    DOUBLE_STRIKE_2("Double Strike", "(It deals both first-strike and regular combat damage.)"),
    FIRST_STRIKE_1("First Strike", "(This creature deals combat damage before creatures without first strike.)"),
    FIRST_STRIKE_2("First Strike", "(It deals combat damage before creatures without first strike.)"),
    FLASH_1("Flash", "(You may cast this spell any time you could cast an instant.)"),
    FLASH_2("Flash", "(You may cast this card any time you could cast an instant.)"),
    FLYING("Flying", "(This creature can't be blocked except by creatures with flying or reach.)"),
    HASTE_1("Haste", "(This creature can attack and tap as soon as it comes under your control.)"),
    HASTE_2("Haste", "(It can attack and {T} this turn.)"),
    HASTE_3("Haste", "(This creature can attack and {T} as soon as it comes under your control.)"),
    HASTE_4("Haste", "(They can attack and {T} this turn.)"),
    ADAPT_1("Adapt", "(If this creature has no +1/+1 counters on it, put %s +1/+1 counter on it.)"),
    ADAPT_2("Adapt", "(If this creature has no +1/+1 counters on it, put %s +1/+1 counters on it.)"),
    HEXPROOF_1("Hexproof", "(This creature can't be the target of spells or abilities your opponents control.)"),
    HEXPROOF_2("Hexproof", "(It can't be the target of spells or abilities your opponents control.)"),
    HEXPROOF_BLUE_BLACK("HEXPROOF_BLUE_BLACK", "(You and they can't be the targets of blue or black spells or abilities your opponents control.)"),
    INDESTRUCTIBLE_1("Indestructible", "(Damage and effects that say \"destroy\" don't destroy this creature.)"),
    INDESTRUCTIBLE_2("Indestructible", "(Damage and effects that say \"destroy\" don't destroy it.)"),
    INDESTRUCTIBLE_3("Indestructible", "(Damage and effects that say \"destroy\" don't destroy them.)"),
    INDESTRUCTIBLE_4("Indestructible", "(Any amount of damage it deals to a creature is enough to destroy it.)"),
    LIFELINK_1("Lifelink", "(Damage dealt by this creature also causes you to gain that much life.)"),
    LIFELINK_2("Lifelink", "(Damage dealt by the creature also causes its controller to gain that much life.)"),
    MENACE_1("Menace", "(This creature can't be blocked except by two or more creatures.)"),
    MENACE_2("Menace", "(It can't blocked except by two or more creatures.)"),
    MENACE_3("Menace", "(It can't be blocked except by two or more creatures.)"),
    MENACE_4("Menace", "(A creature with menace can't be blocked except by two or more creatures.)"),
    MENACE_5("Menace", "(They can't be blocked except by two or more creatures.)"),
    PROWESS("Prowess", "(Whenever you cast a noncreature spell, this creature gets +1/+1 until end of turn.)"),
    AMASS_1("Amass", "(Put %s +1/+1 counters on an Army you control. If you don't control one, create a 0/0 black Zombie Army creature token first.)"),
    AMASS_2("Amass", "(Put %s +1/+1 counter on an Army you control. If you don't control one, create a 0/0 black Zombie Army creature token first.)"),
    AMASS_3("Amass", "(To amass 2, put two +1/+1 counters on an Army you control. If you don't control one, create a 0/0 black Zombie Army creature token first.)"),
    SURVEIL_1("Surveil", "(Look at the top card of your library. You may put that card into your graveyard.)"),
    SURVEIL_2("Surveil", "(Look at the top %s cards of your library, then put any number of them into your graveyard and the rest on the top of your library in any order.)"),
    SURVEIL_3("Surveil", "(Look at the top two cards of your library, then put any number of them into your graveyard and the rest on top of your library in any order.)"),
    SURVEIL_4("Surveil", "(To surveil 2, look at the top two cards of your library, then put any number of them into your graveyard and the rest on top of your library in any order.)"),
    SURVEIL_5("Surveil", "(To surveil 4, look at the top four cards of your library, then put any number of them into your graveyard and the rest on top of your library in any order.)"),
    SURVEIL_6("Surveil", "(Look at the top card of your library. You may put it into your graveyard.)"),
    AFTERLIFE_1("Afterlife", "(When this creature dies, create %s 1/1 white and black Spirit creature tokens with flying.)"),
    AFTERLIFE_2("Afterlife", "(When this creature dies, create %s 1/1 white and black Spirit creature token with flying.)"),
    REACH("Reach", "(This creature can block creatures with flying.)"),
    JUMPSTART("Jump-Start", "(You may cast this card from your graveyard by discarding a card in addition to paying its other costs. Then exile this card.)"),
    SPECTACLE("Spectacle", "(You may cast this spell for its spectacle cost rather than its mana cost if an opponent lost life this turn.)"),
    TRAMPLE_1("Trample", "(This creature can deal excess combat damage to defending player while attacking.)"),
    TRAMPLE_2("Trample", "(This creature can deal excess combat damage to the player or planeswalker it's attacking.)"),
    TRAMPLE_3("Trample", "(It can deal excess damage to the player or planeswalker it's attacking.)"),
    TRAMPLE_4("Trample", "(They can deal excess combat damage to the player or planeswalker they're attacking.)"),
    SCRY_1("Scry", "(Look at the top card of your library. You may put that card on the bottom of your library.)"),
    SCRY_2("Scry", "(Look at the top %s cards of your library. You may put that card on the bottom of your library.)"),
    SCRY_3("Scry", "(Look at the top %s cards of your library, then put any number of them on the bottom of your library and the rest on top in any order.)"),
    EQUIP("Equip", "({%s}: Attach to target creature you control. Equip only as a sorcery.)"),
    KNIGHTEQUIP("KNIGHTEQUIP", "({%s}: Attach to target Knight creature you control. Equip only as a sorcery.)"),
    VIGILANCE_1("Vigilance", "(Attacking doesn't cause this creature to tap.)"),
    VIGILANCE_2("Vigilance", "(Attacking doesn't cause it to tap.)"),
    ISLANDWALK("Islandwalk", "(It can't be blocked as long as defending player controls a Island.)"),
    FORESTWALK("Forestwalk", "(It can't be blocked as long as defending player controls a Forest.)"),
    MOUNTAINWALK("Mountainwalk", "(It can't be blocked as long as defending player controls a Mountain.)"),
    PLAINSWALK("Plainswalk", "(It can't be blocked as long as defending player controls a Plains.)"),
    SWAMPWALK("SWAMPWALK", "(It can't be blocked as long as defending player controls a Swamp.)"),
    SNOW("Snow", "({S} can be paid with %s mana from a snow permanent.)"),
    MORPH("Morph", "(You may cast this card face down as a 2/2 creature for {3}. Turn it face up any time for its morph cost.)"),
    MEGAMORPH("Megamorph", "(You may cast this card face down as a 2/2 creature for {3}. Turn it face up any time for its megamorph cost and put a +1/+1 counter on it.)"),
    INGEST("Ingest", "(Whenever this creature deals combat damage to a player, that player exiles the top card of their library.)"),
    RIOT_1("Riot", "(This creature enters the battlefield with your choice of a +1/+1 counter or haste.)"),
    RIOT_2("Riot", "(It enters the battlefield with your choice of a +1/+1 counter or haste.)"),
    RIOT_3("Riot", "(They enter the battlefield with your choice of a +1/+1 counter or haste.)"),
    PROTECTION_COLOR("Protection", "(It can't be blocked, targeted, dealt damage, enchanted, or equipped by anything of that color.)"),
    PROTECTION_MONOCOLOR("Protection", "(This creature can't be the target of monocolored spells or abilities your opponents control.)"),
    PROTECTION_BLACK("Protection from Black", "(This creature can't be blocked, targeted, dealt damage, enchanted, or equipped by anything black.)"),
    PROTECTION_WHITE("Protection from White", "(This creature can't be blocked, targeted, dealt damage, enchanted, or equipped by anything white.)"),
    PROTECTION_BLUE("Protection from Blue", "(This creature can't be blocked, targeted, dealt damage, enchanted, or equipped by anything blue.)"),
    PROTECTION_RED("Protection from Red", "(This creature can't be blocked, targeted, dealt damage, enchanted, or equipped by anything red.)"),
    PROTECTION_GREEN("Protection from Green", "(This creature can't be blocked, targeted, dealt damage, enchanted, or equipped by anything green.)"),
    CONVOKE_1("Convoke", "(Your creatures can help cast this spell. Each creature you tap while casting this spell pays for {1} or %s mana of the creature's color.)"),
    CONVOKE_2("Convoke", "(Your creatures can help cast this spell. Each creature you tap while casting this spell pays for {1} or %s mana of that creature's color.)"),
    MENTOR("Mentor", "(Whenever this creature attacks, put a +1/+1 counter on target attacking creature with lesser power.)"),
    PROLIFERATE_1("Proliferate", "(Choose any number of permanents and/or players, then give each another counter of each kind already there.)"),
    PROLIFERATE_2("Proliferate", "(Choose any number of permanents and/or players, then give each another counter of each kind already there. Then do it again.)"),
    FOOD_1("Food", "(It's an artifact with \"{2}, {T}, Sacrifice this artifact: You gain 3 life.\")"),
    FOOD_2("Food", "(They're artifacts with \"{2}, {T}, Sacrifice this artifact: You gain 3 life.\")"),
    FOOD_3("Food", "(Food tokens are artifacts with \"{2}, {T}, Sacrifice this artifact: You gain 3 life.\")"),
    FOOD_4("Food", "(A Food token is an artifact with \"{2}, {T}, Sacrifice this artifact: You gain 3 life.\")"),
    FIGHT("Fight", "(Each deals damage equal to its power to the other.)"),
    ADVENTURE("Adventure", "(Then exile this card. You may cast the creature later from exile.)"),
    CREW("Crew", "(Tap any number of creatures you control with total power %s or more: This Vehicle becomes an artifact creature until end of turn.)"),
    HEXPROOF_INDESTRUCTIBLE("HexProofIndestructible", "(They can't be the targets of spells or abilities your opponents control. Damage and effects that say \"destroy\" don't destroy them.)"),
    TREASURE_1("Treasure", "(They're artifacts with \"{T}, Sacrifice this artifact: Add one mana of any color.\")"),
    TREASURE_2("Treasure", "(It's an artifact with \"{T}, Sacrifice this artifact: Add one mana of any color.\")"),
    AFFINITY("Affinity", "(They cost {1} less to cast for each artifact you control.)"),
    EXILEADVENTURE_FOOD("EXILEADVENTURE_FOOD", "(Then exile this card. You may cast the creature later from exile. A Food token is an artifact with \"{2}, {T}, Sacrifice this artifact: You gain 3 life.\")"),

    //Special Weird Things
    MANA_SYMBOLS_UNCHANGED("Mana Symbols Unchanged", "(Mana symbols on that permanent remain unchanged.)"),
    DOESNT_NEED_ADVENTURE("DOESNTADVENTURE", "(It doesn't need to have gone on the adventure first.)"),
    EXILE_ADVENTURE("EXILEADVENTURE", "(Then exile this spell. You may cast the creature later from exile.)"),
    UNTAP("Untap", "({Q} is the untap symbol.)"),
    CAST_GRAVEYARD("CastGraveyard", "(You still pay its costs. Timing rules still apply.)"),
    LOSES_ALL_TYPES("ELK'D", "(It loses all other card types and creature types.)"),
    DAMGE_LOSS_LIFE("DMG", "(Damage causes loss of life.)"),
    PLAYER_HEXPROOF_1("PLRHEX", "(You and they can't be the targets of spells or abilities your opponents control.)"),
    PLAYER_HEXPROOF_2("PLRHEX", "(You can't be the target of spells or abilities your opponents control.)"),
    TARGET_MANA_ABILITIES("TARGET_MANA_ABILITIES", "(Mana abilities can't be targeted.)"),
    IF_STILL_BATTLEFIELD("IF_STILL_BATTLEFIELD", "(if it's still on the battlefield)"),
    HE_CANT_ATTACK("HE_CANT_ATTACK", "(He can't attack if he was cast this turn.)"),
    LAND_CREATURE("LAND_CREATURE", "(This effect lasts as long as that land remains on the battlefield.)"),
    MANACOSTS("MANACOSTS", "(For example, {2}{B} and {1}{B}{B} are different mana costs.)");

    String name;
    String reminder;
    private static String[] parts = new String[]{"X", "a", "an", "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};

    Abilities(String name, String reminder) {
        this.name = name;
        this.reminder = reminder;
    }

    public static String removeReminders(String text) {
        String result = text;
        for (Abilities value : values()) {
            for (String number : parts) {
                result = result.replace("{number}", "").replace(String.format(value.reminder, number), "");
            }
        }
        return result;
    }

    public static String[] parseStaticAbilities(String text) {
        int i = text.indexOf(",");

        if (i > 0) {
            String[] split = text.split(",");
            List<String> list = new ArrayList<>();
            boolean first = true;
            for (String part : split) {
                for (Abilities value : values()) {
                    if (part.trim().equalsIgnoreCase(value.name)) {
                        if (first) {
                            first = false;
                        }
                        list.add(part.trim());
                        break;
                    }
                }
                if (first) {
                    return new String[]{text.trim()};
                }
            }
            return list.toArray(new String[0]);
        } else {
            return new String[]{text.trim()};
        }
    }

    public static String intToNumberWord(int num) {
        String[] numbers = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve"};
        return numbers[num];
    }
}

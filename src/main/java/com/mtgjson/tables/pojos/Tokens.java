/*
 * This file is generated by jOOQ.
 */
package com.mtgjson.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tokens implements Serializable {

    private static final long serialVersionUID = 980873712;

    private Integer id;
    private String  artist;
    private String  bordercolor;
    private String  coloridentity;
    private String  colorindicator;
    private String  colors;
    private String  dueldeck;
    private Integer isonlineonly;
    private String  layout;
    private String  loyalty;
    private String  name;
    private String  names;
    private String  number;
    private String  power;
    private String  reverserelated;
    private String  scryfallid;
    private String  scryfallillustrationid;
    private String  scryfalloracleid;
    private String  setcode;
    private String  side;
    private String  subtypes;
    private String  supertypes;
    private String  text;
    private String  toughness;
    private String  type;
    private String  types;
    private String  uuid;
    private String  watermark;

    public Tokens() {}

    public Tokens(Tokens value) {
        this.id = value.id;
        this.artist = value.artist;
        this.bordercolor = value.bordercolor;
        this.coloridentity = value.coloridentity;
        this.colorindicator = value.colorindicator;
        this.colors = value.colors;
        this.dueldeck = value.dueldeck;
        this.isonlineonly = value.isonlineonly;
        this.layout = value.layout;
        this.loyalty = value.loyalty;
        this.name = value.name;
        this.names = value.names;
        this.number = value.number;
        this.power = value.power;
        this.reverserelated = value.reverserelated;
        this.scryfallid = value.scryfallid;
        this.scryfallillustrationid = value.scryfallillustrationid;
        this.scryfalloracleid = value.scryfalloracleid;
        this.setcode = value.setcode;
        this.side = value.side;
        this.subtypes = value.subtypes;
        this.supertypes = value.supertypes;
        this.text = value.text;
        this.toughness = value.toughness;
        this.type = value.type;
        this.types = value.types;
        this.uuid = value.uuid;
        this.watermark = value.watermark;
    }

    public Tokens(
        Integer id,
        String  artist,
        String  bordercolor,
        String  coloridentity,
        String  colorindicator,
        String  colors,
        String  dueldeck,
        Integer isonlineonly,
        String  layout,
        String  loyalty,
        String  name,
        String  names,
        String  number,
        String  power,
        String  reverserelated,
        String  scryfallid,
        String  scryfallillustrationid,
        String  scryfalloracleid,
        String  setcode,
        String  side,
        String  subtypes,
        String  supertypes,
        String  text,
        String  toughness,
        String  type,
        String  types,
        String  uuid,
        String  watermark
    ) {
        this.id = id;
        this.artist = artist;
        this.bordercolor = bordercolor;
        this.coloridentity = coloridentity;
        this.colorindicator = colorindicator;
        this.colors = colors;
        this.dueldeck = dueldeck;
        this.isonlineonly = isonlineonly;
        this.layout = layout;
        this.loyalty = loyalty;
        this.name = name;
        this.names = names;
        this.number = number;
        this.power = power;
        this.reverserelated = reverserelated;
        this.scryfallid = scryfallid;
        this.scryfallillustrationid = scryfallillustrationid;
        this.scryfalloracleid = scryfalloracleid;
        this.setcode = setcode;
        this.side = side;
        this.subtypes = subtypes;
        this.supertypes = supertypes;
        this.text = text;
        this.toughness = toughness;
        this.type = type;
        this.types = types;
        this.uuid = uuid;
        this.watermark = watermark;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getBordercolor() {
        return this.bordercolor;
    }

    public void setBordercolor(String bordercolor) {
        this.bordercolor = bordercolor;
    }

    public String getColoridentity() {
        return this.coloridentity;
    }

    public void setColoridentity(String coloridentity) {
        this.coloridentity = coloridentity;
    }

    public String getColorindicator() {
        return this.colorindicator;
    }

    public void setColorindicator(String colorindicator) {
        this.colorindicator = colorindicator;
    }

    public String getColors() {
        return this.colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public String getDueldeck() {
        return this.dueldeck;
    }

    public void setDueldeck(String dueldeck) {
        this.dueldeck = dueldeck;
    }

    public Integer getIsonlineonly() {
        return this.isonlineonly;
    }

    public void setIsonlineonly(Integer isonlineonly) {
        this.isonlineonly = isonlineonly;
    }

    public String getLayout() {
        return this.layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getLoyalty() {
        return this.loyalty;
    }

    public void setLoyalty(String loyalty) {
        this.loyalty = loyalty;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNames() {
        return this.names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPower() {
        return this.power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getReverserelated() {
        return this.reverserelated;
    }

    public void setReverserelated(String reverserelated) {
        this.reverserelated = reverserelated;
    }

    public String getScryfallid() {
        return this.scryfallid;
    }

    public void setScryfallid(String scryfallid) {
        this.scryfallid = scryfallid;
    }

    public String getScryfallillustrationid() {
        return this.scryfallillustrationid;
    }

    public void setScryfallillustrationid(String scryfallillustrationid) {
        this.scryfallillustrationid = scryfallillustrationid;
    }

    public String getScryfalloracleid() {
        return this.scryfalloracleid;
    }

    public void setScryfalloracleid(String scryfalloracleid) {
        this.scryfalloracleid = scryfalloracleid;
    }

    public String getSetcode() {
        return this.setcode;
    }

    public void setSetcode(String setcode) {
        this.setcode = setcode;
    }

    public String getSide() {
        return this.side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getSubtypes() {
        return this.subtypes;
    }

    public void setSubtypes(String subtypes) {
        this.subtypes = subtypes;
    }

    public String getSupertypes() {
        return this.supertypes;
    }

    public void setSupertypes(String supertypes) {
        this.supertypes = supertypes;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getToughness() {
        return this.toughness;
    }

    public void setToughness(String toughness) {
        this.toughness = toughness;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypes() {
        return this.types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getWatermark() {
        return this.watermark;
    }

    public void setWatermark(String watermark) {
        this.watermark = watermark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Tokens (");

        sb.append(id);
        sb.append(", ").append(artist);
        sb.append(", ").append(bordercolor);
        sb.append(", ").append(coloridentity);
        sb.append(", ").append(colorindicator);
        sb.append(", ").append(colors);
        sb.append(", ").append(dueldeck);
        sb.append(", ").append(isonlineonly);
        sb.append(", ").append(layout);
        sb.append(", ").append(loyalty);
        sb.append(", ").append(name);
        sb.append(", ").append(names);
        sb.append(", ").append(number);
        sb.append(", ").append(power);
        sb.append(", ").append(reverserelated);
        sb.append(", ").append(scryfallid);
        sb.append(", ").append(scryfallillustrationid);
        sb.append(", ").append(scryfalloracleid);
        sb.append(", ").append(setcode);
        sb.append(", ").append(side);
        sb.append(", ").append(subtypes);
        sb.append(", ").append(supertypes);
        sb.append(", ").append(text);
        sb.append(", ").append(toughness);
        sb.append(", ").append(type);
        sb.append(", ").append(types);
        sb.append(", ").append(uuid);
        sb.append(", ").append(watermark);

        sb.append(")");
        return sb.toString();
    }
}
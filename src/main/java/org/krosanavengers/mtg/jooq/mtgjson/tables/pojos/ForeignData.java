/*
 * This file is generated by jOOQ.
 */
package org.krosanavengers.mtg.jooq.mtgjson.tables.pojos;


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
public class ForeignData implements Serializable {

    private static final long serialVersionUID = -1568538282;

    private Integer id;
    private String  flavortext;
    private String  language;
    private Integer multiverseid;
    private String  name;
    private String  text;
    private String  type;
    private String  uuid;

    public ForeignData() {}

    public ForeignData(ForeignData value) {
        this.id = value.id;
        this.flavortext = value.flavortext;
        this.language = value.language;
        this.multiverseid = value.multiverseid;
        this.name = value.name;
        this.text = value.text;
        this.type = value.type;
        this.uuid = value.uuid;
    }

    public ForeignData(
        Integer id,
        String  flavortext,
        String  language,
        Integer multiverseid,
        String  name,
        String  text,
        String  type,
        String  uuid
    ) {
        this.id = id;
        this.flavortext = flavortext;
        this.language = language;
        this.multiverseid = multiverseid;
        this.name = name;
        this.text = text;
        this.type = type;
        this.uuid = uuid;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFlavortext() {
        return this.flavortext;
    }

    public void setFlavortext(String flavortext) {
        this.flavortext = flavortext;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getMultiverseid() {
        return this.multiverseid;
    }

    public void setMultiverseid(Integer multiverseid) {
        this.multiverseid = multiverseid;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ForeignData (");

        sb.append(id);
        sb.append(", ").append(flavortext);
        sb.append(", ").append(language);
        sb.append(", ").append(multiverseid);
        sb.append(", ").append(name);
        sb.append(", ").append(text);
        sb.append(", ").append(type);
        sb.append(", ").append(uuid);

        sb.append(")");
        return sb.toString();
    }
}
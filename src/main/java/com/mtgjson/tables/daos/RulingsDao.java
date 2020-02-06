/*
 * This file is generated by jOOQ.
 */
package com.mtgjson.tables.daos;


import com.mtgjson.tables.Rulings;
import com.mtgjson.tables.records.RulingsRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class RulingsDao extends DAOImpl<RulingsRecord, com.mtgjson.tables.pojos.Rulings, Integer> {

    /**
     * Create a new RulingsDao without any configuration
     */
    public RulingsDao() {
        super(Rulings.RULINGS, com.mtgjson.tables.pojos.Rulings.class);
    }

    /**
     * Create a new RulingsDao with an attached configuration
     */
    public RulingsDao(Configuration configuration) {
        super(Rulings.RULINGS, com.mtgjson.tables.pojos.Rulings.class, configuration);
    }

    @Override
    public Integer getId(com.mtgjson.tables.pojos.Rulings object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.mtgjson.tables.pojos.Rulings> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Rulings.RULINGS.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.mtgjson.tables.pojos.Rulings> fetchById(Integer... values) {
        return fetch(Rulings.RULINGS.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.mtgjson.tables.pojos.Rulings fetchOneById(Integer value) {
        return fetchOne(Rulings.RULINGS.ID, value);
    }

    /**
     * Fetch records that have <code>date BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.mtgjson.tables.pojos.Rulings> fetchRangeOfDate(String lowerInclusive, String upperInclusive) {
        return fetchRange(Rulings.RULINGS.DATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>date IN (values)</code>
     */
    public List<com.mtgjson.tables.pojos.Rulings> fetchByDate(String... values) {
        return fetch(Rulings.RULINGS.DATE, values);
    }

    /**
     * Fetch records that have <code>text BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.mtgjson.tables.pojos.Rulings> fetchRangeOfText(String lowerInclusive, String upperInclusive) {
        return fetchRange(Rulings.RULINGS.TEXT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>text IN (values)</code>
     */
    public List<com.mtgjson.tables.pojos.Rulings> fetchByText(String... values) {
        return fetch(Rulings.RULINGS.TEXT, values);
    }

    /**
     * Fetch records that have <code>uuid BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.mtgjson.tables.pojos.Rulings> fetchRangeOfUuid(String lowerInclusive, String upperInclusive) {
        return fetchRange(Rulings.RULINGS.UUID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>uuid IN (values)</code>
     */
    public List<com.mtgjson.tables.pojos.Rulings> fetchByUuid(String... values) {
        return fetch(Rulings.RULINGS.UUID, values);
    }
}

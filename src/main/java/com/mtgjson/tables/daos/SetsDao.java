/*
 * This file is generated by jOOQ.
 */
package com.mtgjson.tables.daos;


import com.mtgjson.tables.Sets;
import com.mtgjson.tables.records.SetsRecord;

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
public class SetsDao extends DAOImpl<SetsRecord, com.mtgjson.tables.pojos.Sets, Integer> {

    /**
     * Create a new SetsDao without any configuration
     */
    public SetsDao() {
        super(Sets.SETS, com.mtgjson.tables.pojos.Sets.class);
    }

    /**
     * Create a new SetsDao with an attached configuration
     */
    public SetsDao(Configuration configuration) {
        super(Sets.SETS, com.mtgjson.tables.pojos.Sets.class, configuration);
    }

    @Override
    public Integer getId(com.mtgjson.tables.pojos.Sets object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Sets.SETS.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchById(Integer... values) {
        return fetch(Sets.SETS.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.mtgjson.tables.pojos.Sets fetchOneById(Integer value) {
        return fetchOne(Sets.SETS.ID, value);
    }

    /**
     * Fetch records that have <code>baseSetSize BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchRangeOfBasesetsize(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Sets.SETS.BASESETSIZE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>baseSetSize IN (values)</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchByBasesetsize(Integer... values) {
        return fetch(Sets.SETS.BASESETSIZE, values);
    }

    /**
     * Fetch records that have <code>block BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchRangeOfBlock(String lowerInclusive, String upperInclusive) {
        return fetchRange(Sets.SETS.BLOCK, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>block IN (values)</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchByBlock(String... values) {
        return fetch(Sets.SETS.BLOCK, values);
    }

    /**
     * Fetch records that have <code>boosterV3 BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchRangeOfBoosterv3(String lowerInclusive, String upperInclusive) {
        return fetchRange(Sets.SETS.BOOSTERV3, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>boosterV3 IN (values)</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchByBoosterv3(String... values) {
        return fetch(Sets.SETS.BOOSTERV3, values);
    }

    /**
     * Fetch records that have <code>code BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchRangeOfCode(String lowerInclusive, String upperInclusive) {
        return fetchRange(Sets.SETS.CODE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>code IN (values)</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchByCode(String... values) {
        return fetch(Sets.SETS.CODE, values);
    }

    /**
     * Fetch a unique record that has <code>code = value</code>
     */
    public com.mtgjson.tables.pojos.Sets fetchOneByCode(String value) {
        return fetchOne(Sets.SETS.CODE, value);
    }

    /**
     * Fetch records that have <code>codeV3 BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchRangeOfCodev3(String lowerInclusive, String upperInclusive) {
        return fetchRange(Sets.SETS.CODEV3, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>codeV3 IN (values)</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchByCodev3(String... values) {
        return fetch(Sets.SETS.CODEV3, values);
    }

    /**
     * Fetch records that have <code>isFoilOnly BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchRangeOfIsfoilonly(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Sets.SETS.ISFOILONLY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>isFoilOnly IN (values)</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchByIsfoilonly(Integer... values) {
        return fetch(Sets.SETS.ISFOILONLY, values);
    }

    /**
     * Fetch records that have <code>isForeignOnly BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchRangeOfIsforeignonly(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Sets.SETS.ISFOREIGNONLY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>isForeignOnly IN (values)</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchByIsforeignonly(Integer... values) {
        return fetch(Sets.SETS.ISFOREIGNONLY, values);
    }

    /**
     * Fetch records that have <code>isOnlineOnly BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchRangeOfIsonlineonly(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Sets.SETS.ISONLINEONLY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>isOnlineOnly IN (values)</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchByIsonlineonly(Integer... values) {
        return fetch(Sets.SETS.ISONLINEONLY, values);
    }

    /**
     * Fetch records that have <code>isPartialPreview BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchRangeOfIspartialpreview(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Sets.SETS.ISPARTIALPREVIEW, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>isPartialPreview IN (values)</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchByIspartialpreview(Integer... values) {
        return fetch(Sets.SETS.ISPARTIALPREVIEW, values);
    }

    /**
     * Fetch records that have <code>keyruneCode BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchRangeOfKeyrunecode(String lowerInclusive, String upperInclusive) {
        return fetchRange(Sets.SETS.KEYRUNECODE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>keyruneCode IN (values)</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchByKeyrunecode(String... values) {
        return fetch(Sets.SETS.KEYRUNECODE, values);
    }

    /**
     * Fetch records that have <code>mcmId BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchRangeOfMcmid(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Sets.SETS.MCMID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>mcmId IN (values)</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchByMcmid(Integer... values) {
        return fetch(Sets.SETS.MCMID, values);
    }

    /**
     * Fetch records that have <code>mcmName BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchRangeOfMcmname(String lowerInclusive, String upperInclusive) {
        return fetchRange(Sets.SETS.MCMNAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>mcmName IN (values)</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchByMcmname(String... values) {
        return fetch(Sets.SETS.MCMNAME, values);
    }

    /**
     * Fetch records that have <code>meta BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchRangeOfMeta(String lowerInclusive, String upperInclusive) {
        return fetchRange(Sets.SETS.META, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>meta IN (values)</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchByMeta(String... values) {
        return fetch(Sets.SETS.META, values);
    }

    /**
     * Fetch records that have <code>mtgoCode BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchRangeOfMtgocode(String lowerInclusive, String upperInclusive) {
        return fetchRange(Sets.SETS.MTGOCODE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>mtgoCode IN (values)</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchByMtgocode(String... values) {
        return fetch(Sets.SETS.MTGOCODE, values);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Sets.SETS.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchByName(String... values) {
        return fetch(Sets.SETS.NAME, values);
    }

    /**
     * Fetch records that have <code>parentCode BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchRangeOfParentcode(String lowerInclusive, String upperInclusive) {
        return fetchRange(Sets.SETS.PARENTCODE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>parentCode IN (values)</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchByParentcode(String... values) {
        return fetch(Sets.SETS.PARENTCODE, values);
    }

    /**
     * Fetch records that have <code>releaseDate BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchRangeOfReleasedate(String lowerInclusive, String upperInclusive) {
        return fetchRange(Sets.SETS.RELEASEDATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>releaseDate IN (values)</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchByReleasedate(String... values) {
        return fetch(Sets.SETS.RELEASEDATE, values);
    }

    /**
     * Fetch records that have <code>tcgplayerGroupId BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchRangeOfTcgplayergroupid(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Sets.SETS.TCGPLAYERGROUPID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tcgplayerGroupId IN (values)</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchByTcgplayergroupid(Integer... values) {
        return fetch(Sets.SETS.TCGPLAYERGROUPID, values);
    }

    /**
     * Fetch records that have <code>totalSetSize BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchRangeOfTotalsetsize(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Sets.SETS.TOTALSETSIZE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>totalSetSize IN (values)</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchByTotalsetsize(Integer... values) {
        return fetch(Sets.SETS.TOTALSETSIZE, values);
    }

    /**
     * Fetch records that have <code>type BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchRangeOfType(String lowerInclusive, String upperInclusive) {
        return fetchRange(Sets.SETS.TYPE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public List<com.mtgjson.tables.pojos.Sets> fetchByType(String... values) {
        return fetch(Sets.SETS.TYPE, values);
    }
}

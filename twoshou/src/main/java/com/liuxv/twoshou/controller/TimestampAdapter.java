package com.liuxv.twoshou.controller;

/**
 * created by liuxv on 2018/6/1
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
import java.sql.Timestamp;
import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;
public class TimestampAdapter extends XmlAdapter<Date, Timestamp> {
    public Date marshal(Timestamp t) {
        return new Date(t.getTime());
    }
    public Timestamp unmarshal(Date d) {
        return new Timestamp (d.getTime());
    }
}
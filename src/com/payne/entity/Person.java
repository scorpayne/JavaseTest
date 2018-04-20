/**
 * Chengzai.com Inc. 
 * Copyright (c) 2016-2017 All Rights Reserved. 
 */
package com.payne.entity;

import sun.util.resources.cldr.ar.CalendarData_ar_LB;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author peng.dengp
 * @version $Id: Person, v 0.1 2017-09-21 23:58 peng.dengp Exp $
 */
public class Person implements Serializable{
    private String identNo;

    private String name;

    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentNo() {
        return identNo;
    }

    public void setIdentNo(String identNo) {
        this.identNo = identNo;
    }

    public Person() {
    }

    public Person(String identNo, String name) {
        this.identNo = identNo;
        this.name = name;
    }

    public Person(String identNo, String name, Date birthday) {
        this.identNo = identNo;
        this.name = name;
        this.birthday = birthday;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Person person = (Person) o;

        return identNo != null ? identNo.equals(person.identNo) : person.identNo == null;
    }

    @Override public int hashCode() {
        return identNo != null ? identNo.hashCode() : 0;
    }
}

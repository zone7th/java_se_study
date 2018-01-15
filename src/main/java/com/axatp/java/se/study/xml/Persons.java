package com.axatp.java.se.study.xml;

import java.util.Iterator;
import java.util.List;

public class Persons {
    private String type;
    private List<Person> listPerson;

    public Persons(String type, List<Person> listPerson) {
        super();
        this.type = type;
        this.listPerson = listPerson;
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Person> getListPerson() {
        return listPerson;
    }

    public void setListPerson(List<Person> listPerson) {
        this.listPerson = listPerson;
    }

    public String toString() {
        StringBuffer sb=new StringBuffer();
        for(Iterator it=listPerson.iterator();it.hasNext();){
            Person p=(Person)it.next();
            sb.append(it.toString());
        }
        return "Persons{" +
                "type='" + type + '\'' +
                ", listPerson=" + sb.toString() +
                "}\n";
    } 
}

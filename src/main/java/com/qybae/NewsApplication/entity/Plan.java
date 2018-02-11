package com.qybae.NewsApplication.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.qybae.NewsApplication.statics.PlansEnum;

import java.io.Serializable;

/**
 * Created by tedonema on 28/03/2016.
 */
@Entity
@Table(name="plan")
public class Plan implements Serializable {

    /** The Serial Version UID for Serializable classes. */
    private static final long serialVersionUID = 1L;

    @Id
    private int id;

    private String name;

    /** Default constructor. */
    public Plan() {

    }

    public Plan(PlansEnum plansEnum) {
        this.id = plansEnum.getId();
        this.name = plansEnum.getPlanName();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Plan plan = (Plan) o;

        return id == plan.id;

    }

    @Override
    public int hashCode() {
        return id;
    }
}
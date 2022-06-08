package com.example.demo.Model;

import javax.persistence.*;

@Entity
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;

    @Column(name = "department_name")
    private String name;

    @Column(name = "building_name")
    private long buildingNumber;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(long buildingNumber) {
        this.buildingNumber = buildingNumber;
    }
}

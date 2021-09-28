package org.fasttrackit.course19;

import java.time.Year;
import java.util.Date;

/**
 * Exemplifying the Prototype Design Pattern
 */
public class Car {
    private Long id;
    private String brand;
    private String model;
    private String series;
    private Year year;
    private Date creationDate;

    /**
     * We omit the `ID` field when cloning, and
     * we set the `creationDate` to the date when
     * the clone was created.
     * @return A clone without an ID and the `creationDate`
     * set to today.
     */
    @Override
    public Car clone() {
        final Car clonedCar = new Car();
        clonedCar.setBrand(this.getBrand());
        clonedCar.setModel(this.getModel());
        clonedCar.setSeries(this.getSeries());
        clonedCar.setYear(this.getYear());
        clonedCar.setCreationDate(new Date());
        return clonedCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", year=" + year +
                ", creationDate=" + creationDate +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}

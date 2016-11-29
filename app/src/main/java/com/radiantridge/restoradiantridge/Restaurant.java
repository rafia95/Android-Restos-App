package com.radiantridge.restoradiantridge;

import java.sql.Timestamp;

/**
 * Created by 1141669 on 11/21/2016.
 */

public class Restaurant {

    private String name;
    private int addNum;
    private String addStreet;
    private String addCity;
    private String addPostalCode;
    private String genre;
    private String priceRange; //the range is $ to $$$$
    private Timestamp createdTime;  // ?? creation time of what
    private Timestamp modifiedTime;  // ?? of what
    private int starRating; // 1- 5
    private String notes;
    private double longitude;
    private double latitude;

    public Restaurant() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddStreet() {
        return addStreet;
    }

    public void setAddStreet(String addStreet) {
        this.addStreet = addStreet;
    }

    public int getAddNum() {
        return addNum;
    }

    public void setAddNum(int addNum) {
        this.addNum = addNum;
    }

    public String getAddCity() {
        return addCity;
    }

    public void setAddCity(String addCity) {
        this.addCity = addCity;
    }

    public String getAddPostalCode() {
        return addPostalCode;
    }

    public void setAddPostalCode(String addPostalCode) {
        this.addPostalCode = addPostalCode;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange;
    }

    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    public Timestamp getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Timestamp modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Restaurant that = (Restaurant) o;

        if (addNum != that.addNum) return false;
        if (starRating != that.starRating) return false;
        if (Double.compare(that.longitude, longitude) != 0) return false;
        if (Double.compare(that.latitude, latitude) != 0) return false;
        if (!name.equals(that.name)) return false;
        if (addStreet != null ? !addStreet.equals(that.addStreet) : that.addStreet != null)
            return false;
        if (addCity != null ? !addCity.equals(that.addCity) : that.addCity != null) return false;
        if (!addPostalCode.equals(that.addPostalCode)) return false;
        if (genre != null ? !genre.equals(that.genre) : that.genre != null) return false;
        if (priceRange != null ? !priceRange.equals(that.priceRange) : that.priceRange != null)
            return false;
        if (createdTime != null ? !createdTime.equals(that.createdTime) : that.createdTime != null)
            return false;
        if (modifiedTime != null ? !modifiedTime.equals(that.modifiedTime) : that.modifiedTime != null)
            return false;
        return notes != null ? notes.equals(that.notes) : that.notes == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        result = 31 * result + addNum;
        result = 31 * result + (addStreet != null ? addStreet.hashCode() : 0);
        result = 31 * result + (addCity != null ? addCity.hashCode() : 0);
        result = 31 * result + addPostalCode.hashCode();
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        result = 31 * result + (priceRange != null ? priceRange.hashCode() : 0);
        result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
        result = 31 * result + (modifiedTime != null ? modifiedTime.hashCode() : 0);
        result = 31 * result + starRating;
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        temp = Double.doubleToLongBits(longitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(latitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", addNum=" + addNum +
                ", addStreet='" + addStreet + '\'' +
                ", addCity='" + addCity + '\'' +
                ", addPostalCode='" + addPostalCode + '\'' +
                ", genre='" + genre + '\'' +
                ", priceRange='" + priceRange + '\'' +
                ", createdTime=" + createdTime +
                ", modifiedTime=" + modifiedTime +
                ", starRating=" + starRating +
                ", notes='" + notes + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }
}

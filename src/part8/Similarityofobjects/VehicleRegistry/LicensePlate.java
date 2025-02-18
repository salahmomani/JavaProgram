package part8.Similarityofobjects.VehicleRegistry;

import java.util.Objects;

public class LicensePlate {
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }
    public int hashCode() {
        LicensePlate Lp=new LicensePlate(this.country,this.liNumber);
        return Objects.hash(country, liNumber);
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        LicensePlate other = (LicensePlate) obj;
        return this.country.equals(other.country) && this.liNumber.equals(other.liNumber);
    }
    @Override
    public String toString() {
        return country + " " + liNumber;
    }
}
package entities.sales;

import entities.BaseEntity;

import javax.persistence.*;
import java.util.Set;

//@Entity
//@Table(name = "store_locations")
public class StoreLocation extends BaseEntity{

    private String locationName;
    private Set<Sale> sales;

    public StoreLocation() {
    }

    @Column(name = "location_name",nullable = false,length = 60)
    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    @OneToMany(mappedBy = "storeLocation", targetEntity = Sale.class,
            fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    public Set<Sale> getSales() {
        return sales;
    }

    public void setSales(Set<Sale> sales) {
        this.sales = sales;
    }
}
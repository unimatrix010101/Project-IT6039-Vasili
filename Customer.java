package packer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vasili
 */
public class Customer {
    
    private String name;
    private List<Address> addresses;

    public Customer(String name, Address address) {
        addresses = new ArrayList<>();
        this.name = name;
        this.addresses.add(address);
    }
    
    public void addAddress(Address address) {
        this.addresses.add(address);
    }
    
    public String getName() {
        return name;
    }

    /**
     * Added bestDistance = distance; as it was missing from
     * code. This allows for getClosestAddressTo to return 
     * the correct closest address as intended.
     * @param d
     * @return 
    */
    public Address getClosestAddressTo(Depot d) {
        double bestDistance = Double.MAX_VALUE;
        Address bestAddress = null;
        for (Address a : addresses) {
            double distance = a.getCoordinates().companyDistanceTo(d.getCoordinates());
            if (distance < bestDistance) {
                bestDistance = distance;
                bestAddress = a;
            }
        }
        return bestAddress;
    }
    @Override
    
    public String toString() {
        return this.getName();
    }
}

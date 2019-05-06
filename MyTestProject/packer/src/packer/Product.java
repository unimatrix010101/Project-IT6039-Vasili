package packer;

import java.util.Objects;

/**
 *
 * @author Vasili
 */
public class Product {

    private String name;
    private int weight;
    private boolean hazardous;
    private boolean fragile;

    public Product(String name, int weight, boolean hazardous, boolean fragile) {
        this.name = name;
        this.weight = weight;
        this.hazardous = hazardous;
        this.fragile = fragile;
    }

    /**
     * @return Returns the product weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @return Returns the product name
     */
    public String getName() {
        return name;
    }

    /**
     * Logical Error
     * @return Returns now the correct description
     * Had to change return false;
     * With return hazardous; as the return value shouldn't be false;
     */
    public boolean isHazardous() {
        return hazardous;
    }

    /**
     * @return Returns the description fragile
     */
    public boolean isFragile() {
        return fragile;
    }
    /**
    * Added @override annotation to help prevent errors
    * @return Returns Product name 
    */
    @Override
    public String toString() {
        return this.getName();
    }
    /**
     * Added @override annotation to help prevent errors
     * @param o holds product information
     * @return Returns correct Product name
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Product)) {
            return false;
        }
        Product p = (Product)o;
        return p.getName().equals(this.getName());
    }

    /**
     * Added @override annotation to help prevent errors.
     * Added HashCode for better comparing objects.
     * @return Returns hash code
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.name);
        hash = 19 * hash + this.weight;
        hash = 19 * hash + (this.hazardous ? 1 : 0);
        hash = 19 * hash + (this.fragile ? 1 : 0);
        return hash;
    }
    
}

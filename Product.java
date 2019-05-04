package packer;

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
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the hazardous
     * Had to change return false;
     * With return hazardous; as the return value shouldn't be false;
     */
    public boolean isHazardous() {
        return hazardous;
    }

    /**
     * @return the fragile
     */
    public boolean isFragile() {
        return fragile;
    }

    @Override
    public String toString() {
        return this.getName();
    }
    
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Product)) {
            return false;
        }
        Product p = (Product)o;
        return p.getName().equals(this.getName());
    }
    
}

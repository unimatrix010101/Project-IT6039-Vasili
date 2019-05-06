package packer;

/**
 *
 * @author Vasili
 */
public class Depot {
    private String name;
    private Address address;

    public Depot(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    /**
     * Changed return to name; and removed .toString from 
     * public String getName() {
     *  return address.toString();
    *}
     * As string needs to return name it was changed
     * FRefactored the to.string is not needed as it is
     * already part of a string
     * @return Returns correct Depot Name
    */
    public String getName() {
        return name;
    }
    
    public Coordinates getCoordinates() {
        return this.address.getCoordinates();
    }
    /**
     * Added @override annotation to help prevent errors
     * @return Returns correct Depot Name
     */
    @Override
    public String toString() {
        return this.getName();
    }
    
}

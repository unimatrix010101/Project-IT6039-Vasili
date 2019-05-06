package packer;

import java.util.Comparator;

/**
 *
 * @author Vasili
 * 
 * This is used when we need to sort by product weight descending
 */
public class ProductWeightComparator implements Comparator<Product> {
    /**
     * Added @override annotation to help prevent errors
     * @param a Compares weight between two products
     * @param b Compares weight between two products
     * @return Returns comparison to another product
     */
    @Override
    public int compare(Product a, Product b) {
        if (a.getWeight() < b.getWeight()) {return 1;}
        else if (a.getWeight() > b.getWeight()) {return -1;}
        else return a.getName().compareTo(b.getName());
    }
                
}

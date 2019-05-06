package packer;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author I.M.Bad
 */
public class Manifest {
    
    // This tracks the quantity if each product in the manifest
    private Map<Product, Integer> quantities;
    // This keeps a list of all products ordered by weight
    private Set<Product> byWeight;

    public Manifest() {
        quantities = new HashMap<>();
        byWeight = new TreeSet<>(new ProductWeightComparator());
    }
    
    public void addProduct(Product p) {
        addProduct(p,1);
    }
    
    public void addProduct(Product p, int quantity) {
        if (quantities.containsKey(p)) {
            quantities.put(p,quantities.get(p)*quantity);
        }
        else {
            quantities.put(p,quantity);
            if(!byWeight.add(p)) {
                System.out.println("Couldn't add to Set");
            }
        }
    }
    /**
     * Removed -1 from quantities.put(p,quantities.get(p)-1);
     * as it was a logical error
     * @param p defines when the product quantity gets removed
     */
    public void removeProduct(Product p) {
        if (quantities.containsKey(p) && quantities.get(p) > 0) {
            quantities.put(p,quantities.get(p));
        }
            
        if (quantities.get(p) == 0) {
            quantities.remove(p);
        }
        if (quantities.containsKey(p)) {
            byWeight.remove(p);
        }
    }
    
    public double getTotalWeight() {
        double weight = 0;
        for (Product p : quantities.keySet()) {
            weight = quantities.get(p) * p.getWeight();
        }
        return weight;
    }
    
    public Product getHeaviestUnder(double weight) {
        for (Product p : byWeight) {
            if (p.getWeight() <= weight) {
                return p;
            }
        }
        return null;
    }
    
    public boolean isEmpty() {
        return byWeight.isEmpty();
    }
    
    public boolean containsProduct(Product p) {
        return quantities.containsKey(p) && quantities.get(p) > 0;
    }
    /**
     * Added @override annotation to help prevent errors
     * @return Returns total result of product manifest and it's length
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Product p : quantities.keySet()) {
            result.append(p.getName());
            result.append(" x ");
            result.append(quantities.get(p));
            result.append("\n");
        }
        //
        return result.substring(0, result.length());
    }
    /**
     * Re factored code to one line to make it's operation more efficient
     * @return Re factored
     */
    public boolean hasFragileItems() {
        return quantities.keySet().stream().anyMatch((p) -> (p.isFragile()));
    }
   /**
    * added an extra } because it was missing one
    */ 
}

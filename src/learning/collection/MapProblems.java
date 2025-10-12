package learning.collection;

import java.util.HashMap;
import java.util.Map;

public class MapProblems {

     public static void countProducts(){
         Map<String, Integer> views = new HashMap<>();

         // Simulate product views
         String[] viewedProducts = {
                 "P123", "P456", "P123", "P789", "P456", "P123"
         };

         for(String productId : viewedProducts){
             views.put(productId, views.getOrDefault(productId,0)+1);
         }

         System.out.println("Product view counts:");
         for (Map.Entry<String, Integer> entry : views.entrySet()) {
             System.out.println("Product ID: " + entry.getKey() + " -> Views: " + entry.getValue());
         }

     }



    public static void main(String[] args) {
        MapProblems.countProducts();
    }
}

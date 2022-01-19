import java.util.ArrayList;

public class Box<T extends Fruits> {
    private ArrayList<T> fruits;
    private Double itemWeight = 0.0;
    private Double boxWeight = 0.0;


    public Box(){
        fruits = new ArrayList<>();
    }

    public void addFruit (Integer numOfFruits, T fruit){
        for (int i=0; i<numOfFruits; i++){
            fruits.add(fruit);
        }
        itemWeight = fruit.getWeight();
    }

    public Double getWeight(){
        boxWeight = fruits.size()*itemWeight;
        return boxWeight;
    }

    public boolean compare(Box<?> box){
        return this.getWeight() == box.getWeight();
    }

    public void emptyTo(Box<T> box){
      box.fruits.addAll(this.fruits);
      this.fruits.clear();
    }


}

public class FlowerBed {
    // Fields
    private String id;
    private int totalArea;
    private int usedArea;

    // Constructor
    public FlowerBed(String bedId, int bedTotalArea) {
        id = bedId;
        totalArea = bedTotalArea;
        // usedArea is always initialised as 0
        usedArea = 0;
    }

    // Accessor methods
    public String getId() {
        return id;
    }
    public int getTotalArea() {
        return totalArea;
    }
    public int getUsedArea() {
        return usedArea;
    }

    // Mutator methods
    public void alterUsedArea(int amount) {
        usedArea = usedArea + amount;
        // Ensuring that 0 <= usedArea <= totalArea
        if (usedArea < 0) {
            usedArea = 0;
        }
        if (usedArea > totalArea) {
            usedArea = totalArea;
        }
    }
}
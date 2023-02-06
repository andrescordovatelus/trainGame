public class Bagoons{

    public Double maxWeight;
    public int nBagoons;

    public Bagoons(Double maxWeight, int nBagoons){
        this.maxWeight = maxWeight;
        this.nBagoons = nBagoons;
    }

    public Double getMaxWeight() {
        return maxWeight;
    }

    public int getnBagoons() {
        return nBagoons;
    }

    public void setMaxWeight(Double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void setnBagoons(int nBagoons) {
        this.nBagoons = nBagoons;
    }

    public void addBagoons(int nBagoons){
        this.nBagoons += nBagoons;
    }
}
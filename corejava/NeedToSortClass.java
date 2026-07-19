package corejava;

public class NeedToSortClass implements Comparable<NeedToSortClass>{

    private int id;
    private String name;

    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    @Override
    public int compareTo(NeedToSortClass o) {
        int returnVal = 0;
        if (this.id > o.id) {
            returnVal = -1;
        } else if (this.id < o.id) {
            returnVal = 1;
        }
        return returnVal;
    }
}

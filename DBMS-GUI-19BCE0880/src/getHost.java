public class getHost {
    String Name,Block,Capacity;
    getHost(String name,String block,String capacity)
    {
        this.Name=name;
        this.Block=block;
        this.Capacity=capacity;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getBlock() {
        return Block;
    }
    public void setBlock(String block) {
        Block = block;
    }
    public String getCapacity() {
        return Capacity;
    }
    public void setCapacity(String capacity) {
        Capacity = capacity;
    }
}

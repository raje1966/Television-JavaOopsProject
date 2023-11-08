package television;


class Tele {
    
    private String name;
    private int size;
    private int cost;
    

    
    public void setData(String setName, int setSize, int setCost)
    {
        name = setName;
        size = setSize;
        cost = setCost;
        
    }
    
    public String getName() 
    {
        return name;
    }
    
    public int getSize() 
    {
        return size;
    }
    
    public int getCost() 
    {
        return cost;
    }
}
    
    class Television
    {

        public static void main(String[] args) 
        {
            Tele tv = new Tele();
            tv.setData("Sony",42, 100000);
            System.out.println(tv.getName());
            System.out.println(tv.getSize());
            System.out.println(tv.getCost());
        
        }
    
    
    }
    


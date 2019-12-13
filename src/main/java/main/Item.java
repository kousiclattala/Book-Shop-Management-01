package main;
public class Item{
    public String itemName;
    public int mrp;
    public  void addItem(String itemName,int mrp)
    {
        //write your code here
    	//-------------------
    	this.itemName = itemName;
    	this.mrp = mrp;
    }
	public String getItemName() 
	{
		return itemName;
	}
	public int getMrp() 
	{
		return mrp;
	}
    
}
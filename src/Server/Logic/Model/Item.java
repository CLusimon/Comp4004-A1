package Server.Logic.Model;

public class Item {
	int itemid;
	String ISBN;
	String copynumber;
	
	public Item(int itemid,String ISBN,String copynumber){
		this.itemid=itemid;
		this.ISBN=ISBN;
		this.copynumber=copynumber;
	}
	public int getItemid() {
		return itemid;
	}
}

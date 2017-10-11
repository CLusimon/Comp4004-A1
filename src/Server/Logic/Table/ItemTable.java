package Server.Logic.Table;

import java.util.ArrayList;
import java.util.List;

//import org.apache.log4j.Logger;

import Server.Logic.Model.Item;
//import utilities.Trace;

public class ItemTable {
	//private Logger logger = Trace.getInstance().getLogger("opreation_file");
	List<Item> itemList=new ArrayList<Item>();
    private static class ItemListHolder {
        private static final ItemTable INSTANCE = new ItemTable();
    }
    private ItemTable(){
    	//set up the default list with some instances
    	String[] ISBNList=new String[]{"9781442668584","9781442616899","9781442667181","9781611687910"};
    	String[] cnList=new String[]{"1","1","1","1"};
    	for(int i=0;i<ISBNList.length;i++){
			Item deitem=new Item(i,ISBNList[i],cnList[i]);
			itemList.add(deitem);
		}
    	//logger.info(String.format("Operation:Initialize ItemTable;ItemTable: %s", itemList));
    };
    public static final ItemTable getInstance() {
        return ItemListHolder.INSTANCE;
    }
}

package Server.Logic.Table;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//import org.apache.log4j.Logger;

import Server.Logic.Model.Loan;


//import utilities.Trace;

public class LoanTable {
	//private Logger logger = Trace.getInstance().getLogger("opreation_file");
	List<Loan> loanList=new ArrayList<Loan>();
    private static class LoanListHolder {
        private static final LoanTable INSTANCE = new LoanTable();
    }
    private LoanTable(){
    	//set up the default list with some instances
    	Loan loan=new Loan(0,"9781442668584","1",new Date(),"0");
    	loanList.add(loan);
    	//logger.info(String.format("Operation:Initialize LoanTable;LoanTable: %s", loanList));
    };
    public static final LoanTable getInstance() {
        return LoanListHolder.INSTANCE;
    }
    /*
    public Object createloan(int i, String string, String string2, Date date) {
		String result="";
		boolean user=UserTable.getInstance().lookup(i);
		boolean isbn=TitleTable.getInstance().lookup(string);
		boolean copynumber=ItemTable.getInstance().lookup(string,string2);
		boolean oloan=LoanTable.getInstance().lookup(i,string,string2);
		boolean limit=LoanTable.getInstance().checkLimit(i);
		boolean fee=FeeTable.getInstance().lookup(i);
		if(user==false){
			result="User Invalid";
			logger.info(String.format("Operation:Borrow Item;Loan Info:[%d,%s,%s,%s];State:Fail;Reason:Invalid User.", i,string,string2,dateformat(date)));
		}else if(isbn==false){
			result="ISBN Invalid";
			logger.info(String.format("Operation:Borrow Item;Loan Info:[%d,%s,%s,%s];State:Fail;Reason:Invalid ISBN.", i,string,string2,dateformat(date)));
		}else if(copynumber==false){
			result="Copynumber Invalid";
			logger.info(String.format("Operation:Borrow Item;Loan Info:[%d,%s,%s,%s];State:Fail;Reason:Invalid Copynumber.", i,string,string2,dateformat(date)));
		}else{
			if(oloan){
				if(limit && fee){
				Loan loan=new Loan(i,string,string2,date,"0");
				loanList.add(loan);
				result="success";
				logger.info(String.format("Operation:Borrow Item;Loan Info:[%d,%s,%s,%s];State:Success", i,string,string2,dateformat(date)));
				}else if(limit==false){
					result="The Maximun Number of Items is Reached";
					logger.info(String.format("Operation:Borrow Item;Loan Info:[%d,%s,%s,%s];State:Fail;Reason:The Maximun Number of Items is Reached.", i,string,string2,dateformat(date)));
				}else if(fee==false){
					result="Outstanding Fee Exists";
					logger.info(String.format("Operation:Borrow Item;Loan Info:[%d,%s,%s,%s];State:Fail;Reason:Outstanding Fee Exists.", i,string,string2,dateformat(date)));
				}
			}else{
				result="The Item is Not Available";
				logger.info(String.format("Operation:Borrow Item;Loan Info:[%d,%s,%s,%s];State:Fail;Reason:The Item is Not Available.", i,string,string2,dateformat(date)));
			}
		}
    	return result;
	}
	*/
	public List<Loan> getLoanTable() {
		return loanList;
	}
}

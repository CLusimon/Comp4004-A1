package Server.Logic.Model;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Loan {
	int userid;
	String isbn;
	String copynumber;
	Date date;
	String renewstate;
	
	public Loan(int userid,String isbn,String copynumber,Date date,String renewstate){
		this.userid=userid;
		this.isbn=isbn;
		this.copynumber=copynumber;
		this.date=date;
		this.renewstate=renewstate;
	}
	
	DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	public int getUserid() {
		return userid;
	}
}

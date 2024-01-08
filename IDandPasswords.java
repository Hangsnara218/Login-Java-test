import java.utils.HashMap;
public class IDandPasswords {

	HashMap<String,String> logininfo = new HashMap<String,String>();

	IDandPasswords(){
		logininfo.put("Johan","abc");
		logininfo.put("Kdbjn","123");


	}

	

	public HashMap getLoginInfo(){
		return logininfo;
	}

}
package tp;
import java.util.ArrayList;
public class historique {

	private ArrayList<location>historiqu;

	public historique() {
		historiqu=new ArrayList<location>();
	}

	public ArrayList<location> getTabhis() {
		return historiqu;
	}

	public void setTabhis(ArrayList<location> historiqu) {
		this.historiqu = historiqu;
	}

	
	public void addsss(location l) {
		
		historiqu.add(l);
	}
}

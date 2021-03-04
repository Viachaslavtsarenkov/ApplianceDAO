package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Criteria {

	private String groupSearchName;
	private Map<String, Object> criteria = new HashMap<String, Object>();
	private Iterator<Map.Entry<String, Object>> itr;

	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}
	
	public String getGroupSearchName() {
		return groupSearchName;
	}

	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
		itr = criteria.entrySet().iterator();
	}

	public String getCriteria() {
		if (itr.hasNext()) {
			Map.Entry<String, Object> entry = itr.next();
			return " " + entry.getKey() + "=" + entry.getValue() + ",";
		} else {
			itr = criteria.entrySet().iterator();
		}
		return null;
	}

	// you may add your own code here
}

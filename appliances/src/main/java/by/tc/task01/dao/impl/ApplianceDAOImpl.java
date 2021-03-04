package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import javax.script.ScriptEngine;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class ApplianceDAOImpl implements ApplianceDAO{
		final String DB_TXT_PATH = "src/main/resources/appliances_db.txt";

	@Override
	public Appliance find(Criteria criteria) {
		System.out.println("*******************");
		try {
			File applianceFile = new File(DB_TXT_PATH);
			BufferedReader applianceReaderDate = new BufferedReader(new FileReader(applianceFile));
			String good = applianceReaderDate.readLine();
			while(good != null) {
				if (good.indexOf(criteria.getGroupSearchName()) < 0) {
					continue;
				}
				System.out.println(good);
				good = applianceReaderDate.readLine();
			}
		} catch (Exception e){
			System.out.println(e);
		}
		return null;
	}

	// you may add your own code here

}

//you may add your own new classes
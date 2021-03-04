package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ApplianceDAOImpl implements ApplianceDAO{

	final String DB_TXT_PATH = "src/main/resources/appliances_db.txt";

	@Override
	public Appliance find(Criteria criteria) {

		boolean checkAll = false;
		Appliance appliance = null;

		try {
			File applianceFile = new File(DB_TXT_PATH);
			BufferedReader applianceReaderDate = new BufferedReader(new FileReader(applianceFile));
			String good = applianceReaderDate.readLine();

			while(good != null) {
				checkAll = false;
				criteria.setBeginning();

				if (good.indexOf(criteria.getGroupSearchName()) < 0) {
					good = applianceReaderDate.readLine();
					continue;
				}

				String currentCriteria = criteria.getCriteria();
				while ( currentCriteria != null) {
					if (good.replace(","," ").indexOf(currentCriteria) >= 0) {
						checkAll = true;
					} else {
						checkAll = false;
						break;
					}
					currentCriteria = criteria.getCriteria();
				}

				if (checkAll) {

					String product[] = good.substring(criteria.getGroupSearchName().length() + 3).split("=|, ");
					switch (criteria.getGroupSearchName()) {
						case "Laptop":
							appliance =  new Laptop.LaptopBuilder(product).build();
							break;
						case "Oven":
							appliance = new Oven.OvenBuilder(product).build();
							break;
						case "Refrigerator":
							appliance = new Refrigerator.RefrigeratorBuilder(product).build();
							break;
						case "Speakers":
							appliance = new Speakers.SpeakersBuilder(product).build();
							break;
						case "TabletPC":
							appliance = new TabletPC.TabletPCBuilder(product).build();
							break;
						case "VacuumCleaner":
							appliance = new VacuumCleaner.VacuumCleanerBuilder(product).build();
							break;
						default:
							break;
					}
				}
				good = applianceReaderDate.readLine();
			}
		} catch (Exception e){
			System.out.println(e);
		}
		return appliance;
	}
}
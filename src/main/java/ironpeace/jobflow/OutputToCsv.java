package ironpeace.jobflow;

import ironpeace.modelgen.dmdl.csv.AbstractOutputModelCsvOutputDescription;

public class OutputToCsv extends AbstractOutputModelCsvOutputDescription {

	@Override
	public String getBasePath() {
		return "osfs/output";
	}

	@Override
	public String getResourcePattern() {
		return "{department}/{yyyymm}.csv";
	}	
}

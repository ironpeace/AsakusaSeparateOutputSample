package ironpeace.jobflow;

import ironpeace.modelgen.dmdl.csv.AbstractInputModelCsvInputDescription;

public class inputFromCsv extends AbstractInputModelCsvInputDescription {

	@Override
	public String getBasePath() {
		return "osfs/input";
	}

	@Override
	public String getResourcePattern() {
		return "input.csv";
	}

}

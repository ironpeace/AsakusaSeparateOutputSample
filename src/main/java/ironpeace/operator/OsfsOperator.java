package ironpeace.operator;

import ironpeace.modelgen.dmdl.model.InputModel;
import ironpeace.modelgen.dmdl.model.OutputModel;

import com.asakusafw.vocabulary.operator.Convert;

public abstract class OsfsOperator {
	
	@Convert
	public OutputModel convert(InputModel in){
		OutputModel out = new OutputModel();
		out.setDepartment(in.getDepartment());
		out.setYyyymm(in.getYyyymm());
		out.setValue(in.getValue());
		return out;
	}

}

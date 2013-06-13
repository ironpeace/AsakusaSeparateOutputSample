package ironpeace.jobflow;

import ironpeace.modelgen.dmdl.model.InputModel;
import ironpeace.modelgen.dmdl.model.OutputModel;
import ironpeace.operator.OsfsOperatorFactory;
import ironpeace.operator.OsfsOperatorFactory.Convert;

import com.asakusafw.vocabulary.flow.Export;
import com.asakusafw.vocabulary.flow.FlowDescription;
import com.asakusafw.vocabulary.flow.Import;
import com.asakusafw.vocabulary.flow.In;
import com.asakusafw.vocabulary.flow.JobFlow;
import com.asakusafw.vocabulary.flow.Out;
import com.asakusafw.vocabulary.flow.util.CoreOperatorFactory;

@JobFlow(name="OsfsJobFlow")
public class OsfsJobFlow extends FlowDescription {
	
	final In<InputModel> input;
	final Out<OutputModel> output;
	final CoreOperatorFactory cp = new CoreOperatorFactory();
	
	public OsfsJobFlow(
			@Import(name="input", description=inputFromCsv.class)
			In<InputModel> input,
			@Export(name="output", description=OutputToCsv.class)
			Out<OutputModel> output
			){
		this.input = input;
		this.output = output;
	}

	@Override
	protected void describe() {
		OsfsOperatorFactory op = new OsfsOperatorFactory();
		
		Convert converted = op.convert(input);
		cp.stop(converted.original);
		
		output.add(converted.out);
	}

}

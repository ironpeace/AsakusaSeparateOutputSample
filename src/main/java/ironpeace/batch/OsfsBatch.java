package ironpeace.batch;

import ironpeace.jobflow.OsfsJobFlow;

import com.asakusafw.vocabulary.batch.Batch;
import com.asakusafw.vocabulary.batch.BatchDescription;

@Batch(name="osfsBatch")
public class OsfsBatch extends BatchDescription {

	@Override
	protected void describe() {
		
		run(OsfsJobFlow.class).soon();

	}

}

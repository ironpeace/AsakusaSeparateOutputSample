package ironpeace.batchapp.osfsBatch.osfsJobFlow.directio.epilogue;
import com.asakusafw.runtime.stage.AbstractStageClient;
import com.asakusafw.runtime.stage.StageInput;
import com.asakusafw.runtime.stage.StageOutput;
import com.asakusafw.runtime.stage.directio.DirectOutputReducer;
import com.asakusafw.runtime.stage.input.TemporaryInputFormat;
import com.asakusafw.runtime.stage.output.BridgeOutputFormat;
import ironpeace.modelgen.dmdl.model.OutputModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.hadoop.io.NullWritable;
/**
 * A client class for "directio".
 */
public final class StageClient extends AbstractStageClient {
    @Override protected String getBatchId() {
        return "osfsBatch";
    }
    @Override protected String getFlowId() {
        return "OsfsJobFlow";
    }
    @Override protected String getStageId() {
        return "epilogue.directio";
    }
    @Override protected String getStageOutputPath() {
        return "target/hadoopwork/${execution_id}/osfsBatch/OsfsJobFlow/epilogue/directio";
    }
    @Override protected List<StageInput> getStageInputs() {
        List<StageInput> results = new ArrayList<StageInput>();
        Map<String, String> attributes = null;
        attributes = new HashMap<String, String>();
        results.add(new StageInput("target/hadoopwork/${execution_id}/osfsBatch/OsfsJobFlow/stage0001/result0-*", 
                TemporaryInputFormat.class, StageMapper0.class, attributes));
        return results;
    }
    @Override protected List<StageOutput> getStageOutputs() {
        List<StageOutput> results = new ArrayList<StageOutput>();
        Map<String, String> attributes = null;
        attributes = new HashMap<String, String>();
        results.add(new StageOutput("osfs/output", NullWritable.class, OutputModel.class, BridgeOutputFormat.class, 
                attributes));
        return results;
    }
    @Override protected Class<ShuffleKey> getShuffleKeyClassOrNull() {
        return ShuffleKey.class;
    }
    @Override protected Class<ShuffleValue> getShuffleValueClassOrNull() {
        return ShuffleValue.class;
    }
    @Override protected Class<ShuffleGroupingComparator> getGroupingComparatorClassOrNull() {
        return ShuffleGroupingComparator.class;
    }
    @Override protected Class<ShuffleSortComparator> getSortComparatorClassOrNull() {
        return ShuffleSortComparator.class;
    }
    @Override protected Class<com.asakusafw.runtime.io.util.ShuffleKey.Partitioner> getPartitionerClassOrNull() {
        return com.asakusafw.runtime.io.util.ShuffleKey.Partitioner.class;
    }
    @Override protected Class<DirectOutputReducer> getReducerClassOrNull() {
        return DirectOutputReducer.class;
    }
}
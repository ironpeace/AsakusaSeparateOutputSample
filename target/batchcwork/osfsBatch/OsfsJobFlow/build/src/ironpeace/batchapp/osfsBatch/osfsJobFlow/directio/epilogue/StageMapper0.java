package ironpeace.batchapp.osfsBatch.osfsJobFlow.directio.epilogue;
import com.asakusafw.runtime.stage.directio.AbstractDirectOutputMapper;
import ironpeace.modelgen.dmdl.model.OutputModel;
/**
 */
public final class StageMapper0 extends AbstractDirectOutputMapper<OutputModel> {
    /**
     * Creates a new instance.
     */
    public StageMapper0() {
        super(0, ShuffleKey.class, ShuffleValue.class);
    }
}
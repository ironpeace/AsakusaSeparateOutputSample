package ironpeace.batchapp.osfsBatch.osfsJobFlow.directio.epilogue;
import com.asakusafw.runtime.stage.directio.AbstractDirectOutputKey;
import com.asakusafw.runtime.stage.directio.DirectOutputSpec;
import ironpeace.modelgen.dmdl.csv.OutputModelCsvFormat;
import ironpeace.modelgen.dmdl.model.OutputModel;
/**
 */
public final class ShuffleKey extends AbstractDirectOutputKey {
    /**
     * Creates a new instance.
     */
    public ShuffleKey() {
        super(new DirectOutputSpec[]{new DirectOutputSpec(OutputModel.class, "osfs/output", OutputModelCsvFormat.class, 
                    Naming0001.class, Ordering0001.class)});
    }
}
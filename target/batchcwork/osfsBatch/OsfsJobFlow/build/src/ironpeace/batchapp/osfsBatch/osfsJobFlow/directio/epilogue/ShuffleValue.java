package ironpeace.batchapp.osfsBatch.osfsJobFlow.directio.epilogue;
import com.asakusafw.runtime.stage.directio.AbstractDirectOutputValue;
import com.asakusafw.runtime.stage.directio.DirectOutputSpec;
import ironpeace.modelgen.dmdl.csv.OutputModelCsvFormat;
import ironpeace.modelgen.dmdl.model.OutputModel;
/**
 */
public final class ShuffleValue extends AbstractDirectOutputValue {
    /**
     * Creates a new instance.
     */
    public ShuffleValue() {
        super(new DirectOutputSpec[]{new DirectOutputSpec(OutputModel.class, "osfs/output", OutputModelCsvFormat.class, 
                    Naming0001.class, Ordering0001.class)});
    }
}
package ironpeace.batchapp.osfsBatch.osfsJobFlow.directio.epilogue;
import com.asakusafw.runtime.stage.directio.StringTemplate;
import ironpeace.modelgen.dmdl.model.OutputModel;
/**
 * A naming output "output" class for "directio".
 */
@SuppressWarnings("deprecation") public final class Naming0001 extends StringTemplate {
    /**
     * Creates a new instance.
     */
    public Naming0001() {
        super(new StringTemplate.FormatSpec(StringTemplate.Format.NATURAL, null), new StringTemplate.FormatSpec(
                StringTemplate.Format.PLAIN, "/"), new StringTemplate.FormatSpec(StringTemplate.Format.NATURAL, null), 
                new StringTemplate.FormatSpec(StringTemplate.Format.PLAIN, ".csv"));
    }
    @Override public void set(Object rawObject) {
        OutputModel object = (OutputModel) rawObject;
        this.setProperty(0, object.getDepartmentOption());
        this.setProperty(2, object.getYyyymmOption());
    }
}
package ironpeace.modelgen.dmdl.csv;
import com.asakusafw.vocabulary.directio.DirectFileOutputDescription;
import ironpeace.modelgen.dmdl.model.OutputModel;
/**
 * An abstract implementation of {@link OutputModel} exporter description using Direct I/O CSV.
 */
public abstract class AbstractOutputModelCsvOutputDescription extends DirectFileOutputDescription {
    @Override public Class<? extends OutputModel> getModelType() {
        return OutputModel.class;
    }
    @Override public Class<OutputModelCsvFormat> getFormat() {
        return OutputModelCsvFormat.class;
    }
}
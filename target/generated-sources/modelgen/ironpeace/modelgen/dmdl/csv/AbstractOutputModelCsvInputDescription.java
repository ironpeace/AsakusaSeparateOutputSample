package ironpeace.modelgen.dmdl.csv;
import com.asakusafw.vocabulary.directio.DirectFileInputDescription;
import ironpeace.modelgen.dmdl.model.OutputModel;
/**
 * An abstract implementation of {@link OutputModel} importer description using Direct I/O CSV.
 */
public abstract class AbstractOutputModelCsvInputDescription extends DirectFileInputDescription {
    @Override public Class<? extends OutputModel> getModelType() {
        return OutputModel.class;
    }
    @Override public Class<OutputModelCsvFormat> getFormat() {
        return OutputModelCsvFormat.class;
    }
}
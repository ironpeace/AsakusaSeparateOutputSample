package ironpeace.modelgen.dmdl.csv;
import com.asakusafw.vocabulary.directio.DirectFileInputDescription;
import ironpeace.modelgen.dmdl.model.InputModel;
/**
 * An abstract implementation of {@link InputModel} importer description using Direct I/O CSV.
 */
public abstract class AbstractInputModelCsvInputDescription extends DirectFileInputDescription {
    @Override public Class<? extends InputModel> getModelType() {
        return InputModel.class;
    }
    @Override public Class<InputModelCsvFormat> getFormat() {
        return InputModelCsvFormat.class;
    }
}
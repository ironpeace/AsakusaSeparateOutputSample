package ironpeace.modelgen.dmdl.csv;
import com.asakusafw.vocabulary.directio.DirectFileOutputDescription;
import ironpeace.modelgen.dmdl.model.InputModel;
/**
 * An abstract implementation of {@link InputModel} exporter description using Direct I/O CSV.
 */
public abstract class AbstractInputModelCsvOutputDescription extends DirectFileOutputDescription {
    @Override public Class<? extends InputModel> getModelType() {
        return InputModel.class;
    }
    @Override public Class<InputModelCsvFormat> getFormat() {
        return InputModelCsvFormat.class;
    }
}
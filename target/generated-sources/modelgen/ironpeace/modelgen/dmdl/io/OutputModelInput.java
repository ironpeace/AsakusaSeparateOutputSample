package ironpeace.modelgen.dmdl.io;
import com.asakusafw.runtime.io.ModelInput;
import com.asakusafw.runtime.io.RecordParser;
import ironpeace.modelgen.dmdl.model.OutputModel;
import java.io.IOException;
/**
 * TSVファイルなどのレコードを表すファイルを入力として<code>output_model</code>を読み出す
 */
public final class OutputModelInput implements ModelInput<OutputModel> {
    private final RecordParser parser;
    /**
     * インスタンスを生成する。
     * @param parser 利用するパーサー
     * @throws IllegalArgumentException 引数に<code>null</code>が指定された場合
     */
    public OutputModelInput(RecordParser parser) {
        if(parser == null) {
            throw new IllegalArgumentException("parser");
        }
        this.parser = parser;
    }
    @Override public boolean readTo(OutputModel model) throws IOException {
        if(parser.next() == false) {
            return false;
        }
        parser.fill(model.getDepartmentOption());
        parser.fill(model.getYyyymmOption());
        parser.fill(model.getValueOption());
        parser.endRecord();
        return true;
    }
    @Override public void close() throws IOException {
        parser.close();
    }
}
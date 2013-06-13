package ironpeace.batchapp.osfsBatch.osfsJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import ironpeace.modelgen.dmdl.model.InputModel;
import ironpeace.modelgen.dmdl.model.OutputModel;
import ironpeace.operator.OsfsOperatorImpl;
/**
 * {@code [in->OsfsOperator.convert(operator#1369543768)]}の処理を担当するマッププログラムの断片。
 */
@SuppressWarnings("deprecation") public final class MapFragment1 implements Result<InputModel> {
    private final Result<InputModel> original;
    private final Result<OutputModel> out;
    private OsfsOperatorImpl op = new OsfsOperatorImpl();
    /**
     * インスタンスを生成する。
     * @param original {@code OsfsOperator.convert#original}への出力
     * @param out {@code OsfsOperator.convert#out}への出力
     */
    public MapFragment1(Result<InputModel> original, Result<OutputModel> out) {
        this.original = original;
        this.out = out;
    }
    @Override public void add(InputModel result) {
        OutputModel v = this.op.convert(result);
        this.original.add(result);
        this.out.add(v);
    }
}
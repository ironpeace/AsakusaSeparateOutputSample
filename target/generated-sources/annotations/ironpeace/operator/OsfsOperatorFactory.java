package ironpeace.operator;
import com.asakusafw.vocabulary.flow.Operator;
import com.asakusafw.vocabulary.flow.Source;
import com.asakusafw.vocabulary.flow.graph.FlowElementResolver;
import com.asakusafw.vocabulary.flow.graph.ObservationCount;
import com.asakusafw.vocabulary.flow.graph.OperatorDescription;
import com.asakusafw.vocabulary.operator.OperatorFactory;
import com.asakusafw.vocabulary.operator.OperatorInfo;
import ironpeace.modelgen.dmdl.model.InputModel;
import ironpeace.modelgen.dmdl.model.OutputModel;
import javax.annotation.Generated;
/**
 * {@link OsfsOperator}に関する演算子ファクトリークラス。
 * @see OsfsOperator
 */
@Generated("OperatorFactoryClassGenerator:0.0.1")@OperatorFactory(OsfsOperator.class) public class OsfsOperatorFactory {
    /**
     */
    public static final class Convert implements Operator {
        private final FlowElementResolver $;
        /**
         * 入力された内容
         */
        public final Source<InputModel> original;
        /**
         */
        public final Source<OutputModel> out;
        Convert(Source<InputModel> in) {
            OperatorDescription.Builder builder = new OperatorDescription.Builder(com.asakusafw.vocabulary.operator.
                    Convert.class);
            builder.declare(OsfsOperator.class, OsfsOperatorImpl.class, "convert");
            builder.declareParameter(InputModel.class);
            builder.addInput("in", in);
            builder.addOutput("original", in);
            builder.addOutput("out", OutputModel.class);
            builder.addAttribute(ObservationCount.DONT_CARE);
            this.$ = builder.toResolver();
            this.$.resolveInput("in", in);
            this.original = this.$.resolveOutput("original");
            this.out = this.$.resolveOutput("out");
        }
        /**
         * この演算子の名前を設定する。
         * @param newName 設定する名前
         * @return この演算子オブジェクト (this)
         * @throws IllegalArgumentException 引数に{@code null}が指定された場合
         */
        public OsfsOperatorFactory.Convert as(String newName) {
            this.$.setName(newName);
            return this;
        }
    }
    /**
     * @param in
     * @return 生成した演算子オブジェクト
     * @see OsfsOperator#convert(InputModel)
     */
    @OperatorInfo(kind = com.asakusafw.vocabulary.operator.Convert.class, input = {@OperatorInfo.Input(name = "in", type 
                = InputModel.class, position = 0)}, output = {@OperatorInfo.Output(name = "original", type = InputModel.
                class),@OperatorInfo.Output(name = "out", type = OutputModel.class)}, parameter = {}) public 
            OsfsOperatorFactory.Convert convert(Source<InputModel> in) {
        return new OsfsOperatorFactory.Convert(in);
    }
}
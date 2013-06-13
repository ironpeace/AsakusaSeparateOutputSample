package ironpeace.modelgen.dmdl.model;
import com.asakusafw.runtime.model.DataModel;
import com.asakusafw.runtime.model.DataModelKind;
import com.asakusafw.runtime.model.ModelInputLocation;
import com.asakusafw.runtime.model.ModelOutputLocation;
import com.asakusafw.runtime.model.PropertyOrder;
import com.asakusafw.runtime.value.StringOption;
import ironpeace.modelgen.dmdl.io.OutputModelInput;
import ironpeace.modelgen.dmdl.io.OutputModelOutput;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
/**
 * OUTPUTを表すデータモデルクラス。
 */
@DataModelKind("DMDL")@ModelInputLocation(OutputModelInput.class)@ModelOutputLocation(OutputModelOutput.class)@
        PropertyOrder({"department", "yyyymm", "value"}) public class OutputModel implements DataModel<OutputModel>, 
        Writable {
    private final StringOption department = new StringOption();
    private final StringOption yyyymm = new StringOption();
    private final StringOption value = new StringOption();
    @Override@SuppressWarnings("deprecation") public void reset() {
        this.department.setNull();
        this.yyyymm.setNull();
        this.value.setNull();
    }
    @Override@SuppressWarnings("deprecation") public void copyFrom(OutputModel other) {
        this.department.copyFrom(other.department);
        this.yyyymm.copyFrom(other.yyyymm);
        this.value.copyFrom(other.value);
    }
    /**
     * departmentを返す。
     * @return department
     * @throws NullPointerException departmentの値が<code>null</code>である場合
     */
    public Text getDepartment() {
        return this.department.get();
    }
    /**
     * departmentを設定する。
     * @param value0 設定する値
     */
    @SuppressWarnings("deprecation") public void setDepartment(Text value0) {
        this.department.modify(value0);
    }
    /**
     * <code>null</code>を許すdepartmentを返す。
     * @return department
     */
    public StringOption getDepartmentOption() {
        return this.department;
    }
    /**
     * departmentを設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setDepartmentOption(StringOption option) {
        this.department.copyFrom(option);
    }
    /**
     * yyyymmを返す。
     * @return yyyymm
     * @throws NullPointerException yyyymmの値が<code>null</code>である場合
     */
    public Text getYyyymm() {
        return this.yyyymm.get();
    }
    /**
     * yyyymmを設定する。
     * @param value0 設定する値
     */
    @SuppressWarnings("deprecation") public void setYyyymm(Text value0) {
        this.yyyymm.modify(value0);
    }
    /**
     * <code>null</code>を許すyyyymmを返す。
     * @return yyyymm
     */
    public StringOption getYyyymmOption() {
        return this.yyyymm;
    }
    /**
     * yyyymmを設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setYyyymmOption(StringOption option) {
        this.yyyymm.copyFrom(option);
    }
    /**
     * valueを返す。
     * @return value
     * @throws NullPointerException valueの値が<code>null</code>である場合
     */
    public Text getValue() {
        return this.value.get();
    }
    /**
     * valueを設定する。
     * @param value0 設定する値
     */
    @SuppressWarnings("deprecation") public void setValue(Text value0) {
        this.value.modify(value0);
    }
    /**
     * <code>null</code>を許すvalueを返す。
     * @return value
     */
    public StringOption getValueOption() {
        return this.value;
    }
    /**
     * valueを設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setValueOption(StringOption option) {
        this.value.copyFrom(option);
    }
    @Override public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("{");
        result.append("class=output_model");
        result.append(", department=");
        result.append(this.department);
        result.append(", yyyymm=");
        result.append(this.yyyymm);
        result.append(", value=");
        result.append(this.value);
        result.append("}");
        return result.toString();
    }
    @Override public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + department.hashCode();
        result = prime * result + yyyymm.hashCode();
        result = prime * result + value.hashCode();
        return result;
    }
    @Override public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(this.getClass() != obj.getClass()) {
            return false;
        }
        OutputModel other = (OutputModel) obj;
        if(this.department.equals(other.department) == false) {
            return false;
        }
        if(this.yyyymm.equals(other.yyyymm) == false) {
            return false;
        }
        if(this.value.equals(other.value) == false) {
            return false;
        }
        return true;
    }
    /**
     * departmentを返す。
     * @return department
     * @throws NullPointerException departmentの値が<code>null</code>である場合
     */
    public String getDepartmentAsString() {
        return this.department.getAsString();
    }
    /**
     * departmentを設定する。
     * @param department0 設定する値
     */
    @SuppressWarnings("deprecation") public void setDepartmentAsString(String department0) {
        this.department.modify(department0);
    }
    /**
     * yyyymmを返す。
     * @return yyyymm
     * @throws NullPointerException yyyymmの値が<code>null</code>である場合
     */
    public String getYyyymmAsString() {
        return this.yyyymm.getAsString();
    }
    /**
     * yyyymmを設定する。
     * @param yyyymm0 設定する値
     */
    @SuppressWarnings("deprecation") public void setYyyymmAsString(String yyyymm0) {
        this.yyyymm.modify(yyyymm0);
    }
    /**
     * valueを返す。
     * @return value
     * @throws NullPointerException valueの値が<code>null</code>である場合
     */
    public String getValueAsString() {
        return this.value.getAsString();
    }
    /**
     * valueを設定する。
     * @param value0 設定する値
     */
    @SuppressWarnings("deprecation") public void setValueAsString(String value0) {
        this.value.modify(value0);
    }
    @Override public void write(DataOutput out) throws IOException {
        department.write(out);
        yyyymm.write(out);
        value.write(out);
    }
    @Override public void readFields(DataInput in) throws IOException {
        department.readFields(in);
        yyyymm.readFields(in);
        value.readFields(in);
    }
}
package myproject.entity;

import javax.annotation.Generated;
import myproject.entity.EmpNames._EmpNames;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link GenderDb}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2021/03/25 17:44:54")
public class GenderDbNames {

    /**
     * idのプロパティ名を返します。
     * 
     * @return idのプロパティ名
     */
    public static PropertyName<Integer> id() {
        return new PropertyName<Integer>("id");
    }

    /**
     * genderのプロパティ名を返します。
     * 
     * @return genderのプロパティ名
     */
    public static PropertyName<String> gender() {
        return new PropertyName<String>("gender");
    }

    /**
     * empListのプロパティ名を返します。
     * 
     * @return empListのプロパティ名
     */
    public static _EmpNames empList() {
        return new _EmpNames("empList");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _GenderDbNames extends PropertyName<GenderDb> {

        /**
         * インスタンスを構築します。
         */
        public _GenderDbNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _GenderDbNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         * 
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _GenderDbNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * idのプロパティ名を返します。
         *
         * @return idのプロパティ名
         */
        public PropertyName<Integer> id() {
            return new PropertyName<Integer>(this, "id");
        }

        /**
         * genderのプロパティ名を返します。
         *
         * @return genderのプロパティ名
         */
        public PropertyName<String> gender() {
            return new PropertyName<String>(this, "gender");
        }

        /**
         * empListのプロパティ名を返します。
         * 
         * @return empListのプロパティ名
         */
        public _EmpNames empList() {
            return new _EmpNames(this, "empList");
        }
    }
}
package myproject.entity;

import javax.annotation.Generated;
import myproject.entity.EmpNames._EmpNames;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Dept}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2021/03/25 17:44:54")
public class DeptNames {

    /**
     * idのプロパティ名を返します。
     * 
     * @return idのプロパティ名
     */
    public static PropertyName<Integer> id() {
        return new PropertyName<Integer>("id");
    }

    /**
     * deptIdのプロパティ名を返します。
     * 
     * @return deptIdのプロパティ名
     */
    public static PropertyName<Integer> deptId() {
        return new PropertyName<Integer>("deptId");
    }

    /**
     * deptNameのプロパティ名を返します。
     * 
     * @return deptNameのプロパティ名
     */
    public static PropertyName<String> deptName() {
        return new PropertyName<String>("deptName");
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
    public static class _DeptNames extends PropertyName<Dept> {

        /**
         * インスタンスを構築します。
         */
        public _DeptNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _DeptNames(final String name) {
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
        public _DeptNames(final PropertyName<?> parent, final String name) {
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
         * deptIdのプロパティ名を返します。
         *
         * @return deptIdのプロパティ名
         */
        public PropertyName<Integer> deptId() {
            return new PropertyName<Integer>(this, "deptId");
        }

        /**
         * deptNameのプロパティ名を返します。
         *
         * @return deptNameのプロパティ名
         */
        public PropertyName<String> deptName() {
            return new PropertyName<String>(this, "deptName");
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
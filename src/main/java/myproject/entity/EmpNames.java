package myproject.entity;

import javax.annotation.Generated;
import myproject.entity.DeptNames._DeptNames;
import myproject.entity.GenderDbNames._GenderDbNames;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Emp}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2021/03/25 17:44:54")
public class EmpNames {

    /**
     * idのプロパティ名を返します。
     * 
     * @return idのプロパティ名
     */
    public static PropertyName<Integer> id() {
        return new PropertyName<Integer>("id");
    }

    /**
     * empIdのプロパティ名を返します。
     * 
     * @return empIdのプロパティ名
     */
    public static PropertyName<Integer> empId() {
        return new PropertyName<Integer>("empId");
    }

    /**
     * nameのプロパティ名を返します。
     * 
     * @return nameのプロパティ名
     */
    public static PropertyName<String> name() {
        return new PropertyName<String>("name");
    }

    /**
     * ageのプロパティ名を返します。
     * 
     * @return ageのプロパティ名
     */
    public static PropertyName<Integer> age() {
        return new PropertyName<Integer>("age");
    }

    /**
     * genderIdのプロパティ名を返します。
     * 
     * @return genderIdのプロパティ名
     */
    public static PropertyName<Integer> genderId() {
        return new PropertyName<Integer>("genderId");
    }

    /**
     * addressのプロパティ名を返します。
     * 
     * @return addressのプロパティ名
     */
    public static PropertyName<String> address() {
        return new PropertyName<String>("address");
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
     * genderのプロパティ名を返します。
     * 
     * @return genderのプロパティ名
     */
    public static _GenderDbNames gender() {
        return new _GenderDbNames("gender");
    }

    /**
     * deptのプロパティ名を返します。
     * 
     * @return deptのプロパティ名
     */
    public static _DeptNames dept() {
        return new _DeptNames("dept");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _EmpNames extends PropertyName<Emp> {

        /**
         * インスタンスを構築します。
         */
        public _EmpNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _EmpNames(final String name) {
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
        public _EmpNames(final PropertyName<?> parent, final String name) {
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
         * empIdのプロパティ名を返します。
         *
         * @return empIdのプロパティ名
         */
        public PropertyName<Integer> empId() {
            return new PropertyName<Integer>(this, "empId");
        }

        /**
         * nameのプロパティ名を返します。
         *
         * @return nameのプロパティ名
         */
        public PropertyName<String> name() {
            return new PropertyName<String>(this, "name");
        }

        /**
         * ageのプロパティ名を返します。
         *
         * @return ageのプロパティ名
         */
        public PropertyName<Integer> age() {
            return new PropertyName<Integer>(this, "age");
        }

        /**
         * genderIdのプロパティ名を返します。
         *
         * @return genderIdのプロパティ名
         */
        public PropertyName<Integer> genderId() {
            return new PropertyName<Integer>(this, "genderId");
        }

        /**
         * addressのプロパティ名を返します。
         *
         * @return addressのプロパティ名
         */
        public PropertyName<String> address() {
            return new PropertyName<String>(this, "address");
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
         * genderのプロパティ名を返します。
         * 
         * @return genderのプロパティ名
         */
        public _GenderDbNames gender() {
            return new _GenderDbNames(this, "gender");
        }

        /**
         * deptのプロパティ名を返します。
         * 
         * @return deptのプロパティ名
         */
        public _DeptNames dept() {
            return new _DeptNames(this, "dept");
        }
    }
}
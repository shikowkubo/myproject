package myproject.entity;

import javax.annotation.Generated;
import myproject.entity.DeptNames._DeptNames;
import myproject.entity.EmpNames._EmpNames;
import myproject.entity.GenderDbNames._GenderDbNames;

/**
 * 名前クラスの集約です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesAggregateModelFactoryImpl"}, date = "2021/03/25 17:44:54")
public class Names {

    /**
     * {@link Dept}の名前クラスを返します。
     * 
     * @return Deptの名前クラス
     */
    public static _DeptNames dept() {
        return new _DeptNames();
    }

    /**
     * {@link Emp}の名前クラスを返します。
     * 
     * @return Empの名前クラス
     */
    public static _EmpNames emp() {
        return new _EmpNames();
    }

    /**
     * {@link GenderDb}の名前クラスを返します。
     * 
     * @return GenderDbの名前クラス
     */
    public static _GenderDbNames genderDb() {
        return new _GenderDbNames();
    }
}
package myproject.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.unit.S2TestCase;

import static myproject.entity.EmpNames.*;

/**
 * {@link Emp}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityTestModelFactoryImpl"}, date = "2021/03/22 11:43:33")
public class EmpTest extends S2TestCase {

    private JdbcManager jdbcManager;

    /**
     * 事前処理をします。
     * 
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        include("s2jdbc.dicon");
    }

    /**
     * 識別子による取得をテストします。
     * 
     * @throws Exception
     */
    public void testFindById() throws Exception {
        jdbcManager.from(Emp.class).id(1).getSingleResult();
    }

    /**
     * genderとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_gender() throws Exception {
        jdbcManager.from(Emp.class).leftOuterJoin(gender()).id(1).getSingleResult();
    }

    /**
     * deptとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_dept() throws Exception {
        jdbcManager.from(Emp.class).leftOuterJoin(dept()).id(1).getSingleResult();
    }
}
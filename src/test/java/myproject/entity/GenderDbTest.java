package myproject.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.unit.S2TestCase;

import static myproject.entity.GenderDbNames.*;

/**
 * {@link GenderDb}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityTestModelFactoryImpl"}, date = "2021/03/22 11:43:33")
public class GenderDbTest extends S2TestCase {

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
        jdbcManager.from(GenderDb.class).id(1).getSingleResult();
    }

    /**
     * empListとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_empList() throws Exception {
        jdbcManager.from(GenderDb.class).leftOuterJoin(empList()).id(1).getSingleResult();
    }
}
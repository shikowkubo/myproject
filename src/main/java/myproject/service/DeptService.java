package myproject.service;

import java.util.List;
import javax.annotation.Generated;
import myproject.entity.Dept;

import static myproject.entity.DeptNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link Dept}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2021/03/22 11:43:32")
public class DeptService extends AbstractService<Dept> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @return エンティティ
     */
    public Dept findById(Integer id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<Dept> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }
}
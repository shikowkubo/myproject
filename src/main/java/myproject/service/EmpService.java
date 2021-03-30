package myproject.service;

import static myproject.entity.EmpNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

import java.util.List;

import javax.annotation.Generated;

import org.seasar.s2csv.csv.factory.S2CSVCtrlFactory;

import myproject.entity.Emp;

/**
 * {@link Emp}のサービスクラスです。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2021/03/22 11:43:32")
public class EmpService extends AbstractService<Emp> {

	public S2CSVCtrlFactory csvCtrlFactory;

    /**
     * 識別子でエンティティを検索します。
     *
     * @param id
     *            識別子
     * @return エンティティ
     */
    public Emp findById(Integer id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     *
     * @return エンティティのリスト
     */
    public List<Emp> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }
}
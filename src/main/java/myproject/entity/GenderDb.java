package myproject.entity;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * GenderDbエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2021/03/22 11:43:29")
public class GenderDb implements Serializable {

    private static final long serialVersionUID = 1L;

    /** idプロパティ */
    @Id
    @Column(precision = 10, nullable = false, unique = true)
    public Integer id;

    /** genderプロパティ */
    @Column(length = 255, nullable = false, unique = false)
    public String gender;

    /** empList関連プロパティ */
    @OneToMany(mappedBy = "gender")
    public List<Emp> empList;
}
package myproject.entity;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Empエンティティクラス
 *
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2021/03/22 11:43:29")
public class Emp implements Serializable {

    private static final long serialVersionUID = 1L;

    /** idプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 10, nullable = false, unique = true)
    public Integer id;

    /** empIdプロパティ */
    @Column(precision = 10, nullable = false, unique = true)
    public Integer empId;

    /** nameプロパティ */
    @Column(length = 255, nullable = false, unique = false)
    public String name;

    /** ageプロパティ */
    @Column(precision = 10, nullable = true, unique = false)
    public Integer age;

    /** genderIdプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Integer genderId;

    /** addressプロパティ */
    @Column(length = 255, nullable = true, unique = false)
    public String address;

    /** deptIdプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Integer deptId;

    /** gender関連プロパティ */
    @ManyToOne
    public GenderDb gender;

    /** dept関連プロパティ */
    @ManyToOne
    public Dept dept;
}
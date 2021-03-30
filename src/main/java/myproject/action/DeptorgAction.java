package myproject.action;



import java.util.List;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.jdbc.where.SimpleWhere;
import org.seasar.framework.beans.util.Beans;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import myproject.entity.Dept;
import myproject.form.DeptorgForm;
import myproject.service.DeptService;

public class DeptorgAction {

    private Integer limit = 5;

    private Integer count;

    public List<Dept> deptItems;

    @ActionForm
    @Resource
    protected DeptorgForm deptorgFrom;

    @Resource
    protected DeptService deptService;

    public JdbcManager jdbcManager;

    @Execute(validator = false)
    public String index() {
        SimpleWhere swh = new SimpleWhere()
            .like("deptName", deptorgFrom.deptName+"%")
        ;

        deptItems = jdbcManager.from(Dept.class).where(swh)
                                  .orderBy("deptName")
                                  .getResultList();
        count = deptItems.size();
        deptorgFrom.count = count.toString();
        deptorgFrom.totalNumber = count.toString();
        deptorgFrom.totalPageIndex = String.valueOf(count/limit);
        if (Integer.valueOf(deptorgFrom.totalNumber)%limit != 0)
        	deptorgFrom.totalPageIndex = String.valueOf(Integer.valueOf(deptorgFrom.totalPageIndex)+1);
        deptorgFrom.currentPageIndex = String.valueOf(Integer.valueOf(deptorgFrom.offset)/limit+1);

        deptItems = jdbcManager.from(Dept.class).where(swh)
                                  .orderBy("deptName")
                                  .limit(limit).offset(Integer.valueOf(deptorgFrom.offset))
                                  .getResultList();

        if (Long.valueOf(deptorgFrom.offset) + limit < count) {
          deptorgFrom.isNextPage = "true";
        } else {
          deptorgFrom.isNextPage = "false";
        }
        if (0 <= Long.valueOf(deptorgFrom.offset) - limit) {
          deptorgFrom.isPrevPage = "true";
        } else {
          deptorgFrom.isPrevPage = "false";
        }

        return "list.jsp";
    }

    @Execute(validator = false)
    public String retrieve() {
        return index();
    }

    @Execute(validator = false)
    public String nextPage() {
        Integer loffset = Integer.valueOf(deptorgFrom.offset);
        loffset += limit;
        deptorgFrom.offset = loffset.toString();
        return index();
    }

    @Execute(validator = false)
    public String lastPage() {
        count = Integer.valueOf(deptorgFrom.count);
        Integer loffset;
        if (count%limit == 0) {
        	loffset = count/limit*limit - limit;
        } else {
        	loffset = count/limit*limit;
        }
        deptorgFrom.offset = loffset.toString();
        return index();
    }

    @Execute(validator = false)
    public String prevPage() {
        Integer loffset = Integer.valueOf(deptorgFrom.offset);
        loffset -= limit;
        deptorgFrom.offset = loffset.toString();
        return index();
    }

    @Execute(validator = false)
    public String firsPage() {
        deptorgFrom.offset = "0";
        return index();
    }




    @Execute(validator = false, urlPattern = "show/{id}")
    public String show() {
        Dept entity = deptService.findById(Integer.valueOf(deptorgFrom.id));
        Beans.copy(entity, deptorgFrom).dateConverter("yyyy-MM-dd").execute();
        return "show.jsp";
    }

    @Execute(validator = false, urlPattern = "edit/{id}")
    public String edit() {
        Dept entity = deptService.findById(Integer.valueOf(deptorgFrom.id));
        Beans.copy(entity, deptorgFrom).dateConverter("yyyy-MM-dd").execute();
        return "edit.jsp";
    }

    @Execute(validator = false)
    public String create() {
        return "create.jsp";
    }

    @Execute(validator = false, urlPattern = "delete/{id}", redirect = true)
    public String delete() {
        Dept entity = Beans.createAndCopy(Dept.class, deptorgFrom).dateConverter("yyyy-MM-dd").execute();
        deptService.delete(entity);
        return "/dept/";
    }

    @Execute(input = "create.jsp", redirect = true)
    public String insert() {
        Dept entity = Beans.createAndCopy(Dept.class, deptorgFrom).dateConverter("yyyy-MM-dd").execute();
        deptService.insert(entity);
        return "/dept/";
    }

    @Execute(input = "edit.jsp", redirect = true)
    public String update() {
        Dept entity = Beans.createAndCopy(Dept.class, deptorgFrom).dateConverter("yyyy-MM-dd").execute();
        deptService.update(entity);
        return "/dept/";
    }
}
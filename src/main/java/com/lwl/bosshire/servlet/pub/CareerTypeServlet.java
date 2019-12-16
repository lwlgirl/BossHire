package com.lwl.bosshire.servlet.pub;

import com.lwl.bosshire.dao.CareerTypeMapper;
import com.lwl.bosshire.pojo.CareerType;
import com.lwl.bosshire.pojo.CareerTypeExample;
import com.lwl.bosshire.utils.ResponseUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.lwl.bosshire.config.DataSourceUtils.*;

/**
 * @author lizifan 695199262@qq.com
 * @since 2019.12.16 20:47
 * 展示所有职业分类
 */
@WebServlet("/api/public/careertype")
public class CareerTypeServlet extends HttpServlet {

    private volatile String cache;

    @Data
    @EqualsAndHashCode(callSuper = true)
    private static class CareerTypeVo extends CareerType {
        private List<CareerTypeVo> childs = new ArrayList<>();
        CareerTypeVo(CareerType t) {
            super(t.getTypeId(), t.getTypeLevel(), t.getTypeName(), t.getTypeParentId());
        }
    }

    @Override
    public void init() {
        CareerTypeMapper mapper = getMapper(CareerTypeMapper.class);
        List<CareerType> list = mapper.selectByExample(new CareerTypeExample());
        List<CareerTypeVo> result = new ArrayList<>();

        list.forEach(e -> {
            if(e.getTypeParentId() == null) {
                CareerTypeVo vo = new CareerTypeVo(e);
                dfs(list, vo);
                result.add(vo);
            }
        });

        cache = ResponseUtils.success(result);
        close();
    }


    private void dfs(List<CareerType> list, CareerTypeVo root) {
        for (CareerType type : list) {
            if(root.getTypeId().equals(type.getTypeParentId())) {
                CareerTypeVo vo = new CareerTypeVo(type);
                root.childs.add(vo);
                dfs(list, vo);
            }
        }
    }



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("application/json");
        resp.getWriter().write(cache);
    }
}

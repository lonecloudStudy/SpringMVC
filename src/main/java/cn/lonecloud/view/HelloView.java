package cn.lonecloud.view;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.Random;

/**
 * Created by lonecloud on 17/4/16.
 * 自定义视图解析器
 * @Component 将这个加入视图IOC容器中
 */
@Component
public class HelloView implements View {
    @Override
    public String getContentType() {
        return "html/text";
    }

    @Override
    public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.getWriter().print("hello myself view"+new Random());
    }
}

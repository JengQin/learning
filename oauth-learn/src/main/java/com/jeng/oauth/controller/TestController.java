package com.jeng.oauth.controller;

import com.jeng.oauth.api.R;
import io.swagger.annotations.ApiOperation;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.StringJoiner;

/**
 * The TestController
 *
 * @author JiaZheng
 * @create 2021-06-26 15:17
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {


    @ApiOperation(value = "Get测试")
    @GetMapping("/getTest")
    public R getTest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String token = request.getHeader("Authorization");
        System.out.println("token=" + token);
        if (StringUtils.isEmpty(token)) {
            System.out.println("--------------redirect login");
            response.sendRedirect("http://192.168.8.6:8005/quwan/oauth/authorize?response_type=code&client_id=dsp-iop&redirect_uri=http://localhost:8080/test/loginTest&scope=read");
        }
        return R.data("hello oauth2.0");
    }


    @ApiOperation("登录测试")
    @GetMapping("/loginTest")
    public R loginTest(HttpServletRequest request, HttpServletResponse response) {
        return R.data("登录成功");
    }
}

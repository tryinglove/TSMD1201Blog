package com.cn.tsdm.article.controller;

import com.cn.tsdm.article.service.ArticleServiceI;
import com.cn.tsdm.domain.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by xn.L on 2018/9/12.
 */
@Controller
@RequestMapping("article")
public class ArticleController {
    @Autowired
    ArticleServiceI articleService;
    @RequestMapping("/all")
    public String content(HttpServletRequest request){
        List<Article> articleList = articleService.getAllArticle();
        request.setAttribute("articleList",articleList);
        return "index";
    }
}

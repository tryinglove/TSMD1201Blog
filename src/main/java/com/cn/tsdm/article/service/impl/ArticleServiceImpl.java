package com.cn.tsdm.article.service.impl;

import com.cn.tsdm.article.dao.ArticleDao;
import com.cn.tsdm.article.service.ArticleServiceI;
import com.cn.tsdm.domain.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xn.L on 2018/9/12.
 */
@Service("articleService")
public class ArticleServiceImpl implements ArticleServiceI {
    @Autowired
    ArticleDao articledao;
    @Override
    public List<Article> getAllArticle() {
        return articledao.getAllArticle();
    }
}

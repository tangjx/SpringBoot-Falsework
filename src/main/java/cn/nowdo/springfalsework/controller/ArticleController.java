package cn.nowdo.springfalsework.controller;

import cn.nowdo.springfalsework.dao.ArticleAnnotationDao;
import cn.nowdo.springfalsework.dto.TableData;
import cn.nowdo.springfalsework.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("article/")
public class ArticleController {
    @Autowired
    private ArticleAnnotationDao articleDao;

    @RequestMapping("hello")
    @ResponseBody
    public Article hello(){
        Article article = articleDao.getById(1);
        System.out.println(article);
        return article;
    }

    @RequestMapping("getArticles")
    @ResponseBody
    public TableData getList() {
        TableData tableData = new TableData();
        List<Article> articles = articleDao.queryAll();
        List<Object> articleList = new ArrayList<>();
        for(Article article: articles) {
            articleList.add(article);
        }
        tableData.setRecordsFiltered(articles.size());
        tableData.setRecordsTotal(articles.size());
        tableData.setData(articleList);
        return tableData;
    }
}

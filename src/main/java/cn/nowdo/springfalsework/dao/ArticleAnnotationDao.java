package cn.nowdo.springfalsework.dao;

import cn.nowdo.springfalsework.entity.Article;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Mapper
@Service
public interface ArticleAnnotationDao {

    @Select("SELECT * FROM t_blog_article WHERE id = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "title", column = "title"),
            @Result(property = "summary", column = "summary"),
            @Result(property = "content", column = "content"),
            @Result(property = "tag", column = "tag"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "updateTime", column = "update_time"),
            @Result(property = "delflag", column = "delflag")
    })
    Article getById(int id);

    @Select("SELECT * FROM t_blog_article")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "title", column = "title"),
            @Result(property = "summary", column = "summary"),
            @Result(property = "content", column = "content"),
            @Result(property = "tag", column = "tag"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "updateTime", column = "update_time"),
            @Result(property = "delflag", column = "delflag")
    })
    List<Article> queryAll();

    @Insert("INSERT INTO t_blog_article(id, title, summary, content, tag, create_time, update_time, , delflag) VALUES (#{article.id}, #{article.title}, #{article.summary}, #{article.content}), #{article.tag}, #{article.createTime}, #{article.updateTime}, #{article.delflag}")
    int insertUser(Article article);

    @Delete("DELETE t_blog_article WHERE ID = #{id}")
    int deleteUserById(int id);
}
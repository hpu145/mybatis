package com.kaishengit.test;

import com.kaishengit.entity.Movie;
import com.kaishengit.mapper.MovieMapper;
import com.kaishengit.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * Created by zhangyu on 2017/10/26.
 */
public class MovieMapperTestCase {
    private SqlSession sqlSession;
    private MovieMapper movieMapper;
    @Before
    public void init() {
        sqlSession = MyBatisUtil.getSqlSession();
        movieMapper = sqlSession.getMapper(MovieMapper.class);
    }
    @After
    public void close() {
        sqlSession.close();
    }
    @Test
    public void find() {
        String title = "%西游记2%";
        List<Movie> movieList = movieMapper.find(title);
        for(Movie movie : movieList) {
            System.out.println(movie);
        }
        System.out.println(movieList.size());
    }
    @Test
    public void fingByParam() {
        Map<String,Object> searchParam = new HashMap<>();
        //searchParam.put("title","%2%");
        searchParam.put("director","%xiao%");
        List<Movie> movieList = movieMapper.findByParam(searchParam);
        for(Movie movie : movieList) {
            System.out.println(movie);
        }
    }
    @Test
    public void findByIdList() {
        List<Integer> idList = Arrays.asList(5,4);
        if(idList.size() > 0) {
            List<Movie> movieList = movieMapper.findByIdList(idList);
            for(Movie movie : movieList) {
                System.out.println(movie);
            }
        } else {
            System.out.println("参数错误");
        }

    }

}

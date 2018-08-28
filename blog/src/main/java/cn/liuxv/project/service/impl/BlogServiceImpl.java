package cn.liuxv.project.service.impl;

import cn.liuxv.project.mapper.blog.BlogMapper;
import cn.liuxv.project.po.blog.Blog;
import cn.liuxv.project.po.blog.BlogExample;
import cn.liuxv.project.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * created by liuxv on 2018/5/10
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogMapper blogMapper;

    @Override
    public void insertBlog(Blog blog) {
        blog.setCreatetime(new Date());
        blog.setAltertime(new Date());
        blogMapper.insert(blog);
    }

    @Override
    public void updateAlterTime(Integer id, Blog blog) {
    }

    @Override
    public Blog getBlogById(Integer id) {
        blogMapper.selectByPrimaryKey(id);
        return blogMapper.selectByPrimaryKey(id);
    }

    @Override
    public Blog getBlogByTitle(String title) {
        return null;
    }

    @Override
    public List<Blog> getAllBlog() {
        BlogExample blogExample = new BlogExample();
        List<Blog> blogs = blogMapper.selectByExampleWithBLOBs(blogExample);
        return blogs;
    }


    @Override
    public void editBlog(Blog blog){
        blogMapper.updateByPrimaryKey( blog );
    }
}

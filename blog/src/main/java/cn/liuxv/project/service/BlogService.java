package cn.liuxv.project.service;

import cn.liuxv.project.po.blog.Blog;

import java.util.List;

/**
 * created by liuxv on 2018/5/10
 * email:liuxver444@gmail.com
 * qq:1369058574
 */
public interface BlogService {

    //提交博文
    public void insertBlog(Blog blog);

    //更新修改时间
    public void updateAlterTime(Integer id,Blog blog);

    //通过id查找博文
    public Blog getBlogById(Integer id);

    //通过标题查找博文
    public Blog getBlogByTitle(String title);

    //寻找所有博文
    public List<Blog> getAllBlog();

    //修改博文
    public void editBlog(Blog blog);

}

package com.springboot.testapp.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.springboot.testapp.Model.Blog;

@Component
public class BlogService {
    private static List<Blog> blogs = new ArrayList<>();
    
    static{
        blogs.add(new Blog(1, "ABC", "ASLJSL"));
        blogs.add(new Blog(2, "DEF", "SJHSDPOI"));
        blogs.add(new Blog(3, "GHI", "EOIWEOPWIKS"));
        blogs.add(new Blog(4, "JKL", "TP[PRKS[]]"));blogs.add(new Blog(1, "ABC", "ASLJSL"));
        blogs.add(new Blog(5, "DEF", "SJHSDPOI"));
        blogs.add(new Blog(6, "GHI", "EOIWEOPWIKS"));
        blogs.add(new Blog(7, "JKL", "TP[PRKS[]]"));blogs.add(new Blog(1, "ABC", "ASLJSL"));
        blogs.add(new Blog(8, "DEF", "SJHSDPOI"));
        blogs.add(new Blog(9, "GHI", "EOIWEOPWIKS"));
        blogs.add(new Blog(10, "JKL", "TP[PRKS[]]"));blogs.add(new Blog(1, "ABC", "ASLJSL"));
        blogs.add(new Blog(11, "DEF", "SJHSDPOI"));
        blogs.add(new Blog(12, "GHI", "EOIWEOPWIKS"));
        blogs.add(new Blog(13, "JKL", "TP[PRKS[]]"));blogs.add(new Blog(1, "ABC", "ASLJSL"));
        blogs.add(new Blog(14, "DEF", "SJHSDPOI"));
        blogs.add(new Blog(15, "GHI", "EOIWEOPWIKS"));
        blogs.add(new Blog(16, "JKL", "TP[PRKS[]]"));
    }

    public List<Blog> getAllBlogs(){
        return blogs;
    }

    public Blog getBlogByID(int id){
        return blogs.stream().filter(e->e.getId() == id).findFirst().get();
    }


    public void createBlog(Blog blog){
        blogs.add(blog);
    }

    public Blog deleteBlogById(int id){
        Blog blog = blogs.stream().filter(e->e.getId() == id).findFirst().get();
        blogs.remove(blog);
        return blog;
    }


    public void updateBlog(Blog blog, int id){
        Blog curr_blog = blogs.stream().filter(e->e.getId() == id).findFirst().get();
        if(blog != null){
            // curr_blog.setId(blog.getId())
            curr_blog.setTitle(blog.getTitle());
            curr_blog.setDescription(blog.getDescription());
        }
    }
}

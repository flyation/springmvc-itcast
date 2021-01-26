package cn.itcast.controller;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/upload")
public class UploadController {

    /**
     * Spring MVC方式文件上传
     * Spring MVC方式文件上传需要在配置文件中配置CommonsMultipartResolver，并且依赖commons-fileupload包！！！
     * @param upload MultipartFile对象的名字必须和表单文件域的name属性相同！！！
     */
    @RequestMapping("/upload_mvc")
    public String upload_mvc(HttpServletRequest requset, MultipartFile upload) {
        System.out.println("Spring MVC方式上传...");
        // 获取上传路径
        String path = requset.getServletContext().getRealPath("/myUpload/");
        System.out.println(path);
        // 判断该路径是否存在，不存在则创建文件夹
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }

        String filename = upload.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        // 生成唯一文件名
        filename = uuid + "_" + filename;
        try {
            // 写入本地文件，一步搞定
            upload.transferTo(new File(file, filename));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "success";
    }

    /***
     * 传统方式上传使用传统方式上传文件
     * 注意：若配置了Spring MVC的CommonsMultipartResolver上传组件，则传统方法就解析不到上传的文件了，因为Spring MVC已经自动解析过一次了！！！
     * @return
     */
    @RequestMapping("/upload_old")
    public String upload_old(HttpServletRequest request) {
        System.out.println("传统方式上传...");
        // 获取上传路径
        String path = request.getServletContext().getRealPath("/myUpload/");
        System.out.println(path);
        // 判断该路径是否存在，不存在则创建文件夹
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }

        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        try {
            // 解析请求对象，拿到上传的文件
            List<FileItem> fileItems = upload.parseRequest(request);
            for (FileItem fileItem : fileItems) {
                if (!fileItem.isFormField()) {
                    // 不是普通表单项，是上传文件项
                    String filename = fileItem.getName();
                    String uuid = UUID.randomUUID().toString().replace("-", "");
                    // 生成唯一文件名
                    filename = uuid + "_" + filename;
                    // 写入本地文件
                    fileItem.write(new File(path, filename));
                    // 删除临时文件
                    fileItem.delete();
                }
            }
        } catch (FileUploadException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "success";
    }

    @RequestMapping("/test")
    public String test(HttpServletRequest requset) {
        System.out.println(requset.getServletContext());
        System.out.println(requset.getSession().getServletContext());
        String path1 = requset.getServletContext().getRealPath("/myUpload/");
        String path2 = requset.getSession().getServletContext().getRealPath("/myUpload/");
        System.out.println(path1);
        System.out.println(path2);
        System.out.println("requset.getContextPath():" + requset.getContextPath());
        System.out.println("requset.getServletContext().getContextPath():" + requset.getServletContext().getContextPath());
        System.out.println("requset.getServletPath():" + requset.getServletPath());
        return "success";
    }
}

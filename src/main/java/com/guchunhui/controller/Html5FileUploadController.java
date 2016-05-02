package com.guchunhui.controller;

import com.guchunhui.model.UpLoadedFile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * Created by gch on 16-4-28.
 */
@Controller
public class Html5FileUploadController {
    @RequestMapping(value="/html5")
    public String input(){
        return "html5";
    }

    @RequestMapping(value = "/file_upload")
    public void saveFile(HttpServletRequest request, @ModelAttribute UpLoadedFile upLoadedFile, BindingResult bindingResult, Model model){
        MultipartFile multipartFile = upLoadedFile.getMultipartFile();
        String fileName = multipartFile.getOriginalFilename();
        if(!fileName.isEmpty()){
            try{
                File file = new File(request.getServletContext().getRealPath("/file"),fileName);
                multipartFile.transferTo(file);
            }catch(IOException e){
                e.printStackTrace();
            }
        }

    }
}

/*
 * Copyright (c) 2013 北京海达网畅信息技术开发有限公司（www.hadventure.com）. All rights reserved.
 * 
 * HADVENTURE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.hadventure.zonlolo.storage.web;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.hadventure.zonlolo.storage.StorageConstant;
import com.hadventure.zonlolo.storage.exception.EntityNotFoundException;
import com.hadventure.zonlolo.storage.exception.NotFoundException;
import com.hadventure.zonlolo.storage.service.StorageService;
import com.mongodb.gridfs.GridFSDBFile;

/**
 * Restful controller exposes REST api for image storage.
 * 
 * @author <a href="mailto:zhigang.pi@hadventure.com">pprun</a>
 */
@Controller
public class StorageController {

    private static final Logger logger = LoggerFactory.getLogger(StorageController.class);
    public static final String DEFAULT_IMAGE_TYPE = StorageConstant.MIME_IMAGE_JPG;
    public static final String DEFAULT_AUDIO_TYPE = StorageConstant.MIME_AUDIO_WAV;
    public static final String DEFAULT_ARCHIVE_TYPE = StorageConstant.MIME_ARCHIVE_ZIP;
    public static final String DEFAULT_EXCEL_TYPE = StorageConstant.MIME_EXCEL;
    private StorageService storageService;
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
    @Resource
    @Required
    @Qualifier("blobStorageServiceImpl")
    public void setStorageService(StorageService storageService) {
        this.storageService = storageService;
    }

    /**
     * http://localhost:9080/storage/storage/image/0bfdf0fa03e6e53779171f5931b19d4e.jpg
     * 59fc497c338f2515af06b876
     * @param name59fc497c338f2515af06b876
     * @param contentType
     * @param resp
     */
    @RequestMapping(value = "/image/{name:.+}", method = RequestMethod.GET)
    // :.+ 解决 .jpg 扩展名问题
    public void getImage(
            @PathVariable String name,
            @RequestParam(required = false, defaultValue = DEFAULT_IMAGE_TYPE) String contentType,
            HttpServletResponse resp) {

        logger.debug("Incomming REST request getImage with name={}", name);
        retrieveBinaryContent(resp, contentType, name, false);

        logger.debug("Incomming REST request getImage with name={} DONE!", name);
    }

    /**
     * http://localhost:9080/storage/storage/audio/0bfdf0fa03e6e53779171f5931b19d4e.wav
     * 
     * @param name
     * @param contentType
     * @param resp
     */
    @RequestMapping(value = "/excel/{name:.+}", method = RequestMethod.GET)
    // :.+ 解决 .wav 扩展名问题
    public void getExcel(
            @PathVariable String name,
            @RequestParam(required = false, defaultValue = DEFAULT_EXCEL_TYPE) String contentType,
            HttpServletResponse resp) {

        logger.debug("Incomming REST request getExcel with name={}", name);
        retrieveBinaryContent(resp, contentType, name, false);

        logger.debug("Incomming REST request getExcel with name={} DONE!", name);
    }
    
    @RequestMapping(value = "/get/{name:.+}", method = RequestMethod.GET)
    // :.+ 解决 .wav 扩展名问题
    public void get(
            @PathVariable String name,
            @RequestParam(required = false) String contentType,
            HttpServletResponse resp) {

        logger.debug("Incomming REST request getExcel with name={}", name);
        String ext = getExt(name);
        contentType = StorageConstant.MimetypesFileTypeMap.get(ext);
        retrieveBinaryContent(resp, contentType, name, false);

        logger.debug("Incomming REST request getExcel with name={} DONE!", name);
    }
    
    /**
     * http://localhost:9080/storage/storage/audio/0bfdf0fa03e6e53779171f5931b19d4e.wav
     * 
     * @param name
     * @param contentType
     * @param resp
     */
    @RequestMapping(value = "/audio/{name:.+}", method = RequestMethod.GET)
    // :.+ 解决 .wav 扩展名问题
    public void getAudio(
            @PathVariable String name,
            @RequestParam(required = false, defaultValue = DEFAULT_AUDIO_TYPE) String contentType,
            HttpServletResponse resp) {

        logger.debug("Incomming REST request getAudio with name={}", name);
        retrieveBinaryContent(resp, contentType, name, false);

        logger.debug("Incomming REST request getAudio with name={} DONE!", name);
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,String> uploadImage(@RequestParam("name") String name,
            @RequestParam("file") MultipartFile file, @RequestParam(value = "contentType", required = false) String contentType) {
    	Map<String,String> map = new HashMap<String,String>();
    	String ext = "";
    	if(StringUtils.isEmpty(contentType)) {
    		String originalFilename=file.getOriginalFilename();
    		ext = getExt(originalFilename);
    		contentType = StorageConstant.MimetypesFileTypeMap.get(ext);
    		if(StringUtils.isEmpty(contentType)) {
    			contentType = StorageConstant.MimetypesFileTypeMap.get(".*");
    		}
    	}
    	
    	if(StringUtils.isEmpty(name)) {
    		name = sdf.format(System.currentTimeMillis()).concat(UUID.randomUUID().toString().replaceAll("\\-", "")).concat(ext);
    	}
    	
        logger.debug("Incomming REST request uploadImage with name={}", name);

        if (validate(file)) {
            try (InputStream is = file.getInputStream()) {
            	String saveFile = storageService.save(is, contentType, name);
       		 	logger.debug("upload file {} to {}", name, saveFile);
                logger.debug("Incomming REST request uploadImage with name={} SUCCESS!", name);
            } catch (Exception e) {
            	e.printStackTrace();
                logger.error("upload file {} failed", name, e);
                map.put("status", "99999999");
                map.put("message", "上传失败");
                return map;
            }
            map.put("status", "00000000");
            map.put("message", "上传成功");
            map.put("name", name);
            map.put("url", "http://photo.greathiit.com/get/".concat(name));
            return map;

        } else {
            logger.info("Incomming REST request uploadImage with name={} FAILED!", name);
            map.put("status", "99999999");
            map.put("message", "上传失败");
            return map;
        }
    }

    /**
     * http://localhost:9080/storage/storage/archive/blabla.zip
     * 
     * @param name
     * @param contentType
     * @param resp
     */
    @RequestMapping(value = "/archive/{name:.+}", method = RequestMethod.GET)
    // :.+ 解决 .zip 扩展名问题
    public void downloadArchive(
            @PathVariable String name,
            @RequestParam(required = false, defaultValue = DEFAULT_ARCHIVE_TYPE) String contentType,
            HttpServletResponse resp) {

        logger.debug("Incomming REST request downloadArchive with name={}", name);
        retrieveBinaryContent(resp, contentType, name, true);

        logger.debug("Incomming REST request downloadArchive with name={} DONE!", name);
    }

    private boolean validate(MultipartFile file) {
        if (file.getSize() == 0) {
            logger.info("file is empty.", file);

            return false;
        }

        return true;
    }

    private void retrieveBinaryContent(HttpServletResponse resp, String contentType, String name, boolean asAttachment) {
        resp.setContentType(contentType);

        // if need to save as attachment
        if (asAttachment) {
            resp.setHeader("Content-Disposition", "attachment;filename=" + name);
        }

        GridFSDBFile blobForOutput = storageService.getByFilename(name);
        if (blobForOutput == null) {
            throw new EntityNotFoundException(name, "The file not found for name: " + name);
        }

        try (InputStream in = blobForOutput.getInputStream();
                ServletOutputStream out = resp.getOutputStream()) {
            out.write(IOUtils.toByteArray(in));
            out.flush();
        } catch (Exception e) {
            logger.error("Exception while retrieve the image: {}", name, e);
            throw new EntityNotFoundException(name, "The file not found", e);
        }
    }

    /**
     * For test the implementation of RestResponseEntityExceptionHandler. <code>
     * curl -H 'Content-Type: application/json' -H 'Accept: application/json' -H 'Accept-Charset: UTF-8' 'http://localhost:9080/storage/storage/test/foo'
     * </code>
     * 
     * @param name
     * @return
     */
    @RequestMapping(value = "/test/{name}", method = RequestMethod.GET)
    public String test(@PathVariable String name) {
        logger.info("Incoming request: {}", name);

        if (name.length() > 10) {
            throw new NotFoundException(name, "The request object can not be found");
        } else {
            return name;
        }

    }
    
    private String getExt(String filename) {   
        if ((filename != null) && (filename.length() > 0)) {   
            int dot = filename.lastIndexOf('.');   
            if ((dot >-1) && (dot < (filename.length() - 1))) {   
                return filename.substring(dot);   
            }   
        }   
        return filename;   
    }  
   
}

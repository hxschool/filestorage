/*
 * Copyright (c) 2013 北京海达网畅信息技术开发有限公司（www.hadventure.com）. All rights reserved.
 * 
 * HADVENTURE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.hadventure.zonlolo.storage.service;

import com.mongodb.gridfs.GridFSDBFile;
import java.io.InputStream;
import java.util.List;

/**
 * A store service for read or write GridFS file from or to MongoDB.
 * 
 * @author <a href="mailto:zhigang.pi@hadventure.com">pprun</a>
 */
public interface StorageService {
    /**
     * 将指定的内容类型的数据流保存指定的文件中.
     * 
     * @param inputStream
     * @param contentType
     * @param filename
     * @return the Id of the file
     */
    String save(InputStream inputStream, String contentType, String filename);

    /**
     * 删除给定的文件.
     * 
     * @param filename
     * @return
     */
    void delete(String filename);

    /**
     * 读取给定的文件.
     * 
     * @param filename
     * @return
     */
    GridFSDBFile getByFilename(String filename);

    /**
     * 返回所有的文件列表.
     * 
     * @return
     */
    List<GridFSDBFile> listFiles();

    /**
     * 按文件对象的 id 查找文件.
     * 
     * @param id
     * @return
     */
    GridFSDBFile get(String id);

    /**
     * check file exists by md5
     * 
     * @param md5
     * @return
     */
    boolean exists(String md5);
}

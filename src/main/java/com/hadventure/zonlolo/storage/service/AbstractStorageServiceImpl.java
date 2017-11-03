/*
 * Copyright (c) 2013 北京海达网畅信息技术开发有限公司（www.hadventure.com）. All rights reserved.
 * 
 * HADVENTURE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.hadventure.zonlolo.storage.service;

import com.hadventure.zonlolo.storage.repository.StorageRepository;
import com.mongodb.gridfs.GridFSDBFile;
import java.io.InputStream;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A store service for read or write GridFS file from or to MongoDB.
 * 
 * @author <a href="mailto:zhigang.pi@hadventure.com">pprun</a>
 */
public abstract class AbstractStorageServiceImpl {

    private static final Logger logger = LoggerFactory.getLogger(AbstractStorageServiceImpl.class);

    /**
     * 将指定的内容类型的数据流保存指定的文件中.
     * 
     * @param inputStream
     * @param contentType
     * @param filename
     * @return the Id of the file
     */
    public String save(StorageRepository storageRepository, InputStream inputStream, String contentType, String filename) {
        return storageRepository.save(inputStream, contentType, filename);
    }

    /**
     * 删除给定的文件.
     * 
     * @param filename
     * @return
     */
    public void delete(StorageRepository storageRepository, String filename) {
        storageRepository.delete(filename);
    }

    /**
     * 读取给定的文件.
     * 
     * @param filename
     * @return
     */
    public GridFSDBFile getByFilename(StorageRepository storageRepository, String filename) {
        return storageRepository.getByFilename(filename);
    }

    /**
     * 返回所有的文件列表.
     * 
     * @return
     */
    public List<GridFSDBFile> listFiles(StorageRepository storageRepository) {
        return storageRepository.listFiles();
    }

    /**
     * 按文件对象的 id 查找文件.
     * 
     * @param id
     * @return
     */
    public GridFSDBFile get(StorageRepository storageRepository, String id) {
        return storageRepository.get(id);
    }

    public boolean exists(StorageRepository storageRepository, String md5) {
        return storageRepository.exists(md5);
    }
}

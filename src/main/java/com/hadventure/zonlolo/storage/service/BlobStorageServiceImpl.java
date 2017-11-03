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
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

/**
 * A store service for read or write GridFS file from or to MongoDB.
 * 
 * @author <a href="mailto:zhigang.pi@hadventure.com">pprun</a>
 */
@Service
public class BlobStorageServiceImpl extends AbstractStorageServiceImpl implements StorageService {

    private StorageRepository blobStorageRepository;

    @Resource
    @Required
    @Qualifier("blobStorageRepositoryImpl")
    public void setBlobStorageRepository(StorageRepository blobStorageRepository) {
        this.blobStorageRepository = blobStorageRepository;
    }

    @Override
    public String save(InputStream inputStream, String contentType, String filename) {
        return save(blobStorageRepository, inputStream, contentType, filename);
    }

    @Override
    public void delete(String filename) {
        delete(blobStorageRepository, filename);
    }

    @Override
    public GridFSDBFile getByFilename(String filename) {
        return getByFilename(blobStorageRepository, filename);
    }

    @Override
    public List<GridFSDBFile> listFiles() {
        return listFiles(blobStorageRepository);
    }

    @Override
    public GridFSDBFile get(String id) {
        return get(blobStorageRepository, id);
    }

    @Override
    public boolean exists(String md5) {
        return exists(blobStorageRepository, md5);
    }
}

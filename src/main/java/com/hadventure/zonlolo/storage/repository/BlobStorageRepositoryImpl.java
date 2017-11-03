/*
 * Copyright (c) 2013 北京海达网畅信息技术开发有限公司（www.hadventure.com）. All rights reserved.
 * 
 * HADVENTURE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.hadventure.zonlolo.storage.repository;

import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import java.io.InputStream;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.data.mongodb.gridfs.GridFsOperations;
import org.springframework.stereotype.Repository;

/**
 * A {@link Repository} implementation for read or write {@link GridFS} in <a
 * href="http://docs.mongodb.org/manual/core/gridfs/">MongoDb GridFs</a>.
 * 
 * @author <a href="mailto:zhigang.pi@hadventure.com">pprun</a>
 */
@Repository
public class BlobStorageRepositoryImpl extends AbstractStorageRepositoryImpl implements StorageRepository {

    private GridFsOperations blobOperations;

    @Resource(name = "blobGridFsTemplate")
    @Required
    public void setBlobOperations(GridFsOperations blobOperations) {
        this.blobOperations = blobOperations;
    }

    @Override
    public String save(InputStream inputStream, String contentType, String filename) {
        return save(blobOperations, inputStream, contentType, filename);
    }

    @Override
    public void delete(String filename) {
        delete(blobOperations, filename);
    }

    @Override
    public GridFSDBFile getByFilename(String filename) {
        return getByFilename(blobOperations, filename);
    }

    @Override
    public List<GridFSDBFile> listFiles() {

        return listFiles(blobOperations);
    }

    @Override
    public GridFSDBFile get(String id) {
        return get(blobOperations, id);
    }

    @Override
    public boolean exists(String md5) {
        return exists(blobOperations, md5);
    }
}

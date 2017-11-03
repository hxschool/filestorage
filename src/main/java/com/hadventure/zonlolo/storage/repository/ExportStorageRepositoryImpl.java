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
public class ExportStorageRepositoryImpl extends AbstractStorageRepositoryImpl implements StorageRepository {

    private GridFsOperations exportOperations;

    @Resource(name = "exportGridFsTemplate")
    @Required
    public void setPkgOperations(GridFsOperations pkgOperations) {
        this.exportOperations = pkgOperations;
    }

    @Override
    public String save(InputStream inputStream, String contentType, String filename) {
        return save(exportOperations, inputStream, contentType, filename);
    }

    @Override
    public void delete(String filename) {
        delete(exportOperations, filename);
    }

    @Override
    public GridFSDBFile getByFilename(String filename) {
        return getByFilename(exportOperations, filename);
    }

    @Override
    public List<GridFSDBFile> listFiles() {

        return listFiles(exportOperations);
    }

    @Override
    public GridFSDBFile get(String id) {
        return get(exportOperations, id);
    }

    @Override
    public boolean exists(String md5) {
        return exists(exportOperations, md5);
    }
}

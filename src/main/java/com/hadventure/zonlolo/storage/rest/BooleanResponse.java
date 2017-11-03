/*
 * Copyright (c) 2013 北京海达网畅信息技术开发有限公司（www.hadventure.com）. All rights reserved.
 * 
 * HADVENTURE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.hadventure.zonlolo.storage.rest;

/**
 * A rest response includes only one boolean field.
 * 
 * @author <a href="mailto:zhigang.pi@hadventure.com">pprun</a>
 */
public class BooleanResponse extends AbstractStringableEntity {

    private Boolean result;

    public BooleanResponse() {}

    public BooleanResponse(Boolean result) {
        this.result = result;
    }

    /**
     * @return the result
     */
    public Boolean getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(Boolean result) {
        this.result = result;
    }
}

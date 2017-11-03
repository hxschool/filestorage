/*
 * Copyright (c) 2013 北京海达网畅信息技术开发有限公司（www.hadventure.com）. All rights reserved.
 * 
 * HADVENTURE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.hadventure.zonlolo.storage.exception;

/**
 * A RuntimeException defined for no record was found with a <b>service</b> and freestyle message.
 * The errorCode can be used by the client to interpret a particular error.
 * 
 * @author <a href="mailto:zhigang.pi@hadventure.com">pprun</a>
 */
public class EntityNotFoundException extends RuntimeException {

    private String entity;

    /**
     * Creates a new instance of <code>EntityNotFoundException</code> without detail message.
     */
    public EntityNotFoundException() {}

    /**
     * Constructs an instance of <code>EntityNotFoundException</code> with the specified detail
     * message.
     * 
     * @param message the detail message.
     */
    public EntityNotFoundException(String entity, String message) {
        super(message);
        this.entity = entity;
    }

    public EntityNotFoundException(String entity, String message, Throwable cause) {
        super(message, cause);
        this.entity = entity;
    }

    public String getEntity() {
        return entity;
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append(this.getClass().getName()).append("[");
        buffer.append("entity=").append(entity);
        buffer.append(", message=").append(getMessage());
        buffer.append("]");
        return buffer.toString();
    }
}

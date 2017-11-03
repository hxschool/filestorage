/*
 * Copyright (c) 2013 北京海达网畅信息技术开发有限公司（www.hadventure.com）. All rights reserved.
 * 
 * HADVENTURE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.hadventure.zonlolo.storage.rest;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * This is a base class have a {@code toString} using {@link ToStringBuilder}.
 * 
 * @author <a href="mailto:zhigang.pi@hadventure.com">pprun</a>
 */
public abstract class AbstractStringableEntity {

    @Override
    public String toString() {
        // just a bit of lazy here
        return ToStringBuilder.reflectionToString(this);
    }
}

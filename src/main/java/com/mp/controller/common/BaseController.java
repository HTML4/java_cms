package com.mp.controller.common;

import org.springframework.beans.factory.annotation.Value;

public abstract class BaseController {
    @Value("${adminPath}")
    protected String adminPath;
}

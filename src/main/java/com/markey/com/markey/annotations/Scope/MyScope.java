package com.markey.com.markey.annotations.Scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MyScope {
}

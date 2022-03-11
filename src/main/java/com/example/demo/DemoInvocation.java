package com.example.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoInvocation {

    @Before("execution(* *..*Service.*(..))")
    public void startLog(JoinPoint jp) {
        //開始ログを出力
        String signature = jp.getSignature().toString();
        System.out.println("開始" + signature);
    }
}

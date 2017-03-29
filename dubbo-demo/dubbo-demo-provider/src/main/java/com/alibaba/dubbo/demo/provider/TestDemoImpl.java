/*
 * Copyright 1999-2011 Alibaba Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.dubbo.demo.provider;

import com.alibaba.dubbo.demo.TestDemo;
import com.alibaba.dubbo.rpc.RpcContext;

public class TestDemoImpl implements TestDemo {

    public String sayHello(String name) {
        System.out.println("TestDemoImplTestDemoImplTestDemoImplTestDemoImpl");
        return "Hello " + name + ", response form provider: " + RpcContext.getContext().getLocalAddress();
    }

    public String sayHello2(String name) {
        return null;
    }

}
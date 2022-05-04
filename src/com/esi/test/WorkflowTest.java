package com.esi.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class WorkflowTest {



    public static void main(String args[]) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        WorkflowTest workflowTest = new WorkflowTest();
        workflowTest.test();

    }

    private void test() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ValidationTest validationTest = new ValidationTest();
        Method method = validationTest.getClass().getMethod("test1", Map.class);
        Map<String, String> parameters = new HashMap<>();
        parameters.put("claimId","1223441");
        parameters.put("roleType", "nitesh");
        method.invoke(validationTest, parameters);
    }


}

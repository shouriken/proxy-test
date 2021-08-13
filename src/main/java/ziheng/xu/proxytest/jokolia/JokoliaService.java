package ziheng.xu.proxytest.jokolia;

import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedOperationParameter;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@ManagedResource(objectName = "bean:name=JokoliaService", description = "jokolia type parser test")
public class JokoliaService {

    // 可以用postman 调用下面的URL
    //localhost:9096/man/jolokia/exec/bean:name=JokoliaService/test/{date}
    @ManagedOperation
    @ManagedOperationParameter(name = "date", description = "date")
    public void test(LocalDate date){
        System.out.println(date);
    }
}

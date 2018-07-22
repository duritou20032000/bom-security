package com.mr.demo.web.async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MockQueue {
    private Logger logger = LoggerFactory.getLogger(getClass());

    private String placeOrder;
    private String completeOrder;

    public String getPlaceOrder() {
        return placeOrder;
    }

    public void setPlaceOrder(String placeOrder) throws InterruptedException {
        new Thread(()->{
            logger.info("接到下单请求");
            try {
                Thread.sleep(1000);
                this.placeOrder = placeOrder;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            logger.info("下单请求处理完毕");

        }).start();
    }

    public String getCompleteOrder() {
        return completeOrder;
    }

    public void setCompleteOrder(String completeOrder) {
        this.completeOrder = completeOrder;
    }
}

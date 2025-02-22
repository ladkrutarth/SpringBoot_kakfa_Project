package com.SpringBoot_kakfa_Project.SpringBoot_kakfa;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "Krutarth",
            groupId = "groupid"
    )
    void listener(String data)
    {
        System.out.println("Listener received:" + data);
    }

}

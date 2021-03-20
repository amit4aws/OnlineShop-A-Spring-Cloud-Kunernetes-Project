package com.onlineshop.shoppingtcart;

import com.onlineshop.shoppingtcart.config.RibbonConfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonAutoConfiguration;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.EnableFeignClients;



@RibbonClients(defaultConfiguration = RibbonConfiguration.class)
@AutoConfigureAfter(RibbonAutoConfiguration.class)
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ShoppingCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartApplication.class, args);
	}

}

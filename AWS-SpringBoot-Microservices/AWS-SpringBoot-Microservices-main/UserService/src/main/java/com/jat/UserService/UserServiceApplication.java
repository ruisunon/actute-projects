package com.jat.UserService;

import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@OpenAPIDefinition(info = @Info(title = "Microservices-DEMO => The User Microservices. Please use drop down [TOP Right] for other business microservices or Scroll Down & click on arrow next to the controller to test current Micro services api " , version = "3.0", description = "This is among 7 microservices build for microservice architecture demo along with 2 databses (postgres & mongo)deployed on AWS. \n\n It comprises of **java 17, spring version 2.7.7, # [EUREKA SERVER](!http://servi-loadb-1m010cvxc8v81-1110713425.us-east-2.elb.amazonaws.com/), CONFIG-SERVER, [API-GATWAY](!http://docum-loadb-1afl8t2ep2lek-776461917.us-east-2.elb.amazonaws.com/swagger-ui.html), OpenAPI, HEALTH CHECK, [SINGLE DOCUMENT SERVER](!http://docum-loadb-1afl8t2ep2lek-776461917.us-east-2.elb.amazonaws.com/swagger-ui.html), JWT, CIRCUIT-BREAKER, RATE LIMITERS, RETRY, FEIGN-CLIENT, SPRING SECURITY & OKTA AUTH**. \n\nIt contains Hotel Information along with ratings & other criteria. This demo show cause all latest strategies in microservices. Please contact **Praveen** for demo. The API also implements **features like [Enhanced Resilence](!https://resilience4j.readme.io/docs),"+
		" [ratelimiters](!https://resilience4j.readme.io/docs/ratelimiter), [circuitbreakers](!https://resilience4j.readme.io/docs/circuitbreaker) and decalarative [Feign client](!https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-feign.html)**. We are also Implementing protection by **[Okta Auth](!https://developer.okta.com/docs/reference/api/authn/), [Spring Security](!https://spring.io/projects/spring-security)  & [JSON Web Based Tokens](!https://www.baeldung.com/spring-security-oauth-jwt)**. Please find our **[Registry Server](!http://servi-loadb-1m010cvxc8v81-1110713425.us-east-2.elb.amazonaws.com/)** here & explore our other API for [Hotel Service](!http://hotel-loadb-k8aiva487gpr-737544558.us-east-2.elb.amazonaws.com/swagger-ui/index.html) & [Ratings](!http://ratin-loadb-i6an5c4kpdz0-2054147921.us-east-2.elb.amazonaws.com/swagger-ui/index.html) here"))
// @ApiOperation("It is prepared with java 17, spring version 2.7.7 enabled with EUREKA SERVER, CONFIG-SERVER,API-GATWAY, DOCUMENT SERVER & SPING SECURITY with OKTA AUTH. Complete Source Code for all of the services is avaiable at [Source Code](!https://github.com/My-Java-Repos/SpringMicroServicesExample)")
public class UserServiceApplication {


	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}

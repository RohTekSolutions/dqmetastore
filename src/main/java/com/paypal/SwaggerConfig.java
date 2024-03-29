package com.paypal;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

	
	@Bean
    public Docket produceApi(){
    return new Docket(DocumentationType.SWAGGER_2)
    .apiInfo(apiInfo())
    .select()
    .apis(RequestHandlerSelectors.basePackage("com.paypal"))
    .paths(paths())
    .build();
  
    
}
	private ApiInfo apiInfo() {
	    return new ApiInfoBuilder()
	    .title("Polaris")
	    .description("This page displays all the Polaris metastore related api's.")
	    .version("0.1.0")
	    .build();
	}
	
	private Predicate<String> paths() {
		    return Predicates.and(
		    //PathSelectors.regex("/.*"),
		    PathSelectors.any(),
		    Predicates.not(PathSelectors.regex("/error.*"))) ;
		    }
	
	
	
	/*
	 * @Bean SecurityContext securityContext() { return SecurityContext.builder()
	 * .securityReferences(defaultAuth()) .forPaths(PathSelectors.any()) .build(); }
	 * 
	 * List<SecurityReference> defaultAuth() { AuthorizationScope authorizationScope
	 * = new AuthorizationScope("global", "accessEverything"); AuthorizationScope[]
	 * authorizationScopes = new AuthorizationScope[1]; authorizationScopes[0] =
	 * authorizationScope; return Lists.newArrayList( new SecurityReference("JWT",
	 * authorizationScopes)); } private ApiKey apiKey() { return new ApiKey("JWT",
	 * "Authorization", "header"); }
	 */
	
}

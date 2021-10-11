package com.moon.mock.config;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class ApplicationConfig {

	@Bean
	public CorsFilter corsFilter() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration allConfig = getCorsConfiguration();
		source.registerCorsConfiguration("/**", allConfig);
		return new CorsFilter(source);
	}

	protected CorsConfiguration getCorsConfiguration() {
		final CorsConfiguration config = new CorsConfiguration();
		config.setAllowedMethods(Stream.of(HttpMethod.GET, HttpMethod.HEAD, HttpMethod.POST, HttpMethod.OPTIONS)
				.map(Enum::name).collect(Collectors.toList()));
		config.setAllowCredentials(true);
		config.addAllowedOrigin("*");
		config.addAllowedHeader("*");
		config.addAllowedMethod("*");
		config.setMaxAge(7 * 24 * 60 * 60L); // 设置跨域check缓存时间
		return config;
	}

//    @Bean
//    public FilterRegistrationBean mockMetaDataFilter() {
//        FilterRegistrationBean registration = new FilterRegistrationBean();
//        registration.setFilter(new MockMetaDataFilter());
//        registration.addUrlPatterns(MOCK_PREFIX + FILTER_PATH_PATTERN);
//        registration.setName("mockMetaDataFilter");
//        registration.setOrder(2);
//        return registration;
//    }
}

package com.example.lucilor;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.lucilor.beans.AccountInformation;
import com.example.lucilor.services.AccountInformationService;

@SpringBootApplication
public class LucilorApplicationConfig {
//
//	String url = "jdbc:mysql://localhost:3306/project2";
//	String user = "root";
//	String password = "root";
//	String driver = "com.mysql.cj.jdbc.Driver";

	public static void main(String[] args) {
		SpringApplication.run(LucilorApplicationConfig.class, args);
		//ApplicationContext context = new AnnotationConfigApplicationContext(SpringDataJpaConfig.class);
		//AccountInformationService service = context.getBean(AccountInformationService.class);
	}
//
//	@Bean
//	public DataSource datasource() {
//		DriverManagerDataSource dataSource = new DriverManagerDataSource(url, user, password);
//		dataSource.setDriverClassName(driver);
//		return dataSource;
//	}
//
//	@Bean
//	public PlatformTransactionManager transactionManager() {
//		return new DataSourceTransactionManager(datasource());
//	}
//
//	@Bean
//	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//		LocalContainerEntityManagerFactoryBean emfBean = new LocalContainerEntityManagerFactoryBean();
//		emfBean.setDataSource(datasource());
//		emfBean.setPackagesToScan("com.skillstorm.beans");
//
//		JpaVendorAdapter hibernate = new HibernateJpaVendorAdapter();
//		emfBean.setJpaVendorAdapter(hibernate);
//
//		Properties props = new Properties();
//		props.setProperty("hibernate.show_sql", "true");
//		props.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
//		emfBean.setJpaProperties(props);
//
//		return emfBean;
//	}
//
//	@Bean
//	public PersistenceExceptionTranslationPostProcessor persistenceExceptionTranslationPostProcessor() {
//		return new PersistenceExceptionTranslationPostProcessor();
//	}

}

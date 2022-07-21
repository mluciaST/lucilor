package com.example.lucilor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

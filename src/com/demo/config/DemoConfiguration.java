package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@EnableScheduling
@ComponentScan(basePackages="com.demo.task")
public class DemoConfiguration {

	public DemoConfiguration() {
		System.out.println("DemoConfiguration DemoConfiguration() ...");
	}

	@Bean
	public AsyncTaskExecutor executor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(7);
        executor.setMaxPoolSize(42);
        executor.setQueueCapacity(11);
        executor.setThreadNamePrefix("demoExecutor-");
        return executor;
	}

//	/**
//	 * 定时任务使用的线程池
//	 */
//	@Bean
//	public ThreadPoolTaskScheduler scheduler() {
//		ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
//		scheduler.setPoolSize(10);
//		scheduler.setThreadNamePrefix("demoScheduler-");
//		scheduler.setAwaitTerminationSeconds(600);
//		scheduler.setWaitForTasksToCompleteOnShutdown(true);
//		return scheduler;
//	}

}

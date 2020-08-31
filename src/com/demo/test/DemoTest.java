package com.demo.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.config.DemoConfiguration;

public class DemoTest {
	public static void main(String[] args) throws Exception {
//		Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
//		scheduler.start();
//		JobDetail jobDetail = JobBuilder.newJob(DemoJob.class)
//				.withIdentity("DemoJob", "DemoGroup")
//				.usingJobData("name", "sam")
//				.usingJobData("age", "18")
//				.build();
//		CronTrigger trigger = (CronTrigger) TriggerBuilder.newTrigger()
//				.withIdentity("DemoTrigger", "DemoGroup")
//				.withSchedule(CronScheduleBuilder.cronSchedule("*/2 * * * * ?"))
//				.startNow().build();
//		scheduler.scheduleJob(jobDetail, trigger);
//		Thread.sleep(30000);
//		scheduler.shutdown();

//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfiguration.class);
//		Object bean = context.getBean("demo");
//		System.out.println(bean);
		Thread.sleep(1300000);
		context.close();
	}
}

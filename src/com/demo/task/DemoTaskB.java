package com.demo.task;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

public class DemoTaskB {

	@Scheduled(cron = "0/5 * * * * ?")
	@Async("executor")
	public void taskB() {
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(Thread.currentThread().getName() + " >>> " + sdf.format(new Date()) + "*********B任务每5秒执行一次进入测试");
		System.out.println(Thread.currentThread().getName() + " >>> " + sdf.format(new Date()) + "*********B任务执行完毕");
	}
}
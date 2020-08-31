package com.demo.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobKey;

public class DemoJob implements Job {
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		JobKey key = context.getJobDetail().getKey();
		JobDataMap dataMap = context.getJobDetail().getJobDataMap();
		System.err.println("Instance " + key + ": name = " + dataMap.getString("name") + ", age = " + dataMap.getString("age"));
	}
}

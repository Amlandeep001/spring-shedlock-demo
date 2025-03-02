package com.java.shedlock.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;

@Service
public class SchedulerService
{
	@Scheduled(fixedRate = 2000)
	@SchedulerLock(name = "uniqueTaskName", lockAtMostFor = "5m", lockAtLeastFor = "2s") // Executes every 2 seconds
	public void executeTask()
	{
		// report generation
		// sending notification
		System.out.println("Executing task at: " + new Date());
	}
}

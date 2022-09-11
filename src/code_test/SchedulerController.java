package code_test;

import java.util.Date;

public class SchedulerController {
	@Scheduled(cron = "0 0/20 * * * ?")
	public void checkTwalletTransactions() {
		System.out.println("Job executed at : " + new Date());
		// studentService.deletePdfs();

	}
}

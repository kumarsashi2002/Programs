import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
class Job
{
	public int taskID, deadline, profit;

	public Job(int taskID, int deadline, int profit)
	{
		this.taskID = taskID;
		this.deadline = deadline;
		this.profit = profit;
	}
}

class JobSequencing{
	public static void scheduleJobs(List<Job> jobs, int T)
	{
		int profit = 0;
		int[] slot = new int[T];
		Arrays.fill(slot, -1);
		Collections.sort(jobs, (a, b) -> b.profit - a.profit);
		for (Job job: jobs)
		{
			// search for the next free slot and map the task to that slot
			for (int j = job.deadline - 1; j >= 0; j--)
			{
				if (j < T && slot[j] == -1)
				{
					slot[j] = job.taskID;
					profit += job.profit;
					break;
				}
			}
		}

		// print the scheduled jobs
		System.out.println("The scheduled jobs are " +
				Arrays.stream(slot).filter(val -> val != -1).boxed()
						.collect(Collectors.toList()));

		// print total profit that can be earned
		System.out.println("The total profit earned is " + profit);
	}

	public static void main(String[] args)
	{
		List<Job> jobs = Arrays.asList(
				new Job(1, 9, 15), new Job(2, 2, 2),
				new Job(3, 5, 18), new Job(4, 7, 1),
				new Job(5, 4, 25), new Job(6, 2, 20),
				new Job(7, 5, 8), new Job(8, 7, 10),
				new Job(9, 4, 12), new Job(10, 3, 5)
		);
		final int T = 15;
		scheduleJobs(jobs, T);
	}
}
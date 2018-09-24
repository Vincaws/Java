package PCB;

import java.util.Scanner;

class pcb_Structure {
	public String name;
	public int runTime;
	public int priority;
	public char state;
}

class Pcb_main {
	public int pcb_Interlizer() {
		int N;
		Scanner in = new Scanner(System.in);
		System.out.println("Tell me How many Pcb You guys want:");
		N = in.nextInt();
		in.close();
		return N;
	}

	public void pcb_Inter(pcb_Structure[] pcbs, int N) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please input the PCB name , priority , runtime (1,2,10):");
		System.out.println();
		for (int i = 0; i < N; i++) {
			System.out.println("Please input the NUmber " + (i + 1) + "\t PCb");
			pcbs[i].name = in.next();
			pcbs[i].priority = in.nextInt();
			pcbs[i].runTime = in.nextInt();
			pcbs[i].state = 'R';
		}
		in.close();
	}

	public int pcb_Priority_confirm(pcb_Structure[] pcbs, int N) {
		int key = 0, max = -10;
		for (int i = 0; i < N; i++) {
			if (pcbs[i].state == 'r')
				return -1;
			else {
				if (pcbs[i].state == 'R' && max < pcbs[i].state) {
					max = pcbs[i].priority;
					key = i;
				}
			}
		}
		if (pcbs[key].state == 'F')
			return -1;
		else
			return key;
	}

	public void pcb_print(pcb_Structure[] pcbs, int N) {
		System.out.println("\npcb_name   priority   runtime   status");
		System.out.println("*********************************************************");
		for (int i = 0; i < N; i++) {
			System.out.println(pcbs[i].name + pcbs[i].priority + pcbs[i].runTime + pcbs[i].state);
		}
	}

	public void pcb_run(pcb_Structure[] pcbs, int N) {
		int t = 0;
		for (int i = 0; i < N; i++) {
			t += pcbs[i].runTime;
		}
		System.out.println("\nNo Pcbs run,Now status:");
		pcb_print(pcbs, N);
		for (int i = 0; i < t; i++) {
			while (pcb_Priority_confirm(pcbs, N) != -1) {
				pcbs[pcb_Priority_confirm(pcbs, N)].state = 'r';
			}
			// 只为寻找其中的一种状态，状态为r
			for (int j = 0; j < N; j++) {
				if (pcbs[j].state == 'r') {
					pcbs[j].runTime--;
					pcbs[i].priority--;
					pcb_print(pcbs, N);

				}
				// 重置所有的状态
				{
					if (pcbs[j].runTime == 0)
						pcbs[j].state = 'F';
					else
						pcbs[j].state = 'R';
				}
			}
		}
	}

	public static void main(String[] args) {
		Pcb_main pcb_main = new Pcb_main();
		int N = pcb_main.pcb_Interlizer();
		pcb_Structure[] pcbs = new pcb_Structure[N];
		//pcb_main.pcb_Inter(pcbs, N);
		//pcb_main.pcb_run(pcbs, N);
		System.out.println("About");
	}
}

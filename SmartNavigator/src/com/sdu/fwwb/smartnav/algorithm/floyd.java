package com.sdu.fwwb.smartnav.algorithm;

import java.util.Scanner;

public class floyd {
	private static int inf = (1 << 29);
	private static int n;
	private static int map[][] = new int[50][50];
	private static int path[][] = new int[50][50];
	private int start;
	private int end;

	Scanner scan = new Scanner(System.in);

	public void cal() {
		for (int k = 0; k < n; k++)
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					if (map[i][k] + map[k][j] < map[i][j]) {
						map[i][j] = map[i][k] + map[k][j];
						path[i][j] = path[k][j];
					}
	}

	public void init() {
		n = scan.nextInt();
		// 初始化map
		for (int i = 0; i < 50; i++)
			for (int j = 0; j < 50; j++)
				map[i][j] = inf;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				map[i][j] = scan.nextInt();
		// 初始化路线
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				if (map[i][j] == inf)
					path[i][j] = -1;
				else
					path[i][j] = i;
		for (int i = 0; i < n; i++)
			path[i][i] = i;
	}
	
	public String out(int s, int e){
		String myPath = e + "";
		while (path[s][e] != s) {
			myPath = path[s][e] + " -> " + myPath;
			e = path[s][e];
		}
		myPath = s + " -> " + myPath;
		return myPath;
	}

	public void run() {
		init();
		cal();
		start = scan.nextInt();
		end = scan.nextInt();
		out(start, end);
	}

//	public static void main(String[] args) {
//		new floyd().run();
//	}
}

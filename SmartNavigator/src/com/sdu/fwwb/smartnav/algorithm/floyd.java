package com.sdu.fwwb.smartnav.algorithm;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sdu.fwwb.smartnav.dao.PointDao;
import com.sdu.fwwb.smartnav.entity.Point;

public class floyd {
	private static double inf = Double.MAX_VALUE;
	private static int path[][] = new int[50][50];
	private int s;
	private int e;
	
	Scanner scan = new Scanner(System.in);

	public void f(int n, double map[][]) {
		// 初始化路线
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= n; j++)
				if (map[i][j] == inf)
					path[i][j] = -1;
				else
					path[i][j] = i;
		for (int i = 1; i <= n; i++)
			path[i][i] = i;
		
		
		for (int k = 1; k <= n; k++)
			for (int i = 1; i <= n; i++)
				for (int j = 1; j <= n; j++)
					if (map[i][k] + map[k][j] < map[i][j]) {
						map[i][j] = map[i][k] + map[k][j];
						path[i][j] = path[k][j];
					}
	}

//	public String out(int s, int e){
//		String myPath = e + "";
//		while (path[s][e] != s) {
//			myPath = path[s][e] + " -> " + myPath;
//			e = path[s][e];
//		}
//		myPath = s + " -> " + myPath;
//		return myPath;
//	}

	
	public String run(int n, double map[][], Point start, Point end) {	
		String result;
		f(n, map);	
		s = Integer.parseInt(start.getName().substring(1));
		e = Integer.parseInt(end.getName().substring(1));	
		
		double dis = map[s][e];
System.out.println("fuck");
		result = Double.toString(dis);
		
		result +="@"+ e;
		while (path[s][e] != s) {
			result += "@" + path[s][e];
			e = path[s][e];
		}
		
		result += "@" + s;
		return result;
	}
}

package TREE.BIT;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class MORDOR {
	static BufferedReader br;
	static BufferedWriter bw;
	static StringBuilder sb;
	
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream(new File("./input.txt")));
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		sb = new StringBuilder();
		
		
		
		br.close();
//		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}

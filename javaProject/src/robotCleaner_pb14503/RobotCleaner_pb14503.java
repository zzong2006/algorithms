package robotCleaner_pb14503;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class RobotCleaner_pb14503 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N, M;
		int [][] map;
		String [] inp = br.readLine().split(" ");
		
		N = stoi(inp[0]);
		M = stoi(inp[1]);
		
		map = new int [N][M];
		boolean[][] isCleaned = new boolean [N][M];
		String [] inp2 = br.readLine().split(" ");
		Robot rb = new Robot(stoi(inp2[1]), stoi(inp2[0]), stoi(inp2[2]));
		for (int i = 0; i < N; i++) {
			inp2 = br.readLine().split(" ");
			for (int j = 0; j < M; j++) {
				map[i][j] = stoi(inp2[j]);
				if(map[i][j] == 1) {
					isCleaned[i][j] = true;
				}
			}
		}
		
		rb.operate(isCleaned, map, N, M);
		
		System.out.println(rb.cleaningTimes);
	}
	public static int stoi(String a) {
		return Integer.parseInt(a);
	}
}

class Robot {
	int x;
	int y;
	int direction;
	//0�� ��쿡�� ������, 1�� ��쿡�� ������, 2�� ��쿡�� ������, 3�� ��쿡�� ������
	int cleaningTimes;
	
	
	public Robot() {
		super();
	}


	public Robot(int x, int y, int direction) {
		super();
		this.x = x;
		this.y = y;
		this.direction = direction;
		this.cleaningTimes = 0;
	}

//	���� ���⿡ ���� û������ ���� ������ �����Ѵٸ�, �� �������� ȸ���� ���� �� ĭ�� �����ϰ� 1������ �����Ѵ�.
//	���� ���⿡ û���� ������ ���ٸ�, �� �������� ȸ���ϰ� 2������ ���ư���.
//	�� ���� ��� û�Ұ� �̹� �Ǿ��ְų� ���� ��쿡��, �ٶ󺸴� ������ ������ ä�� �� ĭ ������ �ϰ� 2������ ���ư���.
//	�� ���� ��� û�Ұ� �̹� �Ǿ��ְų� ���̸鼭, ���� ������ ���̶� ������ �� �� ���� ��쿡�� �۵��� �����.
	
	public void operate(boolean [][] isCleaned, int [][] map, int N, int M) throws Exception {
		boolean stop = false;
		boolean cleaningMode = false;
		boolean movingMode = false;
		int alreadyCleaned = 0;
		while(!stop) {
			// 1. ���� ��ġ�� û���Ѵ�.
			if(!cleaningMode && !isCleaned[this.y][this.x]) {
				isCleaned[this.y][this.x] = true;
				cleaningTimes += 1;
				cleaningMode = true;
				movingMode = false;
			}
			
			// 2. ���� ��ġ���� ���� ������ �������� ���ʹ������ ���ʴ�� Ž���� �����Ѵ�.
			// 2-1. ���� ���⿡ ���� û������ ���� ������ �����Ѵٸ�, �� �������� ȸ���� ���� �� ĭ�� �����ϰ� 1������ �����Ѵ�.
			//0�� ��쿡�� ������, 1�� ��쿡�� ������, 2�� ��쿡�� ������, 3�� ��쿡�� ������
			while(alreadyCleaned < 4 && !movingMode) {
				if(this.detectLeft(isCleaned, map, N, M)) {
					this.rotate();
					this.move();
					movingMode = true;
					cleaningMode = false;
					alreadyCleaned = 0;
				} else {
					this.rotate();
					alreadyCleaned += 1;
				}
			}
			
			if(alreadyCleaned >= 4) {
				alreadyCleaned = 0;
				movingMode = false;
				if(!this.moveBack(N, M, map)) {
					stop = true;
				}
			}
			
			
		}
		
	}
	
	public void rotate() throws Exception {
		//0�� ��쿡�� ������, 1�� ��쿡�� ������, 2�� ��쿡�� ������, 3�� ��쿡�� ������
		switch(this.direction) {
		case 0:
			this.direction = 3;
			break;
		case 1:
			this.direction = 0;
			break;
		case 2:
			this.direction = 1;
			break;
		case 3:
			this.direction = 2;
			break;
		default:
			throw new Exception("Unknown Direction");
		}
	}
	public void move() throws Exception {
		//0�� ��쿡�� ������, 1�� ��쿡�� ������, 2�� ��쿡�� ������, 3�� ��쿡�� ������
		switch(this.direction) {
		case 0:
			this.y -= 1;
			break;
		case 1:
			this.x += 1;
			break;
		case 2:
			this.y += 1;
			break;
		case 3:
			this.x -= 1;
			break;
		default:
			throw new Exception("Unknown Direction");
		}
	}
	public boolean moveBack(int N, int M, int[][] map) throws Exception {
		//0�� ��쿡�� ������, 1�� ��쿡�� ������, 2�� ��쿡�� ������, 3�� ��쿡�� ������
		switch(this.direction) {
		case 0:
			if(this.y + 1 < N && map[this.y + 1][this.x] == 0) {
				this.y += 1;
				return true;
			} else 
				return false;
			
		case 1:
			if(this.x - 1 >= 0 && map[this.y][this.x - 1] == 0) {
				this.x -= 1;
				return true;
			} else 
				return false;
		case 2:
			if(this.y - 1 >= 0 && map[this.y - 1][this.x] == 0) {
				this.y -= 1;
				return true;
			} else 
				return false;
		case 3:
			if(this.x + 1 < M && map[this.y][this.x + 1] == 0) {
				this.x += 1;
				return true;
			} else 
				return false;
		default:
			throw new Exception("Unknown Direction");
		}
	}
	
	public boolean detectLeft(boolean [][] isCleaned, int [][] map, int N, int M) throws Exception {
		switch(this.direction) {
		//0�� ��쿡�� ������, 1�� ��쿡�� ������, 2�� ��쿡�� ������, 3�� ��쿡�� ������
		case 0:
			if(this.x - 1 >= 0 && !isCleaned[this.y][this.x - 1] && map[this.y][this.x - 1] == 0) {
				return true;
			}else {
				return false;
			}
		case 1:
			if(this.y - 1 >= 0 && !isCleaned[this.y - 1][this.x] && map[this.y - 1][this.x] == 0) {
				return true;
			}else {
				return false;
			}
		case 2:
			if(this.x + 1 < M && !isCleaned[this.y][this.x + 1] && map[this.y][this.x + 1] == 0) {
				return true;
			}else {
				return false;
			}
		case 3:
			if(this.y + 1 < N && !isCleaned[this.y + 1][this.x] && map[this.y + 1][this.x] == 0) {
				return true;
			} else {
				return false;
			}
		default :
			throw new Exception("Unknown Direction");
		}
	}
}


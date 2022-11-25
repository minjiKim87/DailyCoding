#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>


int main() {

	int N, K = 0;

	scanf("%d %d", &N, &K);
	//int w[5]; int v[5];
	int w[N + 1];
	int v[N + 1];

	for (int i = 1; i <= N; i++) {
		scanf("%d %d", &w[i], &v[i]);

	}

	int table[N + 2][K + 2];
	for(int i = 0; i <= N + 1; i++) {
		for (int j = 0; j <= K + 1; j++) {
			table[i][j] = 0;
		}
	}
	



	for (int i = 1; i <= N; i++) {
		for (int j = K; j >=1; j--) {
			int temp1 = 0;
			//해당 물건을 담을 경우 = 무조건 최대무게보다 작을때
			if(w[i]<=j)
				temp1 = table[i-1][j - w[i]] + v[i];
			

			//해당 물건을 담지 않을 경우
			int temp2 = table[i - 1][j];

			if (temp1 >= temp2)
				table[i][j] = temp1;
			else
				table[i][j] = temp2;



		}

	}

	printf("%d", table[N][K]);

}
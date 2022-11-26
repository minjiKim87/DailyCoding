#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int comb(int n, int r) {
	if (n == r || r == 0)
		return 1;
	return comb(n - 1, r - 1) + comb(n - 1, r);
}

int main(void)
{
	int N;
	scanf("%d", &N);


	int tmp = 0;
	int sum = 0;

	for (int i = 0; i < N; i++) {
		sum = 0;
		sum += i;
		tmp = i;

		while (tmp != 0) {
			sum += tmp % 10;
			tmp = tmp / 10;
		}

		if (sum == N) {
			printf("%d", i); break;
		}
		else if (i == N - 1) {
			printf("0");
			break;
		}
		//printf("%d\n", sum);
	}


	return 0;
	


}
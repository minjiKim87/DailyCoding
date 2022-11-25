#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

int arr[10000001];



int main() {

	int N;
	scanf("%d", &N);

	//배열
	arr[1] = 1;
	arr[2] = 2;

	for (int i = 3; i <= N; i++) {
		arr[i] = (arr[i - 1] + arr[i - 2]) % 15746;
	}

	printf("%d", arr[N]);

}
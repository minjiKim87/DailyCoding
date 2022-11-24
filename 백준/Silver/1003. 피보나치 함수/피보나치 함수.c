#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

int zero[41] = { 0, }; // 전역변수로 배열 선언하여(메모이제이션)
int one[41] = { 0, };

void fibonacci(int n)
{
	if (n == 0)
	{
		zero[n] = 1;
		one[n] = 0;
	}
	else if (n == 1)
	{
		zero[n] = 0;
		one[n] = 1;
	}
	else if (zero[n] == 0 && one[n] == 0) //메모이제이션이 안 된 n
	{
		fibonacci(n - 1);
		fibonacci(n - 2);
		zero[n] = zero[n - 1] + zero[n - 2]; // zero 배열 메모이제이션
		one[n] = one[n - 1] + one[n - 2]; // one 배열 메모이제이션
	}
}

int main()
{
	int T;
	int N;
	scanf("%d", &T);

	for (int i = 0; i < T; i++) {
		scanf("%d", &N);
		fibonacci(N);

		printf("%d %d\n", zero[N],one[N] );
	}

}
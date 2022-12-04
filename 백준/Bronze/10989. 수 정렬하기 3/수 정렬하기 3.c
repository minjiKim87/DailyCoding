#include <stdio.h>

#define size 10001

int cnt[size] = { 0, };

int main() {
	int N, num;

	scanf("%d", &N);
	for (int i = 0; i < N; i++) {
		scanf("%d", &num);
		cnt[num]++;
	}

	for (int i = 0; i <= size; i++) {
		if (cnt[i] == 0)
			continue;
		
		for (int j = 0; j < cnt[i]; j++)
			printf("%d\n", i);
	}

	return 0;
}
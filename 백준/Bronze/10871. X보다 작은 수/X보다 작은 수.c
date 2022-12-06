#include <stdio.h>

int main(void) {
    int N, X;
    scanf("%d %d", &N, &X);
    int arr[N];

    for (int i = 0; i < N; i++) {
        scanf("%d", &arr[i]);
    }

    for (int i = 0; i < N; i++) {
        if (X > arr[i])printf("%d ", arr[i]);
    }

}
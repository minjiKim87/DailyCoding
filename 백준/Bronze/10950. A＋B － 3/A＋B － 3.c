#include <stdio.h>

int main(void) {
    int T=0;
    scanf("%d", &T);
    int arr[T];
    int arr2[T];

    for (int i = 0; i < T; i++) {
        scanf("%d %d", &arr[i], &arr2[i]);
    }

    for (int i = 0; i < T; i++) {
        printf("%d\n", arr[i] + arr2[i]);
    }

}
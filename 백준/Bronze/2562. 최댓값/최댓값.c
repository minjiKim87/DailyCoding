#include <stdio.h>

int main(void) {
    int arr[9];
    int lar = 0;;
    int cnt = 0;
    for (int i = 0; i < 9; i++) {
        scanf("%d", &arr[i]);
        if (arr[i] >= lar) {
            lar = arr[i];
            cnt = i+1;
        }
    }

    printf("%d\n%d", lar, cnt);
}
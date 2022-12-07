#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void)
{
    int t;
    char s[20];
    int R;

    scanf("%d", &t);
    
    for (int i = 0; i < t; i++) {
        scanf("%d %s",&R, s);
      
            for (int i = 0; i < strlen(s); i++) {
                for (int j = 0; j < R; j++) {
                    printf("%c", s[i]);
                }
            }
        
            printf("\n");
    }

    return 0;

}
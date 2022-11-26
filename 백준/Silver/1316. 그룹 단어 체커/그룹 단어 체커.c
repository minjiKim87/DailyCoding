#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void)
{
	int tc = 0;
	char st[100] = { 0 };
	scanf("%d", &tc);
	
	int tmp = 0;

	int cnt = 0;
	int con = 0;

	for (int i = 0; i < tc; i++) { 
		con = 0;
		for (int k = 0; k < 100; k++) {
			st[k] = '\0';
		}
		scanf("%s", st);
		
		if (strlen(st) == 1) {
			con = 0;
		}
		else {
			for (int j = 0; j < strlen(st) - 1; j++) {

				if (st[j] == st[j + 1]) {
					con;//안변해
				}
				else {
					if (j >= 1) {
						for (int k = j - 1; k >= 0; k--) {
							if (st[j + 1] == st[k]) {
								con = 1;
							}
						}
					}
				}

			}
		}

		if (con == 0)cnt++;
	}

	printf("%d", cnt);
}
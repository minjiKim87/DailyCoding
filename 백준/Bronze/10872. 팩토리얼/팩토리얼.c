#include <stdio.h>

int main(){
int N;
scanf("%d", &N);

int output=1;
for(int i =1;i<=N;i++){
output*=i;
}

printf("%d", output);

}